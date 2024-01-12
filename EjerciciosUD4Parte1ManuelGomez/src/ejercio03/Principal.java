package ejercio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vehiculo v = new Vehiculo("324324", "904358", 1);
		double porcentajeCilindrada = 60;
		double porcentajeCaballos = 25;
		Motocicleta m = new Motocicleta("893721985", "24307592347", 2, 125);
		Coche c = new Coche("893721985", "24307592347", 3, 297);
		Furgoneta f = new Furgoneta("893721985", "24307592347", 4, 112);

		System.out.println("Impuesto por moto");
		System.out.printf("%.2f", m.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println();
		System.out.println("Impuesto por coche");
		System.out.printf("%.2f", c.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
		System.out.println();
		System.out.println("Impuesto por furgoneta");
		System.out.printf("%.2f", f.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos));
	}

}
