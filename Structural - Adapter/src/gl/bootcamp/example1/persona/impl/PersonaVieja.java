package gl.bootcamp.example1.persona.impl;

import java.util.Date;

import gl.bootcamp.example1.persona.IPersonaVieja;

public class PersonaVieja implements IPersonaVieja{
	
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date nac) {
		this.fechaDeNacimiento = nac;
	}

}
