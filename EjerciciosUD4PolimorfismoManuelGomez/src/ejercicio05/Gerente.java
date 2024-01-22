package ejercicio05;

public class Gerente extends Empleado {

	private double impuestos;

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleados, double impuestos) {
		super(nombre, apellidos, sueldoBase, numEmpleados);
		this.impuestos = impuestos;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return "Gerente [impuestos=" + impuestos + "]";
	}

	public double calcularSueldoBase() {

		int cien = 100;

		return super.calcularSueldo() - super.calcularSueldo() * impuestos / cien;
	}
}
