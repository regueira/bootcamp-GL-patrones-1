package gl.bootcamp.example1.componente;

public abstract class Empresa {
	protected String nombre;
	public Empresa (String nombre) {
		this.nombre = nombre;
	}
	
	abstract public void mostrar(int profundidad);
}
