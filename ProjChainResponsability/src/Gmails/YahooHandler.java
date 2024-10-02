package Gmails;

public class YahooHandler implements EmailHandler{

	private EmailHandler sucessor;
	
	public YahooHandler(EmailHandler e){
		this.sucessor =e;
	}

	@Override
	public void verificaEmail(Email email) {
		if(email.getEnderecoDestino().endsWith("@yahoot.com")) {
			System.out.println("Yahoot armazenada na caixa de entrada");
		}else {
			sucessor.verificaEmail(email);
		}
		
	}
}
