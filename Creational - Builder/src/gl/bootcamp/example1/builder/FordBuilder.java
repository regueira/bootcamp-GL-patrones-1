package gl.bootcamp.example1.builder;

import gl.bootcamp.example1.productos.Motor;

public class FordBuilder extends AutoBuilder {

	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(222333);
		motor.setPotencia("130 HP");
		motor.setCilindros("6 en V");
		auto.setMotor(motor);
	}

	public void buildModelo() {
		auto.setModelo("Explorer");
		
	}

	public void buildMarca() {
		auto.setMarca("Ford");
	}

	public void buildPuertas() {
		auto.setCantidadDePuertas(5);
	}
	
}
