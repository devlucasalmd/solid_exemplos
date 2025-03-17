package srp_principio.violacao;

public class SmtpGmail {

	public SmtpGmail(String usuario, String senha) {
		
	}
	
	public void enviar(String html, String mail) {
		System.out.println("Enviando e-mail de confirmação: ".concat(html));
	}
}
