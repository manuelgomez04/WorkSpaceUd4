package ejercicio02;

public class Trabajador implements IImpuesto {

	private int irpf;

	public Trabajador(int irpf) {
		super();
		this.irpf = irpf;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public double calcularIva(double precio, int iva) {
		return 0;
	}

	public double calcularIrpf(double sueldo) {
		int cien = 100;

		return sueldo * irpf / cien;
	}

}
