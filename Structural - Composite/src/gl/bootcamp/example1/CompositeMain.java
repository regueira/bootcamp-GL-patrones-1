package gl.bootcamp.example1;

import gl.bootcamp.example1.composite.Empleado;
import gl.bootcamp.example1.composite.Sector;

public class CompositeMain {

	public static void main(String[] args) {
		Sector inicio = new Sector ("Empresa");
		inicio.agregar(new Empleado("CEO"));
		
		Sector sistemas = new Sector("Sistemas");
		
		sistemas.agregar(new Empleado("Jefe"));
		sistemas.agregar(new Empleado("Developer A"));
		sistemas.agregar(new Empleado("Developer B"));
		
		Sector contabilidad = new Sector ("Contabilidad");
		contabilidad.agregar(new Empleado("Contador A"));
		contabilidad.agregar(new Empleado("Contador B"));
		contabilidad.agregar(new Empleado("Contador C"));
		
		Sector administrativo = new Sector ("Administrativo");
		administrativo.agregar(new Empleado("Administrativo A"));
		
		Sector RRHH = new Sector ("RRHH");
		RRHH.agregar(new Empleado("RRHH A"));
		RRHH.agregar(new Empleado("RRHH B"));

		administrativo.agregar(RRHH);
		
		// Agrego todo al inicio (Empresa)
		inicio.agregar(sistemas);
		inicio.agregar(contabilidad);
		inicio.agregar(administrativo);
		
		// Muestro la empresa.
		inicio.mostrar(1);
	}

}
