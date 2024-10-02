package Temperatura;

public class Aquecedor implements Obsever{

	private boolean ligado;
	private SensorTemperatura sensorTemperatura;
	
	public Aquecedor(SensorTemperatura sensor) {
		this.sensorTemperatura =sensor;
		this.ligado = false;
	}
	
	@Override
	public void atualizar() {
		double temperatura = sensorTemperatura.getTemperatura();
		if(temperatura<=16) {
			ligado =true;
			System.out.println("Aquecedor ligado");
		}else {
			ligado = false;
			System.out.println("Aquecedor desligado");
		}
	}


	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
