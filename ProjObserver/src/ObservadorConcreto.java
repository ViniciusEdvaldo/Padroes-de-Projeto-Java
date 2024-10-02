
public class ObservadorConcreto implements Observador{
	
	private SujeitoConcreto concreto;
	private String dadosObsevador;
	
	public ObservadorConcreto(SujeitoConcreto concreto) {
		this.concreto =concreto;
	}
	
	public void atualizar() {
		this.dadosObsevador = concreto.getInformacao();
		System.out.println("Notificação - " + dadosObsevador + "\n" );
	}
 
	public void setConcreto(SujeitoConcreto concreto) {
		this.concreto =concreto;
	}
}
