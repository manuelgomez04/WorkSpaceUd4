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

		Producto El1 = new Electronica("TV", 1, 150.99, 25);
		Producto El2 = new Electronica("TV2", 2, 175.99, 25);
		Producto Al1 = new Alimentacion("Lechuga", 1, 1.25, 50, 5);
		Producto Al2 = new Alimentacion("Lechuga", 2, 1.50, 50, 2);

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

		lista.imprimirTicket();
	}

}
