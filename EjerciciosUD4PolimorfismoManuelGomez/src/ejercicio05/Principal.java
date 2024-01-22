package ejercicio05;

public class Principal {

	public static void main(String[] args) {

		int tam = 5;
		double objetivoVenta = 10000;
		Empleado ger = new Gerente("José", "Ramirez", 1578.2, 1, 25);
		Empleado ger2 = new Gerente("José", "Ramirez", 1958.2, 2, 25);
		Empleado ven = new Vendedor("Pepe", "López", 1560, 3, 1670, 10);
		Empleado ven2 = new Vendedor("Pepe", "López", 1510, 4, 1670, 10);
		Empleado emp = new Empleado("Paco", "Perez", 1790, 5);
		Vendedor v = new Vendedor("dfsa", "hola", 1334, 6, 1798, 1233);

		Empleado lista[] = new Empleado[tam];

		lista[0] = ger;
		lista[1] = ger2;
		lista[2] = ven;
		lista[3] = ven2;
		lista[4] = emp;

		Oficina o = new Oficina(lista);

		System.out.println(ger.calcularSueldo());
		System.out.println();
		System.out.println(ger2.calcularSueldo());
		System.out.println();
		System.out.println(ven.calcularSueldo());
		System.out.println();
		System.out.println(ven2.calcularSueldo());
		System.out.println();
		System.out.println(emp.calcularSueldo());
		System.out.println();
		v.felicitarVenta(objetivoVenta);
		System.out.println();
		System.out.println(o.calcularSueldoEmpleado(emp));
		System.out.println();
		System.out.println(o.calcularTotalSueldos());
		System.out.println();

		o.mostrarEmpleados(objetivoVenta);

	}

}
