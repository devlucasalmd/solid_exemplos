package srp_principio.violacao;

public class ProcessaPedido {
	
	public Pedido processar(Pedido pedido) {
		boolean persistidoBanco = salvar(pedido);
		
		if(pedido.isValid() && persistidoBanco) {
			enviarEmailConfirmacao(pedido);
		}
		
		return pedido;
	}
	
	private boolean salvar(Pedido pedido) {
		ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");
		
		try {
			dbConnection.salvar(pedido);
		} catch (Exception e) {
			return false;
		}		
		return true;
	}
	
	private void enviarEmailConfirmacao(Pedido pedido) {
		SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
		String nome = pedido.getNomeCliente();
		String email = pedido.getEmailCliente();
		
		String html = "Caro cliente ".concat(nome).concat(", Seu Pedido")
				.concat(pedido.getId().toString().concat(" foi confirmado"));
		
		smtp.enviar(html, email);
	}
}
