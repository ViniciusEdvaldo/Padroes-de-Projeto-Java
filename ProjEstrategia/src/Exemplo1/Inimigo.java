package Exemplo1;

public class Inimigo {

	private int quantidade;
	private boolean nuclear;
	private boolean chance;
	private String nome;
    
	public Inimigo(int q,String n) {
		this.quantidade =q;
		this.nome =n;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isNuclear() {
		return nuclear;
	}

	public void setNuclear(boolean nuclear) {
		this.nuclear = nuclear;
	}

	public boolean isChance() {
		return chance;
	}

	public void setChance(boolean chance) {
		this.chance = chance;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
