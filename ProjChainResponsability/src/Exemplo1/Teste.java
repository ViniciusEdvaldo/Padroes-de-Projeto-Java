package Exemplo1;

public class Teste {

	public static void main(String[] args) {
	
		ProcessadorConcreto3 p3 = new ProcessadorConcreto3();
		ProcessadorConcreto2 p2 = new ProcessadorConcreto2(p3);
		ProcessadorConcreto2 p1 = new ProcessadorConcreto2(p2);
		Cliente c1 = new Cliente(p1);
		
		c1.processarRequisicao(100);

	}

}
