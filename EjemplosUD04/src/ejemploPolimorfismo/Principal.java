package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {

		int tam = 2;
		Figura lista[] = new Figura[tam];

		Figura cua = new Cuadrado("Cuadrado", "Azul", 2);
		Figura cir = new Circulo("Círculo", "Rosa", 2.5);

		// ESTO ES SOLO PPARA EL EJEMPLO
		// CABROOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOON
		lista[0] = cua;
		lista[1] = cir;
		OperacionesFiguras op = new OperacionesFiguras();

		System.out.printf("El área de un círculo es %.2f", op.calcularAreaFigura(cir));

		System.out.println();

		System.out.printf("El área de un cuadrado es %.2f", op.calcularAreaFigura(cua));

		System.out.println();

		cua.metodoSoloDeFigura();

		System.out.println(op.sumarAreas(lista));
		System.out.println(op.sumarAreasFiguras2(lista));

		/*
		 * CUANDO UN MÉTODO NO ES REESCRITO, SI EL OBJETO ES DEL TIPO DE LA MADRE,
		 * AUNQUE LO INSTANCIE COMO UN HIJO NO PODREMOS ACCEDER A ÉL, YA QUE NO ES
		 * POSIBLE HEREDAR HACIA ARRIBA.
		 */

		// cua.mostrarLado();
	}

}
