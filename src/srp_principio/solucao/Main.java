package srp_principio.solucao;

import srp_principio.violacao.Pedido;

public class Main {

	public static void main(String[] args) {
		
		ProcessaPedido processaPedido = new ProcessaPedido();
		Pedido pedido = new Pedido();
		
		processaPedido.processar(pedido);

	}

}
