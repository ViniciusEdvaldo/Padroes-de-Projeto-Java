package Exemplo1;

public class MobileColleague extends Colleague{

	public MobileColleague(Mediator m) {
		super(m);
		
	}

	@Override
	public void receiver(String mensagem) {
		System.out.println("Mobile received: " + mensagem);
	}
	
}
