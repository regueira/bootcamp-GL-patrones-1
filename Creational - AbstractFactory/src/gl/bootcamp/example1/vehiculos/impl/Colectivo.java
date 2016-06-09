package gl.bootcamp.example1.vehiculos.impl;

import gl.bootcamp.example1.vehiculos.Vehiculo;

public class Colectivo extends Vehiculo{

	private int codigo;
	
	private int linea;
	
	public void codigoDeVehiculo() {
		System.out.println("El código del colectivo es: " + this.getCodigo());
	}

	public int generarCodigo() {
		int codigoColectivo = (int) (Math.random()*9999);
		return codigoColectivo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getLinea() {
		return linea;
	}

	public void setLinea(int linea) {
		this.linea = linea;
	}
	
	public String toString(){
		return "Colectivo de Marca: " + this.getMarca() + " de la linea: " + this.getLinea();
	}
}
