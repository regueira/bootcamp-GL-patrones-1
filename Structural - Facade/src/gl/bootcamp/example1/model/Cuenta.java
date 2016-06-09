package gl.bootcamp.example1.model;

public class Cuenta {
	
	private double monto;
	
	private Cliente cliente;
	
	private String tipo;
	
	public Cuenta (Cliente cliente){
		this.setCliente(cliente);
		this.setMonto(0);
	}
	
	public Cuenta (Cliente cliente, double monto){
		this.setCliente(cliente);
		this.setMonto(monto);
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
