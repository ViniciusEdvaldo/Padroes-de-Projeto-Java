package Exemplo1;

public class AliancaVizinha implements Estrategia {

	public void atacar() {
		vizinhoNorte();
		atacarSul();
	}

	public void concluir() {
		dividirReconstrucao();
		dividiBeneficio();
	}
	
	private void dividirReconstrucao() {
	System.out.println("dividir reconstrução ");	
	}
	private void dividiBeneficio() {
		System.out.println("dividindo beneficios");
	}
	private void atacarSul() {
		System.out.println("atacando pelo sul");
	}
	private void vizinhoNorte() {
		System.out.println("aliança com o norte");
	}
	
}
