package Exemplo1;

public class Teste {

	public static void main(String[] args) {
		
		ApplicationMediator mediator = new ApplicationMediator();
		
		Colleague desktop = new ConcretoColleague(mediator);
		Colleague mobile = new MobileColleague(mediator);
		
		
		mediator.addColleague(mobile);
		mediator.addColleague(desktop);
		mobile.send("ola");
		desktop.send("ola mobile");
		
		
	}

}
