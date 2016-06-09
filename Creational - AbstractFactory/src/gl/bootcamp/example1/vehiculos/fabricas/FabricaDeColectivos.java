	package gl.bootcamp.example1.vehiculos.fabricas;

import gl.bootcamp.example1.vehiculos.Vehiculo;
import gl.bootcamp.example1.vehiculos.impl.Colectivo;
import gl.bootcamp.example1.vehiculos.interfaces.VehiculoDeTransporte;

public class FabricaDeColectivos implements VehiculoDeTransporte{

	@Override
	public Vehiculo crearVehiculo() {
		Colectivo miColectivo = new Colectivo();
		miColectivo.setCodigo(miColectivo.generarCodigo());
		System.out.println("Se creó un nuevo Colectivo: " + miColectivo.getCodigo());
		
		return miColectivo;
	}

}
