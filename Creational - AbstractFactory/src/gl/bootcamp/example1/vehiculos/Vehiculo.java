package gl.bootcamp.example1.vehiculos;

public abstract class Vehiculo {

	private String marca;
	
	public abstract void codigoDeVehiculo();
	public abstract int generarCodigo();
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
}