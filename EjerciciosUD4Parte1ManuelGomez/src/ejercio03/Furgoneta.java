package ejercio03;

public class Furgoneta extends Vehiculo {

	private double impuestoMercancia;

	public Furgoneta(String matricula, String numeroBastidor, int categoriaEmisiones, double impuestoMercancia) {
		super(matricula, numeroBastidor, categoriaEmisiones);
		this.impuestoMercancia = impuestoMercancia;
	}

	public double getCaballosFurgo() {
		return impuestoMercancia;
	}

	public void setCaballosFurgo(double caballosFurgo) {
		this.impuestoMercancia = caballosFurgo;
	}

	@Override
	public String toString() {
		return "Furgoneta [caballosFurgo=" + impuestoMercancia + "]";
	}

	public double calcularImpuesto(double porcentajeCilindrada, double porcentajeCaballos) {

		return super.calcularImpuesto(porcentajeCilindrada, porcentajeCaballos) + impuestoMercancia;

	}
}
