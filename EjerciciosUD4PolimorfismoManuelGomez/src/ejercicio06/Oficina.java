package ejercicio06;

public class Oficina {
	private Cuenta lista[];

	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	public double calcularSaldoCliente(Cuenta c) {
		return c.getSaldo();
	}

	public double totalDinero() {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] != null) {

				total += calcularSaldoCliente(lista[i]);
			}
		}
		return total;
	}

	public double calcularGastos() {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] != null && lista[i] instanceof CuentaJoven) {

				total += ((CuentaJoven) lista[i]).getRegalo();
			}
		}
		return total;
	}

	public double calcularIngresosEmpresas() {
		double total = 0;

		for (int i = 0; i < lista.length; i++) {

			if (lista[i] != null && lista[i] instanceof CuentaEmpresa) {

				total += ((CuentaEmpresa) lista[i]).getExtra();
			}
		}
		return total;
	}
}
