
public class Teste {

	public static void main(String[] args) {
		
		lojaVirtual loja1 = new lojaVirtual();
		
		ComandoCriarOferta comandoOferta = new ComandoCriarOferta(loja1);
		ComandoBuscarProduto comandoBuscar = new ComandoBuscarProduto(loja1);
		ComandoFecharLoja comandoFechar = new ComandoFecharLoja(loja1);

		Botao botaoFechar = new Botao();
        Botao botaoBuscar = new Botao();
        Botao botaoCriarOferta = new Botao();

        botaoFechar.setComando(comandoFechar);
        botaoBuscar.setComando(comandoBuscar);
        botaoCriarOferta.setComando(comandoOferta);
        
        botaoFechar.clicar();
        
	}

}
