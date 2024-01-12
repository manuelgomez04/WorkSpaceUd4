package ejemplo02Figuras;

public class Rectangulo {

	private double base;
	private double altura;

	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}
}
