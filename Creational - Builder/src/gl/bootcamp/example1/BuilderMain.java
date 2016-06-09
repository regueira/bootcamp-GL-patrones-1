package gl.bootcamp.example1;

import gl.bootcamp.example1.builder.FordBuilder;
import gl.bootcamp.example1.director.AutoDirector;
import gl.bootcamp.example1.productos.Auto;

public class BuilderMain {

	public static void main(String[] args) {
		
		// Instancio un AutoDirector (Podría ser un singleton)
		AutoDirector director = new AutoDirector();
		
		// Creo un Builder para Ford
		director.setAutoBuilder(new FordBuilder());
		director.constructAuto();
		
		Auto auto = director.getAuto();
		
		System.out.println("Marca: " + auto.getMarca());
		System.out.println("Modelo: " + auto.getModelo());

	}

}
