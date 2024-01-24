package ejercicio01;

public class Biblioteca {

	public void imprimirDatos(Publicacion[] lista, int num) {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Revista) {
				((Revista) lista[i]).avisarCincuenta(num);
			}
		}
	}

	public void mostrarLista(Publicacion[] lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
			System.out.println();
		}

	}
}
