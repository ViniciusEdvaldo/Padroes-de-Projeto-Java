package Exemplo1;

public class ConcretoColleague extends Colleague {

	public ConcretoColleague(Mediator m) {
		super(m);
		
	}
	

	@Override
	public void receiver(String menssagem) {
		System.out.println("Colleague received: "+ menssagem);
		
	}

}
