package Exemplo1;

public abstract  class Colleague {

	private Mediator mediator;
	
	public Colleague(Mediator m) {
		this.mediator =m;
	}
	
	public void send(String mensagem) {
		mediator.send(mensagem, this);
	}
	
	public Mediator GetMediator() {
		return mediator;
	}
	
	public abstract void receiver(String menssagem); 
}
