package Enem;
import java.util.ArrayList;

public class Bloco implements Componente {
 
	private ArrayList<Componente> questoes;
	
	public Bloco() {
		this.questoes = new ArrayList<Componente>();
	}
	
	
	public void adicionarItens(Componente c) {
		this.questoes.add(c);
	}
	
	public void removerItens(Componente c) {
		this.questoes.remove(c);
	}
	
	@Override
	public double getvalor() {
		double valorTotal = 0;
		for(int i=0;i<questoes.size();i++) {
			valorTotal += questoes.get(i).getvalor();
		}
		return valorTotal;
	}

	
}
