package gl.bootcamp.example1.composite;

import java.util.ArrayList;

import gl.bootcamp.example1.componente.Empresa;

public class Sector extends Empresa{
	
	private ArrayList<Empresa> hijo = new ArrayList<Empresa>();

	public Sector (String nombre) {
		super(nombre);
	}
	
	public void agregar(Empresa c) {
		hijo.add(c);
	}

	public void eliminar(Empresa c) {
		hijo.remove(c);
	}

	public void mostrar(int profundidad) {
		System.out.println("Sector: " + nombre + " nivel: " + profundidad);
		for (Empresa h : hijo){
			h.mostrar(profundidad + 1);
		}
	}

}
