package ALEXA;

public class ChecarTemperaturaComando implements ComandoVoz {

	// classe command concreto
	
	private Funcionalidades funcao;
	
	public ChecarTemperaturaComando(Funcionalidades f) {
		this.funcao =f;
	}

	@Override
	public void executar() {
		funcao.ChecarTemperatura();
		
	}
}
