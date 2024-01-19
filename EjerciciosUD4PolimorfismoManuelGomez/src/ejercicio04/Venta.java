package ejercicio04;

import java.util.Arrays;

public class Venta {

	private LineaDeVenta[] listaLinea;

	public Venta(LineaDeVenta[] listaLinea) {
		super();
		this.listaLinea = listaLinea;
	}

	public LineaDeVenta[] getListaLinea() {
		return listaLinea;
	}

	public void setListaLinea(LineaDeVenta[] listaLinea) {
		this.listaLinea = listaLinea;
	}

	@Override
	public String toString() {
		return "Venta [listaLinea=" + Arrays.toString(listaLinea) + "]";
	}

	public double calcularTotal() {

		double total = 0;

		for (int i = 0; i < listaLinea.length; i++) {
			total += listaLinea[i].calcularPrecioTotalPorProducto();
		}
		return total;
	}

	public void imprimirLista() {
		for (int i = 0; i < listaLinea.length; i++) {
			System.out.println(listaLinea[i]);
			System.out.println();
		}
	}
}
