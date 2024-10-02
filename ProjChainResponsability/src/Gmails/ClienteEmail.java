package Gmails;

public class ClienteEmail {

	private EmailHandler email;
	
	public ClienteEmail(EmailHandler e) {
		this.email =e;
	}
	
	public void verificarEmail(Email e) {
		this.email.verificaEmail(e);
	}
	
}
