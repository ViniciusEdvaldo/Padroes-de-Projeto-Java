package Gmails;

public class GmailHandler implements EmailHandler{

	private EmailHandler sucessor;
	
	public GmailHandler(EmailHandler e){
		this.sucessor =e;
	}

	@Override
	public void verificaEmail(Email email) {
		if(email.getEnderecoDestino().endsWith("@gmail.com")) {
			System.out.println("Gmail armazenada na caixa de entrada");
		}else {
			sucessor.verificaEmail(email);
		}
		
	}
	
	
}
