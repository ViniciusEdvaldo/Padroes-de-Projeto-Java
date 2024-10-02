package ALEXA;

public class FazerPiadaComando implements ComandoVoz {

	// classe command concreto
	
	private Funcionalidades funcao;
	
	public FazerPiadaComando(Funcionalidades f) {
		this.funcao =f;
	}
	
	@Override
	public void executar() {
		funcao.fazerPiada();
	}
	
}
