
public class ComandoBuscarProduto implements Command {

private lojaVirtual loja;
	
	public ComandoBuscarProduto(lojaVirtual l) {
		this.loja =l;
	}
	
	@Override
	public void execucao() {
		loja.buscarProduto();
		
	}

}
