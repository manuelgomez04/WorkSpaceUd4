package ejercicio01;

import java.util.Arrays;

public class GestionHotel {

	private Habitacion[] lista;

	public GestionHotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "GestionHotel [lista=" + Arrays.toString(lista) + "]";
	}

	public Habitacion buscarApartamento(int id, int numHab) {
		int i = 0;
		boolean encontrado = false;
		while (i < numHab && !encontrado) {
			if (lista[i] instanceof Apartamento) {

				encontrado = true;

			} else {
				i++;
			}
		}
		// System.out.println(lista[i]);

		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public Habitacion[] buscarLista(int numHab, String categoria) {

		int i = 0;

		Habitacion[] listado = new Habitacion[numHab];

		while (i < numHab) {
			if (lista[i].getNombreCliente().equalsIgnoreCase(categoria)) {
				listado[i] = lista[i];
			}
		}
	}
}
