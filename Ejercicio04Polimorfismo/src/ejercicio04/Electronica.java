package ejercicio04;

public class Electronica extends Producto {
	private double porcImpuesto;

	public Electronica(String nombre, int codId, double precioUnitarioGenerico, double porcImpuesto) {
		super(nombre, codId, precioUnitarioGenerico);
		this.porcImpuesto = porcImpuesto;
	}

	public double getPorcImpuesto() {
		return porcImpuesto;
	}

	public void setPorcImpuesto(double porcImpuesto) {
		this.porcImpuesto = porcImpuesto;
	}

	@Override
	public String toString() {
		return "Electronica [porcImpuesto=" + porcImpuesto + "]";
	}

	@Override
	public double calcularPrecioUnitario() {
		int cien = 100;
		return super.getPrecioUnitarioGenerico() + ((super.getPrecioUnitarioGenerico() * porcImpuesto) / 100);
	}

}
