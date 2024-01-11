package ejercio03;

public class Coche extends Vehiculo {

	private double caballosCoche;

	public Coche(String matricula, String numeroBastidor, int categoriaEmisiones, double caballosCoche) {
		super(matricula, numeroBastidor, categoriaEmisiones);
		this.caballosCoche = caballosCoche;
	}

	public double getCaballosCoche() {
		return caballosCoche;
	}

	public void setCaballosCoche(double caballosCoche) {
		this.caballosCoche = caballosCoche;
	}

	@Override
	public String toString() {
		return "Coche [caballosCoche=" + caballosCoche + "]";
	}

	public double calcularImpuesto() {

		double porcentaje = 0.25;
		return super.calcularImpuesto() + caballosCoche * porcentaje;
	}
}
