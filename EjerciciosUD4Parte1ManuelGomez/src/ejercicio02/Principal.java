package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		Documento d = new Documento("Jamones Josemi", "2568412f", "688521132", "Calle Pavía 25");

		TarjetaDeVisita t = new TarjetaDeVisita("Jamones Josemi", "2568412f", "688521132", "Calle Pavía 25",
				"Juan José López", "655212232", "26354888c");

		Carta c = new Carta("Jamones Josemi", "2568412f", "688521132", "Calle Pavía 25", "10/01/2024");

		System.out.println(d);
		System.out.println("******************************************************************************");

		System.out.println(t);
		System.out.println("******************************************************************************");

		System.out.println(c);

	}

}
