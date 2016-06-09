package gl.bootcamp.example2;

import gl.bootcamp.example2.fabricas.FabricaDiscos;
import gl.bootcamp.example2.fabricas.impl.FabricaDiscosCapaDoble;
import gl.bootcamp.example2.fabricas.impl.FabricaDiscosCapaSimple;
import gl.bootcamp.example2.productos.BluRay;
import gl.bootcamp.example2.productos.DVD;

public class MainAbstractFactory {
	
	public static void main(String[] args) {
		FabricaDiscos fabrica;
		DVD dvd;
		BluRay bluray;
		 
		fabrica = new FabricaDiscosCapaSimple();
		dvd = fabrica.crearDVD();
		bluray = fabrica.crearBluRay();
		 
		System.out.println(dvd);
		System.out.println(bluray);
		 
		fabrica = new FabricaDiscosCapaDoble();
		dvd = fabrica.crearDVD();
		bluray = fabrica.crearBluRay();
		 
		System.out.println(dvd);
		System.out.println(bluray);
	}
}
