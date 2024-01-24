package ejercicio01;

public class Revista extends Publicacion {

	private int numero;

	public Revista(int anioPublicacion, String nombre, boolean prestado, int numero) {
		super(anioPublicacion, nombre, prestado);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int contarPrestados(Publicacion[] lista) {

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

	public void avisarCincuenta(int num) {
		if (numero == num) {
			System.out.println("Enhorabuena, eres el comprador " + numero + " de la revista");
		}
	}
}
