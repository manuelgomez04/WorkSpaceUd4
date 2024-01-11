package ejercio03;

public class Motocicleta extends Vehiculo {

	private double cilindrada;

	public Motocicleta(String matricula, String numeroBastidor, int categoriaEmisiones, double cilindrada) {
		super(matricula, numeroBastidor, categoriaEmisiones);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + "]";
	}

	public double calcularImpuesto() {

		double porcentaje = 0.6;
		return super.calcularImpuesto() + cilindrada * porcentaje;
	}
}
