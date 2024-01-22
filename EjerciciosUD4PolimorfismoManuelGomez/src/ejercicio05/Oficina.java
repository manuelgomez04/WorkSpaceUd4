package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado lista[];

	public Oficina(Empleado[] lista) {
		super();
		this.lista = lista;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularSueldoEmpleado(Empleado e) {

		return e.calcularSueldo();
	}

	public double calcularTotalSueldos() {

		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += calcularSueldoEmpleado(lista[i]);
		}
		return suma;
	}

	public void mostrarEmpleados(double objetivoVentas) {

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i] + "Sueldo" + calcularSueldoEmpleado(lista[i]));

			if (lista[i] instanceof Vendedor) {
				((Vendedor) lista[i]).felicitarVenta(objetivoVentas);
			}
		}
	}
}
