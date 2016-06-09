package gl.bootcamp.example1;

import gl.bootcamp.example1.vehiculos.Vehiculo;
import gl.bootcamp.example1.vehiculos.fabricas.FabricaDeColectivos;
import gl.bootcamp.example1.vehiculos.fabricas.FabricaDeRemis;
import gl.bootcamp.example1.vehiculos.fabricas.FabricaDeTaxi;
import gl.bootcamp.example1.vehiculos.impl.Colectivo;
import gl.bootcamp.example1.vehiculos.impl.Remis;
import gl.bootcamp.example1.vehiculos.impl.Taxi;
import gl.bootcamp.example1.vehiculos.interfaces.VehiculoDeTransporte;

public class MainAbstractFactory {

	public static void main(String[] args) {
		
		// Probando la factory de Colectivo
		VehiculoDeTransporte fbColectivo = new FabricaDeColectivos();
		Vehiculo colectivo = fbColectivo.crearVehiculo();
		colectivo.setMarca("Mercedes Benz");
		
		// Como me devolvió un Vehiculo, hago el cast a Colectivo.
		// Le agrego la linea.
		((Colectivo) colectivo).setLinea(60);
		System.out.println(colectivo.toString());
		
		
		// Probando la factory de Taxi
		VehiculoDeTransporte fbTaxi = new FabricaDeTaxi();
		Vehiculo taxi = fbTaxi.crearVehiculo();
		taxi.setMarca("Ford");
		
		// Como me devolvió un Vehiculo, hago el cast a Taxi.
		// Lo hago RadioTaxi.
		((Taxi) taxi).setEsRadioTaxi(true);
		System.out.println(taxi.toString());
		
		// Probando la factory de Remis
		VehiculoDeTransporte fbRemis = new FabricaDeRemis();
		Vehiculo remis = fbRemis.crearVehiculo();
		remis.setMarca("Fiat");
		
		// Como me devolvió un Vehiculo, hago el cast a Remis.
		// Le agrego la remisería.
		((Remis) remis).setRemiseria("Rentur");
		System.out.println(remis.toString());
	}
}
