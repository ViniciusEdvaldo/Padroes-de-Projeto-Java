package ALEXA;

public class Teste {

	public static void main(String[] args) {
	
      // classe cliente 
		
		Funcionalidades fun1 = new Funcionalidades();
		Alexa alexa = new Alexa();
		
		FazerPiadaComando piada = new FazerPiadaComando(fun1);
		ChecarTemperaturaComando temperatura = new ChecarTemperaturaComando(fun1);
		LigarLuzComando luz = new LigarLuzComando(fun1);
		
		
		alexa.setComando(luz); 
		alexa.alexaFaleComigo();
		
	
		
	
 

	}

}
