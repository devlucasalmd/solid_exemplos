package dip.violacao;

import srp_principio.solucao.EnviarEmailConfirmacao;
import srp_principio.solucao.PostgresRepository;
import srp_principio.violacao.Pedido;

public class ProcessaPedido {

	public void processar(Pedido pedido) {
		PostgresRepository pgRepo = new PostgresRepository();
		OracleRepository oracleRepo = new OracleRepository();
		EnviarEmailConfirmacao enviarEmail = new EnviarEmailConfirmacao();
		boolean isOracle = false;
		
		pedido.setNomeCliente("Fulano");
		pedido.setEmailCliente("fulano@gmail.com");
		pedido.setId(47);
		
		if(isOracle) {
			oracleRepo.salvar(pedido);
		}else {
			pgRepo.salvar(pedido);			
		}
		
		enviarEmail.enviarEmailConfirmacao(pedido);
	}
}
