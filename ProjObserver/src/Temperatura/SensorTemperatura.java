package Temperatura;

public class SensorTemperatura extends Sensor{

	private double temperatura;
	
	public SensorTemperatura(){
	 	this.temperatura = 0;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void AtualizarTemperatura(double temperatura) {
		this.temperatura = temperatura;
        notificar();	
	}
	
}
