package gl.bootcamp.example2.composite;

import java.util.ArrayList;

import gl.bootcamp.example2.componente.ReproductorYouTube;

public class ListadoVideo extends ReproductorYouTube{
	
	private ArrayList<ReproductorYouTube> lista = new ArrayList<ReproductorYouTube>();
	
	
	public ListadoVideo(String nombreVideo) {
		super (nombreVideo);
	}
	
	public void agregar(ReproductorYouTube v) {
		lista.add(v);
	}

	public void eliminar(ReproductorYouTube v) {
		lista.remove(v);
	}

	public void reproducir(int profundidad) {
		System.out.println("Lista: " + nombreVideo + " | Nivel: " + profundidad);
		for (ReproductorYouTube ryt : lista){
			ryt.reproducir(profundidad + 1);
		}
		
	}

}
