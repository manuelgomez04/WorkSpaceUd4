package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int tam = 200, pos = 0, numDias = 0, opcion, numRuedas;
		int numBastidorBuscado;
		double cantidad = 0;
		Vehiculos v1 = new Vehiculos("2345 DXM", 15, 2012, 1);
		Vehiculos v2 = new Vehiculos("2569 HXS", 12, 2017, 2);
		Vehiculos bat1 = new Batmovil("2222 SLS", 18, 2020, 3, 4);
		Vehiculos bat2 = new Batmovil("333 HJH", 10, 2021, 4, 5);
		Vehiculos pat1 = new PatineteVolador("6985 LMS", 2, 2024, 5, 100);
		Vehiculos pat2 = new PatineteVolador("2934 MGM", 5, 2020, 6, 110);

		Vehiculos lista[] = new Vehiculos[tam];

		lista[pos] = v1;
		pos++;
		lista[pos] = v2;
		pos++;
		lista[pos] = bat1;
		pos++;
		lista[pos] = bat2;
		pos++;
		lista[pos] = pat1;
		pos++;
		lista[pos] = pat2;

		TiendaAlquileres ta = new TiendaAlquileres(lista);

		System.out.println("****************************************************************");
		System.out.println(" \nBienvenido al programa de gestión de vehículos fantásticos.\n");
		System.out.println("****************************************************************");
		System.out.println();
		System.out.println("Diga la cantidad extra que cueseta alquilar un Batmovil");
		aux = sc.nextLine();
		cantidad = Integer.parseInt(aux);
		System.out.println();
		System.out.println("Lo siguiente será indicar el número máximo de ruedas de un Batmóvil");
		aux = sc.nextLine();
		numRuedas = Integer.parseInt(aux);

		do {
			System.out.println("""
					1 ---->  Calcular alquiler de un Vehículo
					2 ---->	 Mostrar todos los vehículos
					3 ---->  Calcular el total recaudado
					4 ---->  Calcular el total recaudado solo por Batmóviles
					5 ---->  Calcular el alquiler de un vehículo durante varios días
					0 ----> Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println(
						"Diga el número de bastidor del vehículo del que desea saber el precio de su alquiler");
				aux = sc.nextLine();
				numBastidorBuscado = Integer.parseInt(aux);

				if (ta.calcularAlquilerVehiculo(ta.buscarID(numBastidorBuscado, pos), cantidad) == 0.0) {
					System.out.println("Vehículo no encontrado");
				} else
					System.out.printf("El precio del alquiler del vehículo es %.2f€",
							ta.calcularAlquilerVehiculo(ta.buscarID(numBastidorBuscado, pos), cantidad));
				System.out.println();
				break;
			case 2:
				ta.mostrarListado(numRuedas, pos);
				break;

			case 3:
				System.out.printf("El total de dinero recaudado es %.2f€", ta.calcularTotalRecaudado(cantidad));
				System.out.println();
				break;
			case 4:
				System.out.printf("El total recaudado por los Batmóvil es %.2f€", ta.calcularTotalBatmovil(cantidad));
				System.out.println();
				break;

			case 5:
				System.out.println("Diga el número de días que desea alquilar el vehículo");
				aux = sc.nextLine();
				numDias = Integer.parseInt(aux);
				System.out
						.println("Diga el numero de bastidor del vehículo del que desea saber el precio del alquiler");
				aux = sc.nextLine();
				numBastidorBuscado = Integer.parseInt(aux);

				if (ta.buscarID(numBastidorBuscado, pos) == null) {
					System.out.println("Vehículo no encontrado");
				} else {

					System.out.printf("El total del vehículos para %d día(s) es de %.2f€", numDias,
							ta.calcularAlquilerVariosDias(cantidad, numDias, numBastidorBuscado, pos));
				}
				System.out.println();
				break;
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Diga un número válido");
				break;
			}

		} while (opcion != 0);
	}

}
