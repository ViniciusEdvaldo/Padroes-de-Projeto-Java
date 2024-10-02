package Exemplo1;

public class Cliente {

	Processador processador;
	
	public Cliente(Processador p) {
		this.processador = p;
	}
	
	public void processarRequisicao(double valor ) {
		this.processador.processarRequisicao(valor);
	}
}
