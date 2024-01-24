package ejercicio02;

public class Trabajador implements IImpuesto {

	@Override
	public double calcularIva(double precio, int iva) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		double pagar = 0;
		int cien = 100;
		int irpf = 0;

		if (sueldo <= 12450) {
			irpf = 19;
			pagar = sueldo * irpf / cien;
		}
		if (sueldo > 12450 && sueldo <= 20200) {
			irpf = 24;
			pagar = sueldo * irpf / cien;
		}
		if (sueldo > 20200 && sueldo <= 35199) {
			irpf = 30;
			pagar = sueldo * irpf / cien;
		}
		if (sueldo > 35199) {
			irpf = 37;
			pagar = sueldo * irpf / cien;
		}

		return pagar;
	}

}
