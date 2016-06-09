package gl.bootcamp.example1.facade;

import gl.bootcamp.example1.logic.ManejoCliente;
import gl.bootcamp.example1.logic.Transferencias;
import gl.bootcamp.example1.model.Cliente;

public class MostradorBanco {

	private ManejoCliente manejoCliente;
	
	private Transferencias transferencias;
	
	
	public MostradorBanco(){
		manejoCliente = new ManejoCliente();
		transferencias = new Transferencias();
	}
	
	public void nuevaCuentaCorriente (String nombre, String apellido) {
		System.out.println("nueva cuenta tipo Cuenta Corriente");
		Cliente nuevo = manejoCliente.nuevoCliente(nombre, apellido);
		manejoCliente.nuevaCuenta(nuevo, "CC");
	}
	
	public void transferenciaMismoBanco(){
		System.out.println("transferencia entre cuentas del mismo banco");
	}

	public Transferencias getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(Transferencias transferencias) {
		this.transferencias = transferencias;
	}
}
