package ejercicio04;

public class Electronica extends Producto {

	private double impuestoEspecial;

	public Electronica(String nombre, double precioUnitario, int id, double iva, boolean activo,
			double impuestoEspecial) {
		super(nombre, precioUnitario, id, iva, activo);
		this.impuestoEspecial = impuestoEspecial;
	}

	public double getImpuestoEspecial() {
		return impuestoEspecial;
	}

	public void setImpuestoEspecial(double impuestoEspecial) {
		this.impuestoEspecial = impuestoEspecial;
	}

	@Override
	public String toString() {
		return super.toString() + "Electronica [impuestoEspecial=" + impuestoEspecial + "]";
	}

	public double calcularPrecio() {
		int cien = 100;
		return super.calcularPrecio() + (super.calcularPrecio() * impuestoEspecial / cien);
	}
}
