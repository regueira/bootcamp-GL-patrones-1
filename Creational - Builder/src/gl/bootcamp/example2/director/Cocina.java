package gl.bootcamp.example2.director;

import gl.bootcamp.example2.builder.TortaBuilder;
import gl.bootcamp.example2.productos.Torta;

public class Cocina {

	private TortaBuilder tortaBuilder;
	
	public void setTortaBuilder (TortaBuilder tb) {
		tortaBuilder = tb;
	}
	
	public Torta getTorta() {
		return tortaBuilder.getTorta();
	}
	
	public void construirTorta () {
		tortaBuilder.crearTorta();
		tortaBuilder.buildNombre();
		tortaBuilder.buildRelleno();
		tortaBuilder.buildCubierta();
	}
}
