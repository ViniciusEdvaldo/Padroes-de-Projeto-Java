package ALEXA;

public class LigarLuzComando implements ComandoVoz{

	// classe command concreto
	
	private Funcionalidades funcao;
	
	public LigarLuzComando(Funcionalidades f) {
		this.funcao = f;
	}
	
	@Override
	public void executar() {
	funcao.Luz();	
		
	}

}
