package dip.violacao;

import srp_principio.violacao.Pedido;

public class Main {

	public static void main(String[] args) {
		ProcessaPedido processaPedido = new ProcessaPedido(); 
		
		processaPedido.processar(new Pedido());
	}
}
