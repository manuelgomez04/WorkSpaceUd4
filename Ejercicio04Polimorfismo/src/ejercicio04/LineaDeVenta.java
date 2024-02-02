package ejercicio04;

public class LineaDeVenta {

	private Producto p;
	private int cantidad;

	public LineaDeVenta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "LineaDeVenta [p=" + p + ", cantidad=" + cantidad + "]";
	}

	public double calcularPrecioDeUno() {
		return p.calcularPrecioUnitario();
	}

	public double calcularPrecioTotalProducto() {

		return cantidad * calcularPrecioDeUno();
	}

	public void imprimirLineaVenta() {

		if (p instanceof Alimentacion) {

			System.out.printf("%s\t\t\t\t    %d\t\t\t\t    %.2f\t\t\t\t    %.2f\t\t", p.getNombre(), cantidad,
					p.calcularPrecioUnitario(), calcularPrecioTotalProducto());
			((Alimentacion) p).mostrarCaduca2Dias();
			System.out.println();

		} else {
			System.out.printf("%s\t\t\t\t    %d\t\t\t\t    %.2f\t\t\t\t    %.2f\t\t\t\t", p.getNombre(), cantidad,
					p.calcularPrecioUnitario(), calcularPrecioTotalProducto());

			System.out.println();
		}

	}
}
