package gl.bootcamp.example1.vehiculos.impl;

import gl.bootcamp.example1.vehiculos.Vehiculo;

public class Taxi extends Vehiculo{
	
	private int codigo;
	private String interno;
	private boolean esRadioTaxi;
	
	
	public void codigoDeVehiculo() {
		System.out.println("El código del taxi es: " + this.getCodigo());
	}

	public int generarCodigo() {
		int codigoTaxi = (int) (Math.random()*9999);
		return codigoTaxi;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getInterno() {
		return interno;
	}

	public void setInterno(String interno) {
		this.interno = interno;
	}

	public boolean isEsRadioTaxi() {
		return esRadioTaxi;
	}

	public void setEsRadioTaxi(boolean esRadioTaxi) {
		this.esRadioTaxi = esRadioTaxi;
	}
	
	public String toString(){
		return "Taxi de Marca: " + this.getMarca() + (this.isEsRadioTaxi() ? " y es RadioTaxi." : " y es Taxi normal.");
	}
}
