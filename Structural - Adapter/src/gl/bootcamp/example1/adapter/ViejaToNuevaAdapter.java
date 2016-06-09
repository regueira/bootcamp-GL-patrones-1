package gl.bootcamp.example1.adapter;

import java.util.Calendar;
import java.util.GregorianCalendar;

import gl.bootcamp.example1.persona.IPersonaNueva;
import gl.bootcamp.example1.persona.IPersonaVieja;

public class ViejaToNuevaAdapter implements IPersonaNueva{

	private IPersonaVieja vieja;
	
	public ViejaToNuevaAdapter (IPersonaVieja vieja){
		this.vieja = vieja;
	}

	public String getNombre() {
		return vieja.getNombre() + " " + vieja.getApellido();
	}

	public void setNombre(String nombreCompleto) {
		String[] name = nombreCompleto.split(" ");
		vieja.setNombre(name[0]);
		vieja.setApellido(name[1]);
	}

	public int getEdad() {
		GregorianCalendar c = new GregorianCalendar();
		GregorianCalendar c2 = new GregorianCalendar();
		
		c2.setTime(vieja.getFechaDeNacimiento());
		return c.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
	}

	public void setEdad(int edad) {
		GregorianCalendar c = new GregorianCalendar();
		int actualYear = c.get(Calendar.YEAR);
		c.set(Calendar.YEAR, actualYear - edad);
		vieja.setFechaDeNacimiento(c.getTime());
	}
	
}










