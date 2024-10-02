
public class Teste {

	public static void main(String[] args) {
//	 Singleton novo = Singleton.GetInstancia();
 //Singleton novo1 = Singleton.GetInstancia();
 //System.out.println(novo1.retornaInformação());
 
 for(int i=0; i<10; i++) {
	 Incremental inc =  Incremental.getInstancia();
	System.out.println(inc);
 }


	}

}
