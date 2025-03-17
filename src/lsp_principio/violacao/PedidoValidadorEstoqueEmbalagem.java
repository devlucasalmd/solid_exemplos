package lsp_principio.violacao;

public class PedidoValidadorEstoqueEmbalagem extends PedidoValidadorEstoque {

	@Override
	public boolean isValid(Pedido pedido) {
		for(Item item : pedido.getItens()) {
			if(!item.emEstoque()) {
				return false;
			}
			
			if(!item.foiEmbalado()) {
				throw new RuntimeException("Item não foi embalado");
			}
		}
		return true;
	}
}
