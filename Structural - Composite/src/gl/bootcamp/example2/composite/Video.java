package gl.bootcamp.example2.composite;

import gl.bootcamp.example2.componente.ReproductorYouTube;

public class Video extends ReproductorYouTube{
	
	public Video (String v ){
		super(v);
	}

	@Override
	public void reproducir(int profundidad) {
		System.out.println(" - - - Reproduciendo: " + nombreVideo + " | Nivel: " + profundidad);
	}

}
