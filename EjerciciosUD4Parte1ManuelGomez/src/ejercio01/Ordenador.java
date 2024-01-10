package ejercio01;

public class Ordenador {

	private int capacidadDisco;
	private int frecuenciaProcesador;
	private double precioBase;
	private String marca;
	private int id;

	public Ordenador(int capacidadDisco, int frecuenciaProcesador, double precioBase, String marca, int id) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProcesador = frecuenciaProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
		this.id = id;
	}

	public int getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public int getFrecuenciaProcesador() {
		return frecuenciaProcesador;
	}

	public void setFrecuenciaProcesador(int frecuenciaProcesador) {
		this.frecuenciaProcesador = frecuenciaProcesador;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProcesador=" + frecuenciaProcesador
				+ ", precioBase=" + precioBase + ", marca=" + marca + ", id=" + id + "]";
	}

	public double calcularPrecioVenta(double porcentajeGanancia) {
		int cien = 100;

		return precioBase + (precioBase * porcentajeGanancia / cien);
	}

}
