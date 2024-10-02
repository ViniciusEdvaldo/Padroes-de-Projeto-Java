package Praticando;

public class Singleton {

	private String nome;
	private static Singleton instancia = null;
	
	private Singleton() {
		this.nome = "rosivaldo";
	}
	
	public static Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
		} return instancia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
