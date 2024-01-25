package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		int iva = 21, irpf = 20;
		double precio = 100;
		double sueldo = 15000;

		Producto p = new Producto();

		Trabajador t = new Trabajador(irpf);

		System.out.println(p.calcularIva(precio, iva));
		System.out.println(t.calcularIrpf(sueldo));
	}

}
