package gl.bootcamp.example2;

import gl.bootcamp.example2.builder.RogelBuilder;
import gl.bootcamp.example2.director.Cocina;
import gl.bootcamp.example2.productos.Torta;

public class BuilderMain {

	public static void main(String[] args) {
		
		// Instancio un director Cocina (Podría ser un singleton)
		Cocina director = new Cocina();
		
		// Creo un Builder para la torta
		director.setTortaBuilder(new RogelBuilder());
		director.construirTorta();
		
		Torta torta = director.getTorta();
		
		System.out.println("Nombre: " + torta.getNombre());
		System.out.println("Relleno: " + torta.getRelleno());
		System.out.println("Cubierta: " + torta.getCubierta());
		
	}

}
