package gl.bootcamp.example1;

import gl.bootcamp.example1.facade.MostradorBanco;

public class FacadeMain {

	public static void main(String[] args) {
		
		MostradorBanco mostrador = new MostradorBanco();
		
		// Primer cliente
		mostrador.nuevaCuentaCorriente("Ignacio", "Rodriguez");
		
		// Segundo cliente
		mostrador.transferenciaMismoBanco();
	}

}
