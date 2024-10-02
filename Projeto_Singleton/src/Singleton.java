
public class Singleton {
private int dados;
private static Singleton instancia = null;

private Singleton() {
	dados = 1234;
}
public static Singleton GetInstancia() {
	if(instancia == null) {
		instancia= new Singleton(); System.out.println("objeto criado");
} 
	return instancia;
}

public int retornaInformação(){
	return dados;
}
}
