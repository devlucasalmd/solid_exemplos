package srp_principio.solucao;

import srp_principio.violacao.Pedido;
import srp_principio.violacao.SmtpGmail;

public class EnviarEmailConfirmacao {

	public void enviarEmailConfirmacao(Pedido pedido) {
		SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
		String nome = pedido.getNomeCliente();
		String email = pedido.getEmailCliente();
		
		String html = "Caro cliente ".concat(nome).concat(", Seu Pedido ")
				.concat(pedido.getId().toString().concat(" foi confirmado"));
		
		smtp.enviar(html, email);
	}
}
