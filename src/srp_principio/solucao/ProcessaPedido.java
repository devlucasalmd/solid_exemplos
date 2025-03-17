package srp_principio.solucao;

import srp_principio.violacao.Pedido;

public class ProcessaPedido {

	public void processar(Pedido pedido) {
		PostgresRepository pgRepo = new PostgresRepository();
		EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
		
		pedido.setNomeCliente("Fulano");
		pedido.setEmailCliente("fulano@gmail.com");
		pedido.setId(47);
		
		pgRepo.salvar(pedido);
		
		enviarEmail.enviarEmailConfirmacao(pedido);
	}
}
