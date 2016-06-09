package gl.bootcamp.example2.fabricas.impl;

import gl.bootcamp.example2.fabricas.FabricaDiscos;
import gl.bootcamp.example2.productos.BluRay;
import gl.bootcamp.example2.productos.DVD;
import gl.bootcamp.example2.productos.impl.BluRayCapaSimple;
import gl.bootcamp.example2.productos.impl.DVDCapaSimple;

public class FabricaDiscosCapaSimple implements FabricaDiscos{

	public BluRay crearBluRay() {
		return new BluRayCapaSimple();
	}

	public DVD crearDVD() {
		return new DVDCapaSimple();
	}

}
