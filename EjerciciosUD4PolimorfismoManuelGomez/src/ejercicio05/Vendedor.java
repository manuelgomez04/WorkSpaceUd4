package ejercicio05;

public class Vendedor extends Empleado {

	private double cantidadVentas;
	private double incentivo;

	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleados, double cantidadVentas,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleados);
		this.cantidadVentas = cantidadVentas;
		this.incentivo = incentivo;
	}

	public double getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(double cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public String toString() {
		return "Vendedor [cantidadVentas=" + cantidadVentas + ", incentivo=" + incentivo + "]";
	}

	public double calcularSueldo() {
		int cien = 100;

		return super.calcularSueldo() + cantidadVentas * incentivo / cien;
	}

	public void felicitarVenta(double cantidad) {
		if (cantidadVentas > cantidad) {
			System.out.println("Enhorabuena, has superado el objetivo. Muack muack");
		} else {
			System.out.println("Vaya inutil colega jajajajaj");
		}
	}

}
