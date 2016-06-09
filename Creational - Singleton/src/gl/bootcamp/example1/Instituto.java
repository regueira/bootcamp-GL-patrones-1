package gl.bootcamp.example1;

/**
 * Ejemplo del patron Singleton
 * 
 * @author sebastian Regueira
 */
public class Instituto {

	/**
	 * 	Se coloca una variable privada del mismio tipo de la clase.
	 *	Por lo general se la llama "instance".
	 *	Estaba variable se instanciará una sola vez y siempre se devolverá al cliente.
	 */
	private static Instituto instance;
	
	private String nombre;
	
	
	/**
	 * El constructor debe ser privado para poder tener control y 
	 * solo poder hacer new Instituto desde la misma clase.
	 */
	private Instituto (){
	}
	
	
	/**
	 * Para poder utilizar la única instancia de esta clase, se deberá llamar al
	 * método getInstance() que al ser static se puede llamar sin necesidad de una instancia.
	 * El método chequea si existé ya una instancia, de no existir, crea la única permitida
	 * y devuelve el objeto.
	 * 
	 * @return Object Instituto
	 */
	public static Instituto getInstance(){
		if (instance == null) {
			instance = new Instituto();
		}
		
		return instance;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
