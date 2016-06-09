package gl.bootcamp.example3;

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
	 *	
	 *	Sí siempre se necesitará está instancia, podemos asignarla en la declaración de la variable.
	 *	Hay que tener en cuenta que si se hace esto y la instancia es muy grande, puede llegar a ser muy costoso.
	 *
	 */
	private static final Instituto INSTANCE = new Instituto();
	
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
	 * 
	 * @return Object Instituto
	 */
	public static Instituto getInstance(){
		return INSTANCE;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
