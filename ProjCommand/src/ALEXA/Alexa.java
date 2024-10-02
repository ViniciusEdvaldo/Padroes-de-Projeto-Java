package ALEXA;

public class Alexa {

	// classe invoker 
	
	private ComandoVoz comando;
	
	public void alexaFaleComigo(){ 
		comando.executar();
	}
	
	public void setComando(ComandoVoz c) {
		this.comando =c;
	}
	
}
