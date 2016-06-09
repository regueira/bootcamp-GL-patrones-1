package gl.bootcamp.example2.componente;

public abstract class ReproductorYouTube {

	protected String nombreVideo;
	
	public ReproductorYouTube (String video) {
		this.nombreVideo = video;
	}
	
	abstract public void reproducir(int profundidad);
	
	
}
