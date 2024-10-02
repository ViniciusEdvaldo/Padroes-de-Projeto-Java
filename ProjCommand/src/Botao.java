
public class Botao {

	private Command comando;

	public void clicar() {
		comando.execucao();
	}

	public void setComando(Command comando) {
		this.comando = comando;
	}
	
	
}
