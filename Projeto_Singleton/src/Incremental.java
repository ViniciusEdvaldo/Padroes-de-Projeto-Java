
public class Incremental {
private static int contador=0;
private  int numero;
private static Incremental instancia=null;

private Incremental() {
	numero = ++contador;
}

public  String toString() {
	return "Incremental " + numero;
}

public static Incremental getInstancia() {
  if(instancia == null) {
	   instancia = new Incremental();
  } return instancia;
}

}
