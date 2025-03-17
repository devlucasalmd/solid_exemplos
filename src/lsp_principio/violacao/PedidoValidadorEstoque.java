package lsp_principio.violacao;

public class PedidoValidadorEstoque {

	public boolean isValid(Pedido pedido) {
		for(Item item : pedido.getItens()) {
			if(!item.emEstoque()) {
				return false;
			}
		}
		return true;
	}
}
