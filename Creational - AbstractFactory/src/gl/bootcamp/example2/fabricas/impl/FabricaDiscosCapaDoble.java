package gl.bootcamp.example2.fabricas.impl;

import gl.bootcamp.example2.fabricas.FabricaDiscos;
import gl.bootcamp.example2.productos.BluRay;
import gl.bootcamp.example2.productos.DVD;
import gl.bootcamp.example2.productos.impl.BluRayCapaDoble;
import gl.bootcamp.example2.productos.impl.DVDCapaDoble;

public class FabricaDiscosCapaDoble implements FabricaDiscos{

	public BluRay crearBluRay() {
		return new BluRayCapaDoble();
	}

	public DVD crearDVD() {
		return new DVDCapaDoble();
	}

}