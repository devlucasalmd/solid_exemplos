package ocp_principio.violacao;


import srp_principio.solucao.EnviarEmailConfirmacao;
import srp_principio.solucao.PostgresRepository;
import srp_principio.violacao.Pedido;

public class ProcessaPedido {

	public void processar(Pedido pedido) {
		
		if(!pedido.possuiItens()) {
			throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
		}
		PostgresRepository pgRepo = new PostgresRepository();
		EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
		
		pedido.setNomeCliente("Fulano");
		pedido.setEmailCliente("fulano@gmail.com");
		pedido.setId(47);
		
		pgRepo.salvar(pedido);
		
		enviarEmail.enviarEmailConfirmacao(pedido);
		
		if(pedido.isValid()) {
			throw new RuntimeException("Não é possível continuar! Pedido sem Id");
		}
	}
}
