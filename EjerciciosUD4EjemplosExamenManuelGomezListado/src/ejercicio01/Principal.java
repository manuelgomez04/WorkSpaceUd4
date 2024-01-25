package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		int id = 7;
		int tam = 8;
		int numHab = 0;

		Habitacion h1 = new Habitacion(100, false, "Juanjo", 5, 5, 1);
		Habitacion h2 = new Habitacion(100, false, "Juanjo1", 5, 5, 2);
		Habitacion h3 = new Habitacion(100, false, "Juanjo2", 5, 5, 3);
		Habitacion suite1 = new Suite(100, false, "Juanjo3", 5, 5, 4, 150, 50);
		Habitacion suite2 = new Suite(100, false, "Juanjo4", 5, 6, 5, 150, 50);
		Habitacion apt1 = new Apartamento(100, false, "Juanjo5", 5, 6, 5, true);
		Habitacion apt2 = new Apartamento(100, false, "Juanjo6", 5, 7, 5, true);

		Habitacion[] lista = new Habitacion[tam];

		lista[numHab] = h1;
		numHab++;
		lista[numHab] = h2;
		numHab++;
		lista[numHab] = h3;
		numHab++;
		lista[numHab] = suite1;
		numHab++;
		lista[numHab] = suite2;
		numHab++;
		lista[numHab] = apt1;
		numHab++;
		lista[numHab] = apt2;

		GestionHotel gh = new GestionHotel(lista);

		System.out.println(gh.buscarApartamento(id, numHab));

	}

}
