package Exemplo1;

//Contexto

public class Guerra {
 
	private Estrategia acao;
    private Inimigo inimigo;
    
    public Guerra(Inimigo i) {
    	this.inimigo =i;
    }
    
    public void DefinirEstrategia() {
    	if(inimigo.getQuantidade()>10000) {
    		acao = new AliancaVizinha();
    	} else if(inimigo.isNuclear()) {
    		acao = new Diplomacia();
    	} else if(inimigo.isChance()) {
    		acao = new AtacarSozinho();
    	}
    }

    public void declararGuerra() {
    	acao.atacar();
    }
    public void encerrarGuerra() {
    	acao.concluir();
    }
}
