package gl.bootcamp.example3;

public class MainSingleton {

	public static void main(String[] args) {
		
		// Primer ejemplo
		Instituto instituto = Instituto.getInstance();
		instituto.setNombre("Escuela Nro 3");
		
		System.out.println("1- " + instituto.getNombre());
		
		// Segundo ejemplo.
		Instituto instituto2 = Instituto.getInstance();
		System.out.println("2- " + instituto2.getNombre());
		
		// Tercer ejemplo.
		Instituto instituto3 = Instituto.getInstance();
		System.out.println("3- " + instituto3.getNombre());
		
	}

}
