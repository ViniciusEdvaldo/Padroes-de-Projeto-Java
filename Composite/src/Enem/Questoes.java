package Enem;

public class Questoes implements Componente {

	private String nome;
	private double valor;
	
	public Questoes (String nome,double v){
		this.nome=nome;
		this.valor=v;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double getvalor() {
	
		return valor;
	}

	
}
