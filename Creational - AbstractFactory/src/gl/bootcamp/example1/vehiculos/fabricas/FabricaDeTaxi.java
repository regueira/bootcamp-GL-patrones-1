package gl.bootcamp.example1.vehiculos.fabricas;

import gl.bootcamp.example1.vehiculos.Vehiculo;
import gl.bootcamp.example1.vehiculos.impl.Taxi;
import gl.bootcamp.example1.vehiculos.interfaces.VehiculoDeTransporte;

public class FabricaDeTaxi implements VehiculoDeTransporte{

	public Vehiculo crearVehiculo() {
		Taxi miTaxi = new Taxi();
		miTaxi.setCodigo(miTaxi.generarCodigo());
		System.out.println("Se creó un nuevo Taxi: " + miTaxi.getCodigo());
		
		return miTaxi;
	}

}