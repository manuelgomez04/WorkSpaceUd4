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
			if (lista[i].getIdHabitacion() == id && lista[i] instanceof Apartamento) {

				encontrado = true;

			} else {
				i++;
			}
		}
		System.out.println(lista[i]);

		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}
}
