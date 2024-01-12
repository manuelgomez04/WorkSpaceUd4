package ejemplo02Figuras;

public class Rectangulo extends Figura {

	private double base;
	private double altura;

	public Rectangulo(double x, double y, double base, double altura) {
		super(x, y);
		this.base = base;
		this.altura = altura;
	}

	public double calcularArea() {
		return base * altura;
	}
}
