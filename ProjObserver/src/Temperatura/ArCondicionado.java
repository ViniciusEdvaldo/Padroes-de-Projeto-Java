package Temperatura;

public class ArCondicionado implements Obsever {
	
	private boolean ligado;
	private SensorTemperatura sensor;
	
  public ArCondicionado(SensorTemperatura sensor) {	
	  this.sensor = sensor;
	  this.ligado = false;
  }
	
	
	
	@Override
	public void atualizar() {
		double temperatura = sensor.getTemperatura();
		this.sensor.getTemperatura();
		if(temperatura <=16 ) {
			this.ligado = true; 
			System.out.println("AR ligado");
		}else {
			this.ligado = false;
			System.out.println("AR DESLIGADO");
		}
		
	}
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
