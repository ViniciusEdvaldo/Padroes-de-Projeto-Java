package Escola;
import java.util.*;

public class EscolaVirtual extends EscolaSenai {
 
	private ArrayList<MateriasGratuitos> materias;
	private ArrayList<EventoEspecial> eventos;
	
	public EscolaVirtual(){
		this.eventos = new ArrayList<EventoEspecial>();
		this.materias = new ArrayList<MateriasGratuitos>();
	}
	
	public void adicionarMaterial(MateriasGratuitos m) {
		this.materias.add(m);
		notificarMaterial();
	}
	
	public void adicionarEvento(EventoEspecial e) {
		this.eventos.add(e);
		notificarEvento();
	}
}
