package gl.bootcamp.example1.builder;

import gl.bootcamp.example1.productos.Auto;

public abstract class AutoBuilder {

	protected Auto auto;
	
	public Auto getAuto() {
		return auto;
	}

	public void crearAuto() {
		auto = new Auto();
	}

	/**
	 * Se declaran los métodos necesarios para la construcción del objecto.
	 */
	public abstract void buildMotor();
	
	public abstract void buildModelo();
	
	public abstract void buildMarca();
	
	public abstract void buildPuertas();
	
}
