package gl.bootcamp.example1;

import java.util.Date;
import java.util.GregorianCalendar;

import gl.bootcamp.example1.adapter.ViejaToNuevaAdapter;
import gl.bootcamp.example1.persona.IPersonaNueva;
import gl.bootcamp.example1.persona.impl.PersonaVieja;

public class AdapterMain {

	public static void main(String[] args) {
		
		// Iniciamos una Persona Vieja.
		PersonaVieja personaVieja = new PersonaVieja();
		personaVieja.setNombre("Juan");
		personaVieja.setApellido("Perez");
		
		GregorianCalendar g = new GregorianCalendar();
		g.set(1984, 06, 01);
		
		Date d = g.getTime();
		personaVieja.setFechaDeNacimiento(d);
		
		
		// Adapter a una nueva persona.
		
		IPersonaNueva personaNueva = new ViejaToNuevaAdapter(personaVieja);
		
		System.out.println("Nombre y Apellido: " + personaNueva.getNombre());
		System.out.println("Edad: " + personaNueva.getEdad());
		
		personaNueva.setEdad(10);
		personaNueva.setNombre("Carlos Perez");
		
		System.out.println("Edad: " + personaNueva.getEdad());
		System.out.println("Nombre y Apellido: " + personaNueva.getNombre());
		
	}

}









