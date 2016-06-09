package gl.bootcamp.example2.fabricas;

import gl.bootcamp.example2.productos.BluRay;
import gl.bootcamp.example2.productos.DVD;

public interface FabricaDiscos {
	
	public BluRay crearBluRay();
    public DVD crearDVD();
    
}
