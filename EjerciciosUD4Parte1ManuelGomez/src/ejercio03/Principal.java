package ejercio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo v = new Vehiculo("324324", "904358", 1);
		Motocicleta m = new Motocicleta("893721985", "24307592347", 2, 125);
		Coche c = new Coche("893721985", "24307592347", 3, 297);
		Furgoneta f = new Furgoneta("893721985", "24307592347", 4, 599);

		System.out.println("Impuesto por moto");
		System.out.println(m.calcularImpuesto());
		System.out.println();
		System.out.println("Impuesto coche");
		System.out.println(c.calcularImpuesto());
		System.out.println();
		System.out.println("Impuesto furgoneta");
		System.out.println(f.calcularImpuesto());
	}

}
