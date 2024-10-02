package Exemplo1;

public class AtacarSozinho implements Estrategia{

	public void atacar() {
		derrubarGoverno(); 
		soltarBombas();
		plantarEvidencias();
	}
	
	public void concluir() {
		estabelecerGoverno();
	}
	
	public void derrubarGoverno() {
		System.out.println("Derrubando o lula");
	}
	
	public void soltarBombas() {
		System.out.println("Soltando bombas");
	}
	
	public void plantarEvidencias() {
		System.out.println("Plantando evidencias falsas");
	}
	
	public void estabelecerGoverno() {
		System.out.println("Estabelecer governo amigo");
	}
}
