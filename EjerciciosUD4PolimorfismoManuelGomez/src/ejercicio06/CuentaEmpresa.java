package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int extra;

	public CuentaEmpresa(Cliente usuario, double saldo) {
		super(usuario, saldo);
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public double calcularSaldo() {
		return getSaldo();
	}

	public void ingresarDinero(double cantidad) {

		extra += 1;

		super.setSaldo(getSaldo() + cantidad);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < getSaldo()) {

			setSaldo((getSaldo() - cantidad) - 1);

		}
	}
}
