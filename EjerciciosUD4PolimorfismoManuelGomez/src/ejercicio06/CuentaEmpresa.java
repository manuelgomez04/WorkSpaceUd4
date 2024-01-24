package ejercicio06;

public class CuentaEmpresa extends Cuenta {

	private int extra;

	public CuentaEmpresa(Cliente usuario, double saldo) {
		super(usuario, saldo, 0);
	}

	public int getExtra() {
		return extra;
	}

	public void setExtra(int extra) {
		this.extra = extra;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		double total = 0;

		extra += 1;
		total = super.getSaldo() + cantidad;
		super.setSaldo(total);
	}

	public void retirarDinero(double cantidad) {
		double total = 0;

		if (cantidad < super.getSaldo()) {

			total = super.getSaldo() - (cantidad + 1);
			super.setSaldo(total);

		} else {

			System.out.println("No puede retirar mas de lo que hay en la cuenta");
		}
	}
}
