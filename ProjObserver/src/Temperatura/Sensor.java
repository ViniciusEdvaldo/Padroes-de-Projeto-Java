package Temperatura;
import java.util.ArrayList;

public abstract class Sensor {
	
	private ArrayList<Obsever> aparelhos;

	public Sensor() {
		this.aparelhos = new ArrayList<Obsever>();
	}
	
	public void adicionarAparelho(Obsever o) {
		this.aparelhos.add(o);
	}
	
	public void notificar() {
		for(int i=0; i<aparelhos.size();i++) {
	      aparelhos.get(i).atualizar();
		}
	}
}
