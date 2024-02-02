package ejercicio04;

public class Alimentacion extends Producto {

	private double descuento;
	private int tiempoACaducar;

	public Alimentacion(String nombre, int codId, double precioUnitarioGenerico, double descuento, int tiempoACaducar) {
		super(nombre, codId, precioUnitarioGenerico);
		this.descuento = descuento;
		this.tiempoACaducar = tiempoACaducar;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public int getTiempoACaducar() {
		return tiempoACaducar;
	}

	public void setTiempoACaducar(int tiempoACaducar) {
		this.tiempoACaducar = tiempoACaducar;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuento=" + descuento + ", tiempoACaducar=" + tiempoACaducar + "]";
	}

	@Override
	public double calcularPrecioUnitario() {
		int cien = 100;
		if (tiempoACaducar <= 2) {
			return super.getPrecioUnitarioGenerico() - (super.getPrecioUnitarioGenerico() * descuento / cien);
		} else {
			return super.getPrecioUnitarioGenerico();
		}
	}

	public void mostrarCaduca2Dias() {

		if (tiempoACaducar <= 2) {
			System.out.println("Este producto está a punto de caducar");
		}
	}

}
