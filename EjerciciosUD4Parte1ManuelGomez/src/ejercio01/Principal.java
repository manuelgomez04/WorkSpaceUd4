package ejercio01;

public class Principal {

	public static void main(String[] args) {
		double porcentajeGanancia = 19;
		Ordenador o = new Ordenador(596, 9800, 568, "MSI", 1);

		Portatil p = new Portatil(596, 9800, 568, "MSI", 1, true, 150);

		Sobremesa s = new Sobremesa(596, 9800, 568, "MSI", 1, 65);

		System.out.println(o.calcularPrecioVenta(porcentajeGanancia));
		System.out.println("******************************************************************************");

		System.out.println(p.calcularPrecioVenta(porcentajeGanancia));
		System.out.println("******************************************************************************");

		System.out.println(s.calcularPrecioVenta(porcentajeGanancia));
	}

}
