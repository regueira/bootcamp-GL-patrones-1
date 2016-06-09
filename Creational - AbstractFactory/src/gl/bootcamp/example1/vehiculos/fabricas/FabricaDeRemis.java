package gl.bootcamp.example1.vehiculos.fabricas;

import gl.bootcamp.example1.vehiculos.Vehiculo;
import gl.bootcamp.example1.vehiculos.impl.Remis;
import gl.bootcamp.example1.vehiculos.interfaces.VehiculoDeTransporte;

public class FabricaDeRemis implements VehiculoDeTransporte{

	public Vehiculo crearVehiculo() {
		Remis miRemis = new Remis();
		miRemis.setCodigo(miRemis.generarCodigo());
		System.out.println("Se creó un nuevo Remis: " + miRemis.getCodigo());
		
		return miRemis;
	}

}