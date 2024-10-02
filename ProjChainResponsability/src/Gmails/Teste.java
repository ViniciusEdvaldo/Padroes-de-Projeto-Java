package Gmails;

public class Teste {

	public static void main(String[] args) {
		
		OutlookHandler e3 = new OutlookHandler();
		YahooHandler e2 = new YahooHandler(e3);
		GmailHandler e1 = new GmailHandler(e2);
		
		ClienteEmail c1 = new  ClienteEmail(e1);
		
		Email em1 = new Email("amsmk@gmail.com","wagner@yahoot.com");
        c1.verificarEmail(em1);
	}

}
