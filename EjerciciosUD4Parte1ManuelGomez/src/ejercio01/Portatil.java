package ejercio01;

public class Portatil extends Ordenador {

	private boolean seguroPantalla;
	private double precioSeguro;

	public Portatil(int capacidadDisco, int frecuenciaProcesador, double precioBase, String marca, int id,
			boolean seguroPantalla, double precioSeguro) {
		super(capacidadDisco, frecuenciaProcesador, precioBase, marca, id);
		this.seguroPantalla = seguroPantalla;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguroPantalla() {
		return seguroPantalla;
	}

	public void setSeguroPantalla(boolean seguroPantalla) {
		this.seguroPantalla = seguroPantalla;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	public double calcularPrecioVenta(double porcentajeGanancia) {

		double precioFinal = 0;

		if (seguroPantalla) {
			precioFinal = super.calcularPrecioVenta(porcentajeGanancia) + precioSeguro;
		} else
			precioFinal = super.calcularPrecioVenta(porcentajeGanancia);

		return precioFinal;
	}

}
