package Exemplo1;

public class Teste {

public static void main  (String[] args) {
	
	Inimigo inimigo = new Inimigo(300,"Turma da tarde");
	inimigo.setChance(true);
	inimigo.setNuclear(false);
	
	Guerra senai = new Guerra(inimigo);
	senai.DefinirEstrategia();
	senai.declararGuerra();
	senai.encerrarGuerra();

	
	
}
}
