package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int tam = 4;
		String direccion = "Calle No Lo se 25";
		String cif = "324344f";
		String fecha = "17/01/2024";
		int opcion;
		Scanner sc = new Scanner(System.in);
		String aux;
		/*
		 * Hacer un programa que imprima un ticket de compra, basándonos en un
		 * supermercado. Debemos crear la clase Producto genérica y tres hijas con un
		 * atributo más cada una (Alimentación y Electrónica). Cada Producto genérico
		 * deberá estar caracterizado por el precio unitario, nombre, código de
		 * identificación, etc.
		 * 
		 * El precio de los productos de electrónica lleva un impuesto especial por ser
		 * de lujo y la alimentación un descuento cuando le quedan menos de 2 días para
		 * caducar.
		 * 
		 * La clase Línea de venta, con un producto y una cantidad como atributos y la
		 * clase Venta con un array de líneas de venta.
		 * 
		 * El ticket debe mostrar una venta completa con varios productos y varias
		 * cantidades. Se pueden crear los productos directamente en el main antes de
		 * empezar. Agregar un método solo en la clase alimentación, que avise si al
		 * producto le quedan menos de 2 días para caducar. Crear un main, donde
		 * crearemos directamente los objetos necesarios. Solo habrá la opción imprimir
		 * ticket y listar todos los productos guardados, avisando cuando a un producto
		 * de alimentación le falten menos de dos días para caducar.
		 */

		Producto El1 = new Electronica("Televisión", 299.99, 1, 21, true, 10);
		Producto El2 = new Electronica("Ordenador", 600.00, 2, 21, true, 10);
		Producto Al1 = new Alimentacion("Tomate", 3, 3, 21, true, 5, 50);
		Producto Al2 = new Alimentacion("Lechuga", 4, 4, 21, true, 2, 50);

		// Alimentacion Al2 = new Alimentacion("Lechuga", 4, 3, 21, true, 2, 50);

		LineaDeVenta lv1 = new LineaDeVenta(El1, 1);
		LineaDeVenta lv2 = new LineaDeVenta(Al1, 4);
		LineaDeVenta lv3 = new LineaDeVenta(Al2, 3);
		LineaDeVenta lv4 = new LineaDeVenta(El2, 1);

		LineaDeVenta[] listadoLineaVenta = new LineaDeVenta[tam];

		listadoLineaVenta[0] = lv1;
		listadoLineaVenta[1] = lv2;
		listadoLineaVenta[2] = lv3;
		listadoLineaVenta[3] = lv4;

		Venta lista = new Venta(listadoLineaVenta);

		do {
			System.out.println("""
					1 --> Imprimir Lista
					2 --> Imprimir ticket
					3 --> Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				lista.imprimirLista();
				break;

			case 2:

				System.out.println("\t\t\t\t\t\t\tMERCADONA");
				System.out.println();
				System.out.println("\t\t\t" + direccion + "\t\t\t\tFecha: " + fecha);
				System.out.println();
				System.out.println("\t\t\tCIF: " + cif);
				System.out.println(
						"************************************************************************************************************************************************");
				System.out.println("\tNombre\t\t\tPrecio Unitario\t\t\tIVA\t\tCantidad\t\t\tSubtotal");
				System.out.printf("\t%s\t\t\t%.2f\t\t\t%.0f\t\t%d\t\t\t\t%.2f", El1.getNombre(),
						El1.getPrecioUnitario(), El1.getIva(), lv1.getCantidad(), lv1.calcularPrecioTotalPorProducto());
				break;
			default:
				break;
			}
		} while (opcion != 0);
	}

}
