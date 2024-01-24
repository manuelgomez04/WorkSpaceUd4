package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellidos, usuario, aux;
		int edad, tam = 5, indice = 0;
		double saldo1 = 4500, saldo2 = 250, saldo3 = 6340, mantenimiento = 20;
		double ingreso, retiro;
		Cliente cliente, cliente2, cliente3;
		Cuenta cuentaCorriente, cuentaJoven, cuentaEmpresa, lista[] = new Cuenta[tam];
		Oficina oficina;

		cliente = new Cliente("Israel", "Alcaraz Martínez", 25, "isal24");
		cliente2 = new Cliente("Maria", "Esther Herrera", 16, "maes07");
		cliente3 = new Cliente("Julio", "Vega Martoran", 30, "juve75");

		cuentaCorriente = new CuentaCorriente(cliente, saldo1, mantenimiento);
		cuentaJoven = new CuentaJoven(cliente2, saldo2);
		cuentaEmpresa = new CuentaEmpresa(cliente3, saldo3);

		lista[indice] = cuentaCorriente;
		indice++;
		lista[indice] = cuentaJoven;
		indice++;
		lista[indice] = cuentaEmpresa;
		indice++;

		oficina = new Oficina(lista);

		System.out.println("Introduzca cuanto desea ingresar:");
		aux = sc.nextLine();
		ingreso = Double.parseDouble(aux);
		cuentaCorriente.ingresarDinero(ingreso);
		System.out.printf("El saldo total de la cuenta corriente es de: %.2f€. Además ha obtenido %.2f puntos\n",
				cuentaCorriente.getSaldo(), ((CuentaCorriente) cuentaCorriente).getPuntos());
		cuentaJoven.ingresarDinero(ingreso);
		System.out.printf("El saldo total de la cuenta joven es de: %.2f€\n", cuentaJoven.getSaldo());
		cuentaEmpresa.ingresarDinero(ingreso);
		System.out.printf("El saldo total de la cuenta empresa es de: %.2f€\n", cuentaEmpresa.getSaldo());

		System.out.println("Introduzca cuanto desea retirar:");
		aux = sc.nextLine();
		retiro = Double.parseDouble(aux);
		cuentaCorriente.retirarDinero(retiro);
		System.out.printf("El saldo total de la cuenta corriente es de: %.2f€\n", cuentaCorriente.getSaldo());
		cuentaJoven.retirarDinero(retiro);
		System.out.printf("El saldo total de la cuenta joven es de: %.2f€\n", cuentaJoven.getSaldo());
		cuentaEmpresa.retirarDinero(retiro);
		System.out.printf("El saldo total de la cuenta empresa es de: %.2f€\n", cuentaEmpresa.getSaldo());

		// Prueba de los métodos de oficina
		System.out.printf("El dinero total de la oficina es de: %.2f€\n", oficina.totalDinero());
		System.out.printf("El dinero gastado en las cuentas jóvenes es de: %.2f€\n", oficina.calcularGastos());
		System.out.printf("El dinero ingresado por las cuentas de empresas es de: %.2f€\n",
				oficina.calcularIngresosEmpresas());
	}

}
