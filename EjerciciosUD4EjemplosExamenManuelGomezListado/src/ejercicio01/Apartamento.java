package ejercicio01;

public class Apartamento extends Habitacion {

	private boolean servicioLimpieza;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numHuespedes,
			int idHabitacion, boolean servicioLimpieza) {
		super(precioBase, ocupada, nombreCliente, numDias, numHuespedes, idHabitacion);
		this.servicioLimpieza = servicioLimpieza;
	}

	public boolean isServicioLimpieza() {
		return servicioLimpieza;
	}

	public void setServicioLimpieza(boolean servicioLimpieza) {
		this.servicioLimpieza = servicioLimpieza;
	}

	@Override
	public String toString() {
		return "Apartamento [servicioLimpieza=" + servicioLimpieza + "]";
	}

}
