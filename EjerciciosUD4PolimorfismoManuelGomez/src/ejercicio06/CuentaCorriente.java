package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double puntos;

	public CuentaCorriente(Cliente usuario, double saldo, double mantenimiento) {
		super(usuario, saldo, mantenimiento);
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public double calcularSaldo() {
		return getSaldo() + getMantenimiento();
	}

	public void ingresarDinero(double cantidad) {
		double total = 0, cien = 100.0;

		total = getSaldo() + cantidad;
		puntos = cantidad * cien;
		super.setSaldo(total);
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
