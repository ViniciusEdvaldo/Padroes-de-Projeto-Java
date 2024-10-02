package Exemplo1;

public class Diplomacia implements Estrategia {

public void atacar() {	
	recuarTropas();
	proporCooperacao();
}
	
public void concluir() {	
	desarmarInimigo();
}
	
public void proporCooperacao() {
	System.out.println("proprondo cooperação");
}
	
public void recuarTropas() {
	System.out.println("recuando tropas");
}

public void desarmarInimigo() {
	System.out.println("desarmando inimigo ");
}

}
