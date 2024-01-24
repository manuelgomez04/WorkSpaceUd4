package ejercicio01;

public class Principal {

	public static void main(String[] args) {

		int tam = 4;
		int anio = 2020;
		int index = 0;
		int num = 5;

		Publicacion l1 = new Libro(2020, "El quijote", true);
		Publicacion l2 = new Libro(2023, "Harry Potter y la Piedra Filosofal", false);
		Publicacion r1 = new Revista(2017, "Hola", false, 1);
		Publicacion r2 = new Revista(2015, "Todo Motor", true, 5);

		Publicacion[] lista = new Publicacion[tam];

		lista[index] = l1;
		index++;
		lista[index] = l2;
		index++;
		lista[index] = r1;
		index++;
		lista[index] = r2;
		index++;

		Biblioteca b = new Biblioteca();

		System.out.println("Las publicaciones prestados son" + l1.contarPrestados(lista));

		System.out.println();

		System.out.println("Las publicaciones anteriores al año 2020 son " + l1.publicacionesAnterioresA(lista, anio));

		System.out.println("\nLista de libros y revistas");
		System.out.println();

		b.mostrarLista(lista);

		b.imprimirDatos(lista, num);

	}

}
