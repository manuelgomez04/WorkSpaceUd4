package ejercicio06;

public class CuentaJoven extends Cuenta {

	private int regalo;

	public CuentaJoven(Cliente usuario, double saldo) {
		super(usuario, saldo, 0);
	}

	public int getRegalo() {
		return regalo;
	}

	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		double total = 0, uno = 1;

		regalo += uno;
		total = getSaldo() + cantidad + uno;

		setSaldo(total);
	}

	public void retirarDinero(double cantidad) {
		double total = 0;

		if (cantidad < getSaldo()) {

			total = getSaldo() - cantidad;
			setSaldo(total);

		} else {

			System.out.println("No puede retirar mas de lo que hay en la cuenta");
		}
	}

}
