package Gmails;

public class OutlookHandler implements EmailHandler {

	@Override
	public void verificaEmail(Email email) {
		if(email.getEnderecoDestino().endsWith("@outlook.com")) {
			System.out.println("outlook armazenada na caixa de entrada");
		}else {
			System.out.println("falha ao enviar");
		}
		
	}

	
}
