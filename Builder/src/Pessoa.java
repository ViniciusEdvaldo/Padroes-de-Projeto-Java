
public class Pessoa {
	
   private String nome;
   private String sobrenome;
   private int idade;
   private String genero;
   private String cpf;
   
public static class PessoaBuilder{
	
	 private String nome;
	 private String sobrenome;
     private int idade;
	 private String genero;
	 private String cpf;
	 
	 
	 public PessoaBuilder nome(String nome) {
		 this.nome = nome;
		 return this;
	 }
	 
	 public PessoaBuilder sobrenome(String sobrenome) {
		 this.sobrenome = sobrenome;
		 return this;
	 }
	 
	 public PessoaBuilder idade(int idade) {
		 this.idade = idade;
		 return this;
	 }
	 
	 public PessoaBuilder genero(String genero) {
		 this.genero = genero;
		 return this;
	 }
	 
	 public PessoaBuilder cpf(String cpf) {
		 this.cpf = cpf;
		 return this;
	 }
	 
	 public Pessoa build() {
		 return new Pessoa(this);
	 }
   }

private Pessoa(PessoaBuilder builder) {
	this.nome = builder.nome;
	this.sobrenome = builder.sobrenome;
	this.idade = builder.idade;
	this.genero = builder.genero;
	this.cpf = builder.cpf;
}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public String getCpf() {
		return cpf;
	}
}
