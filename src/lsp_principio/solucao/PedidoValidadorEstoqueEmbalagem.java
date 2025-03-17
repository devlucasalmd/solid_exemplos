package lsp_principio.solucao;

import lsp_principio.violacao.Item;
import lsp_principio.violacao.Pedido;
import lsp_principio.violacao.PedidoValidadorEstoque;

public class PedidoValidadorEstoqueEmbalagem extends PedidoValidadorEstoque{

	  @Override
	    public boolean isValid(Pedido pedido) {
	        for (Item item : pedido.getItens()) {
	            if (!item.emEstoque()) {
	                return false;
	            }

	            if (!item.foiEmbalado()) {
	                // LOG do erro - Não quebrar o contrato da herança
	                return false;
	            }
	        }
	        return true;
	  }
}
