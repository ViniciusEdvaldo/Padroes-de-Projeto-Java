
public class ComandoCriarOferta implements Command {

private lojaVirtual loja;
	
	public ComandoCriarOferta(lojaVirtual l) {
		this.loja =l;
	}
	
	@Override
	public void execucao() {
		loja.criarOferta();
		
	}
}
