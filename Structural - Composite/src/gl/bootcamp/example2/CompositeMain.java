package gl.bootcamp.example2;

import gl.bootcamp.example2.composite.ListadoVideo;
import gl.bootcamp.example2.composite.Video;

public class CompositeMain {

	public static void main(String[] args) {
		
		ListadoVideo inicio = new ListadoVideo ("Serie");
		inicio.agregar(new Video("Trailer"));
		
		ListadoVideo temporada1 = new ListadoVideo ("Temporada 1");
		temporada1.agregar(new Video("Capitulo 1"));
		temporada1.agregar(new Video("Capitulo 2"));
		temporada1.agregar(new Video("Capitulo 3"));
		temporada1.agregar(new Video("Capitulo 4"));
		temporada1.agregar(new Video("Capitulo 5"));
		
		ListadoVideo temporada2 = new ListadoVideo ("Temporada 2");
		temporada2.agregar(new Video("Capitulo 1"));
		temporada2.agregar(new Video("Capitulo 2"));
		temporada2.agregar(new Video("Capitulo 3"));
		temporada2.agregar(new Video("Capitulo 4"));
		temporada2.agregar(new Video("Capitulo 5"));
		
		inicio.agregar(temporada1);
		inicio.agregar(temporada2);
		
		// Muestro la serie.
		inicio.reproducir(1);
	}
}
