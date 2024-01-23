package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		int tam = 4;
		int anio = 2020;

		Publicacion l1 = new Libro(2020, "El quijote", true);
		Publicacion l2 = new Libro(2023, "Harry Potter y la Piedra Filosofal", false);
		Publicacion r1 = new Revista(2017, "Hola", false);
		Publicacion r2 = new Revista(2015, "Todo Motor", true);

		Publicacion[] lista = new Publicacion[tam];

		lista[0] = l1;
		lista[1] = l2;
		lista[2] = r1;
		lista[3] = r2;

		System.out.println(l1.prestados(lista));

		System.out.println(l1.publicacionesAnterioresA(lista, anio));

	}

}
