package ejercicio06;

public class CuentaJoven extends Cuenta {

	private int regalo;

	public CuentaJoven(Cliente usuario, double saldo) {
		super(usuario, saldo);
	}

	public int getRegalo() {
		return regalo;
	}

	public void setRegalo(int regalo) {
		this.regalo = regalo;
	}

	public double calcularSaldo() {
		return getSaldo();
	}

	public void ingresarDinero(double cantidad) {
		double uno = 1;

		regalo += uno;

		setSaldo(getSaldo() + cantidad + regalo);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < getSaldo()) {

			setSaldo(getSaldo() - cantidad);

		}
	}

}
