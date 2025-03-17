package dip.solucao;

import srp_principio.violacao.Pedido;

public class Main {

	public static void main(String[] args) {
	
		PostgresRepository pgRepo = new PostgresRepository();
		OracleRepository oracleRepository = new OracleRepository();
		EnviarEmailConfirmacao sendMail = new EnviarEmailConfirmacao();
		
		Pedido pedido = new Pedido();
		
		ProcessaPedido processaPedido = new ProcessaPedido(pgRepo, sendMail); 
		
		processaPedido.processar(new Pedido());
	}
}
