package Temperatura;

public class Teste {

	public static void main(String[] args) {
	SensorTemperatura sensor = new SensorTemperatura();
	ArCondicionado ar = new ArCondicionado(sensor);
	Aquecedor aque = new Aquecedor(sensor);
	
	sensor.adicionarAparelho(aque);
	sensor.adicionarAparelho(ar);
	sensor.AtualizarTemperatura(16);
	sensor.AtualizarTemperatura(32);
	}

}
