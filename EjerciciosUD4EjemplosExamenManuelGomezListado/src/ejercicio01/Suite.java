package ejercicio01;

public class Suite extends Habitacion {

	private double metrosCuadrados;
	private double cantidadDineroGastado;

	public Suite(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numHuespedes,
			int idHabitacion, double metrosCuadrados, double cantidadDineroGastado) {
		super(precioBase, ocupada, nombreCliente, numDias, numHuespedes, idHabitacion);
		this.metrosCuadrados = metrosCuadrados;
		this.cantidadDineroGastado = cantidadDineroGastado;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(double metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public double getCantidadDineroGastado() {
		return cantidadDineroGastado;
	}

	public void setCantidadDineroGastado(double cantidadDineroGastado) {
		this.cantidadDineroGastado = cantidadDineroGastado;
	}

	@Override
	public String toString() {
		return "Suite [metrosCuadrados=" + metrosCuadrados + ", cantidadDineroGastado=" + cantidadDineroGastado + "]";
	}

}
