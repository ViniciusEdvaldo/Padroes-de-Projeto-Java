
public class Teste {

	public static void main(String[] args) {
		
		Pessoa.PessoaBuilder b1 = new Pessoa.PessoaBuilder();
		b1.nome("Maria");
		b1.sobrenome("Silva");
		b1.idade(15);
		b1.genero("Feminino");
		
    Pessoa pessoa = b1.build();
   
    

      System.out.println( pessoa.getGenero());
	}

}
