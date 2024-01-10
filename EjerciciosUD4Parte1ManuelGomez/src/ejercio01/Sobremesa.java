package ejercio01;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(int capacidadDisco, int frecuenciaProcesador, double precioBase, String marca, int id,
			double precioMontaje) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca, id);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	public double calcularPrecioVenta(double porcentajeGanancia) {

		return super.calcularPrecioVenta(porcentajeGanancia) + precioMontaje;
	}
}
