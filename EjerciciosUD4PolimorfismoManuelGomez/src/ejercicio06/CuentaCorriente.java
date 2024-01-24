package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double puntos;
	private double mantenimiento;

	public CuentaCorriente(Cliente usuario, double saldo, double puntos, double mantenimiento) {
		super(usuario, saldo);
		this.puntos = puntos;
		this.mantenimiento = mantenimiento;
	}

	public double getPuntos() {
		return puntos;
	}

	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public double calcularSaldo() {
		return getSaldo() - mantenimiento;
	}

	public void ingresarDinero(double cantidad) {
		double cien = 100.0;

		puntos = cantidad * cien;
		setSaldo(getSaldo() + cantidad - mantenimiento);
	}

	public void retirarDinero(double cantidad) {

		if (cantidad < getSaldo()) {

			setSaldo(getSaldo() - cantidad);

		}
	}
}
