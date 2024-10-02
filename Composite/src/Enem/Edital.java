package Enem;

public class Edital {

	private Bloco bloco;
	private String nome;
	private double valor=0;
	
	public Edital(String n) {
	
		this.nome =n;
	}
	
	public void adicionarBloco(Bloco b) {
		this.bloco=b;
	}
	
	public double calcularValor() {
		valor = bloco.getvalor();
		return valor;
	}

}
