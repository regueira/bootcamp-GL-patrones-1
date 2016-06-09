package gl.bootcamp.example2.builder;

import gl.bootcamp.example2.productos.Torta;

public abstract class TortaBuilder {
	
	protected Torta torta;

	public Torta getTorta() {
		return torta;
	}

	public void crearTorta() {
		this.torta = new Torta();
	}
	
	public abstract void buildNombre();
	
	public abstract void buildRelleno();
	
	public abstract void buildCubierta();
	
}
