
public class Teste {

	public static void main(String[] args) {
		SujeitoConcreto sujeito = new SujeitoConcreto(); // objeto obsevado
		Observador observador1 = new ObservadorConcreto(sujeito);
		Observador observador2 = new ObservadorConcreto(sujeito);

		sujeito.cadastrar(observador1); // cadastre do objeto1 na lista de observadores 
		sujeito.cadastrar(observador2);  
		
		sujeito.setInformacao("promoção 4000");
		sujeito.notificar();
		
		sujeito.setInformacao("PROMOÇÃO 3500");
		sujeito.notificar();
	}

}
