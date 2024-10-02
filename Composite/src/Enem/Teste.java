package Enem;

public class Teste {

	public static void main(String[] args) {
		Questoes q1 = new Questoes("quetsao 1",2);
		Questoes q2 = new Questoes("questao 2",5);
		Questoes q3 = new Questoes("questao 3",10);
		
		Bloco b1 = new Bloco();
		Bloco b2 = new Bloco();
		Bloco geral = new Bloco();
		b1.adicionarItens(q1);
		b1.adicionarItens(q2);
		b2.adicionarItens(q3);
		geral.adicionarItens(b2);
		geral.adicionarItens(b1);
		
		Edital caixa = new Edital("Caixa");
		caixa.adicionarBloco(geral);
	System.out.println(caixa.calcularValor());	

	}

}
