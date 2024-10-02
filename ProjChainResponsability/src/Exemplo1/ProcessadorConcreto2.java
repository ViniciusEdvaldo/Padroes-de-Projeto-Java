package Exemplo1;

public class ProcessadorConcreto2 implements Processador{

Processador sucessor;
	
	public ProcessadorConcreto2(Processador s) {
		this.sucessor =s;
	}
	
	public void processarRequisicao(double valor) {
		if(valor>4000 && valor >=100000) {
			System.out.println("A requisição passou pelo objeto dois e foi atendido completamente");
		}else {
			this.sucessor.processarRequisicao(valor);
		}
	}
}
