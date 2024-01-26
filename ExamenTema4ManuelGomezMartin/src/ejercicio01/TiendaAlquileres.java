package ejercicio01;

import java.util.Arrays;

public class TiendaAlquileres {

	private Vehiculos[] lista;

	public TiendaAlquileres(Vehiculos[] lista) {
		super();
		this.lista = lista;
	}

	public Vehiculos[] getLista() {
		return lista;
	}

	public void setLista(Vehiculos[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "TiendaAlquileres [lista=" + Arrays.toString(lista) + "]";
	}

	public Vehiculos buscarID(int id, int numVehiculos) {
		int i = 0;
		boolean encontrado = false;

		while (i <= numVehiculos && !encontrado) {
			if (lista[i].getNumBastidor() == id && lista[i] != null) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	public double calcularAlquilerVehiculo(Vehiculos v, double cantidad) {
		if (v == null) {
			return 0.0;
		} else {

			return v.calcularPrecio(cantidad);
		}
	}

	public void mostrarListado(int limite, int numVehiculos) {

		for (int i = 0; i < numVehiculos; i++) {
			System.out.println(lista[i]);
			if (lista[i] instanceof Batmovil) {
				((Batmovil) lista[i]).avisarMaximo(limite);
			}
		}
	}

	public double calcularTotalRecaudado(double cantidad) {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {
			total += calcularAlquilerVehiculo(lista[i], cantidad);
		}
		return total;
	}

	public double calcularTotalBatmovil(double cantidad) {
		double totalBatmovil = 0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Batmovil) {
				totalBatmovil += calcularAlquilerVehiculo(lista[i], cantidad);
			}
		}

		return totalBatmovil;

	}

	public double calcularAlquilerVariosDias(double cantidad, int numDias, int id, int numVehiculos) {
		Vehiculos v = buscarID(id, numVehiculos);

		return calcularAlquilerVehiculo(v, cantidad) * numDias;
	}
}
