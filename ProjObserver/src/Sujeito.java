import  java.util.List;
import  java.util.ArrayList;

public abstract class Sujeito {

	protected List<Observador> observadores;
	
	public  Sujeito() {
		observadores = new ArrayList<Observador>();
	}
	
	public void cadastrar(Observador  observador) {
		this.observadores.add(observador);
	}
	
	public void remove(Observador obs) {
		this.observadores.remove(obs);
	}
	
	public void notificar() {
		for(int i=0; i<this.observadores.size();i++) {
			System.out.println("Objeto ("+ i + ") notificado:\n");
			this.observadores.get(i).atualizar();
		}
	}
}
