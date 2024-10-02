package Exemplo1;

public class ProcessadorConcreto1 implements Processador {

	Processador sucessor;
	
	public ProcessadorConcreto1(Processador s) {
		this.sucessor =s;
	}
	
	public void processarRequisicao(double valor) {
		if(valor>100 && valor >=4000) {
			System.out.println("A requisição passou pelo objeto um e foi atendido completamente");
		}else {
			this.sucessor.processarRequisicao(valor);
		}
	}
}
