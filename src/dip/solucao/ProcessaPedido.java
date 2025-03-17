package dip.solucao;

import srp_principio.solucao.EnviarEmailConfirmacao;
import srp_principio.solucao.PostgresRepository;
import srp_principio.violacao.Pedido;

public class ProcessaPedido {
		
		private IBancoDadosRepository dbRepo;
		private IEnvioEmailRepository mailRepo;
		
		public ProcessaPedido(IBancoDadosRepository dbRepo, IEnvioEmailRepository mailRepo) {
			this.dbRepo = dbRepo;
			this.mailRepo = mailRepo;
		}
		public void processar(Pedido pedido) {		

			pedido.setNomeCliente("Fulano");
			pedido.setEmailCliente("fulano@gmail.com");
			pedido.setId(47);
			
			dbRepo.salvar(pedido);
			
			mailRepo.enviarEmailConfirmacao(pedido);
		}
}
