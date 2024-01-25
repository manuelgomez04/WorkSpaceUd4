package ejercicio02;

public class Producto implements IImpuesto {

	public double calcularIva(double precio, int iva) {
		int cien = 100;
		return precio + precio * iva / cien;
	}

	public double calcularIrpf(double sueldo) {
		return 0;
	}

}
