package ejemplo02Figuras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura cuadrado = new Cuadrado(1, 2, 2);
		Figura rectangulo = new Rectangulo(1, 2, 3, 4);

		System.out.println(cuadrado.calcularArea());
		System.out.println(rectangulo.calcularArea());

	}

}
