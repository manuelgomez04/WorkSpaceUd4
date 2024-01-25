package ejercicio01;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int numDias;
	private int numHuespedes;
	private int idHabitacion;

	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int numDias, int numHuespedes,
			int idHabitacion) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.numDias = numDias;
		this.numHuespedes = numHuespedes;
		this.idHabitacion = idHabitacion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public int getNumHuespedes() {
		return numHuespedes;
	}

	public void setNumHuespedes(int numHuespedes) {
		this.numHuespedes = numHuespedes;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", numDias=" + numDias + ", numHuespedes=" + numHuespedes + ", idHabitacion=" + idHabitacion + "]";
	}

}
