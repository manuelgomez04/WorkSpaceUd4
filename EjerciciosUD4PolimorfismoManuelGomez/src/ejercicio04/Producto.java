package ejercicio04;

public class Producto {

	private String nombre;
	private double precioUnitario;
	private int id;
	private double iva;
	private boolean activo;

	public Producto(String nombre, double precioUnitario, int id, double iva, boolean activo) {
		super();
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.id = id;
		this.iva = iva;
		this.activo = activo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String toString() {
		return "Producto [nombre=" + nombre + ", precioUnitario=" + precioUnitario + ", id=" + id + ", iva=" + iva
				+ ", activo=" + activo + "]";
	}

	public double calcularPrecio() {
		int cien = 100;
		return precioUnitario + precioUnitario * iva / cien;
	}
}
