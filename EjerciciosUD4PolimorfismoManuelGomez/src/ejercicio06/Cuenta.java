package ejercicio06;

public abstract class Cuenta {
	private Cliente usuario;
	private double saldo;

	public Cuenta(Cliente usuario, double saldo) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;

	}

	public Cliente getUsuario() {
		return usuario;
	}

	public void setUsuario(Cliente usuario) {
		this.usuario = usuario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public abstract double calcularSaldo();

	public abstract void ingresarDinero(double cantidad);

	public abstract void retirarDinero(double cantidad);
}
