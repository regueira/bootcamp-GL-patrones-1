package gl.bootcamp.example1.builder;

import gl.bootcamp.example1.productos.Motor;

public class FiatBuilder extends AutoBuilder{

	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(123451);
		motor.setPotencia("54 HP");
		motor.setCilindros("4 en línea");
		auto.setMotor(motor);
	}

	public void buildModelo() {
		auto.setModelo("Uno");
		
	}

	public void buildMarca() {
		auto.setMarca("Fiat");
	}

	public void buildPuertas() {
		auto.setCantidadDePuertas(3);
	}
	
}
