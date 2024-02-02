package ejercicio04;

public abstract class Producto {

	private String nombre;
	private int codId;
	private double precioUnitarioGenerico;

	public Producto(String nombre, int codId, double precioUnitarioGenerico) {
		super();
		this.nombre = nombre;
		this.codId = codId;
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodId() {
		return codId;
	}

	public void setCodId(int codId) {
		this.codId = codId;
	}

	public double getPrecioUnitarioGenerico() {
		return precioUnitarioGenerico;
	}

	public void setPrecioUnitarioGenerico(double precioUnitarioGenerico) {
		this.precioUnitarioGenerico = precioUnitarioGenerico;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codId=" + codId + ", precioUnitarioGenerico=" + precioUnitarioGenerico
				+ "]";
	}

	public abstract double calcularPrecioUnitario();

}
