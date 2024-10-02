
public class ComandoFecharLoja implements Command {

	private lojaVirtual loja;
	
	
	public ComandoFecharLoja(lojaVirtual l) {
		this.loja =l;
	}
	
	@Override
	public void execucao() {
		loja.fecharLoja();
		
	}

	
}
