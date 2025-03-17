package dip.solucao;

import srp_principio.violacao.Pedido;
import srp_principio.violacao.SmtpGmail;

public class EnviarEmailConfirmacao implements IEnvioEmailRepository{

	public void enviarEmailConfirmacao(Pedido pedido) {
		SmtpGmail smtp = new SmtpGmail("usuarioSmtp", "senhaSmtp");
		String nome = pedido.getNomeCliente();
		String email = pedido.getEmailCliente();
		
		String html = "Caro cliente ".concat(nome).concat(", Seu Pedido ")
				.concat(pedido.getId().toString().concat(" foi confirmado"));
		
		smtp.enviar(html, email);
	}
}