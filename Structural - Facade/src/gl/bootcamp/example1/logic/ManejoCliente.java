package gl.bootcamp.example1.logic;

import gl.bootcamp.example1.model.Cliente;
import gl.bootcamp.example1.model.Cuenta;

public class ManejoCliente {
	
	public Cliente nuevoCliente (String nombre, String apellido){
		return new Cliente(nombre, apellido);
	}
	
	public Cuenta nuevaCuenta (Cliente cliente, String tipo){
		Cuenta nueva = new Cuenta(cliente);
		nueva.setTipo(tipo);
		return nueva;
	}
	
	public void gestionTarjetas(){
		// Logica
	}
	
	// Mas logica de negocio.
}
