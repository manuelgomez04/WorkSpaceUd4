package ejemploPolimorfismo;

public class Principal {

	public static void main(String[] args) {

		Figura cua = new Cuadrado("Cuadrado", "Azul", 2);
		Figura cir = new Circulo("Círculo", "Rosa", 2.5);

		OperacionesFiguras op = new OperacionesFiguras();

		System.out.printf("El área de un círculo es %.2f", op.calcularAreaFigura(cir));

		System.out.println();

		System.out.printf("El área de un cuadrado es %.2f", op.calcularAreaFigura(cua));

	}

}
