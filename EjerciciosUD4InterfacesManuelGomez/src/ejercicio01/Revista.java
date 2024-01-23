package ejercicio01;

public class Revista extends Publicacion {

	public Revista(int anioPublicacion, String nombre, boolean prestado) {
		super(anioPublicacion, nombre, prestado);
	}

	public int prestados(Publicacion[] lista) {

		int contador = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].isPrestado()) {
				contador++;
			}
		}
		return contador;
	}

	public int publicacionesAnterioresA(Publicacion[] listado, int anio) {
		int contador = 0;

		for (int i = 0; i < listado.length; i++) {
			if (listado[i].getAnioPublicacion() < anio) {
				contador++;
			}
		}

		return contador;
	}
}
