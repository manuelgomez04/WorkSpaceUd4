package ejercicio04;

public class Alimentacion extends Producto {

	private int tiempoACaducar;
	private double descuento;

	public Alimentacion(String nombre, double precioUnitario, int id, double iva, boolean activo, int tiempoACaducar,
			double descuento) {
		super(nombre, precioUnitario, id, iva, activo);
		this.tiempoACaducar = tiempoACaducar;
		this.descuento = descuento;
	}

	public int getTiempoACaducar() {
		return tiempoACaducar;
	}

	public void setTiempoACaducar(int tiempoACaducar) {
		this.tiempoACaducar = tiempoACaducar;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double calcularPrecio() {
		int cien = 100;
		if (tiempoACaducar <= 2) {
			return super.calcularPrecio() - (super.calcularPrecio() * descuento / cien);
		} else {
			return super.calcularPrecio();
		}

	}

	@Override
	public String toString() {
		return super.toString() + "Alimentacion [tiempoACaducar=" + tiempoACaducar + ", descuento=" + descuento + "]";
	}

	public void avisarCaducar() {
		if (tiempoACaducar <= 2) {
			System.out.println("Este producto está a punto de caducar");
		}
	}
}
