package gl.bootcamp.example1.vehiculos.impl;

import gl.bootcamp.example1.vehiculos.Vehiculo;

public class Remis extends Vehiculo{
	
	private int codigo;
	private String remiseria;
	
	public void codigoDeVehiculo() {
		System.out.println("El código del remis es: " + this.getCodigo());
	}

	public int generarCodigo() {
		int codigoRemis = (int) (Math.random()*9999);
		return codigoRemis;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRemiseria() {
		return remiseria;
	}

	public void setRemiseria(String remiseria) {
		this.remiseria = remiseria;
	}
	
	public String toString(){
		return "Remis de Marca: " + this.getMarca() + " de la remisería: " + this.getRemiseria();
	}
}
