package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		int iva = 21;
		double precio = 100;
		double sueldo = 100000;

		Producto p = new Producto();

		Trabajador t = new Trabajador();

		System.out.println(p.calcularIva(precio, iva));
		System.out.println(t.calculoIrpf(sueldo));
	}

}
