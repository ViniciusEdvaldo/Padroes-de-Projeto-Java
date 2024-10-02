package Exemplo1;

public class ProcessadorConcreto3 implements Processador {

	
	public void processarRequisicao(double valor) {
		if(valor>100000) 
			System.out.println("A requisição passou pelo objeto um e foi atendido completamente");
		else 
			System.out.println("continue jutando! requisicao nao pode ser atendida ");
		
	}
	}
