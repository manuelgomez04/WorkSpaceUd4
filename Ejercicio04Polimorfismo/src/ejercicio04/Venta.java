package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta[] lista;

	public Venta(LineaDeVenta[] lista) {
		super();
		this.lista = lista;
	}

	public LineaDeVenta[] getLista() {
		return lista;
	}

	public void setLista(LineaDeVenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Venta [lista=" + Arrays.toString(lista) + "]";
	}

	public void imprimirTicket() {

		System.out.println("Nombre\t\t\t\tCantidad\t\t\tPrecio Unitario\t\t\t\tSubtotal\t\t\tEstá a punto de caducar");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < lista.length; i++) {

			lista[i].imprimirLineaVenta();

		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"TOTAL ----------------------------------------------------------------------------------------------------> "
						+ calcularTotal() + "€");
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < lista.length; i++) {
			total += lista[i].calcularPrecioTotalProducto();
		}
		return total;
	}

}
