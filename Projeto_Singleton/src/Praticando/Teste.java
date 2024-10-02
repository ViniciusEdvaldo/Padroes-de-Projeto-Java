package Praticando;

public class Teste {

	public static void main(String[] args) {
	
		Singleton instancia1 = Singleton.getInstancia();
        
		System.out.println(instancia1.getNome());
		
	}

}
