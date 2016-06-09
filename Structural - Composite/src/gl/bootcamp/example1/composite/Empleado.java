package gl.bootcamp.example1.composite;

import gl.bootcamp.example1.componente.Empresa;

public class Empleado extends Empresa{
	
	public Empleado (String nombre){
		super (nombre);
	}

	public void mostrar(int profundidad) {
		System.out.println("  ---  Empleado: " + nombre);
		
	}

}
