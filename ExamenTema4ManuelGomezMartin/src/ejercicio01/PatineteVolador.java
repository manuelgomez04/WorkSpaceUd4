package ejercicio01;

public class PatineteVolador extends Vehiculos {
	private double potencia;

	public PatineteVolador(String matricula, double tamanioEnMetros, int anioFabricacion, int numBastidor,
			double potencia) {
		super(matricula, tamanioEnMetros, anioFabricacion, numBastidor);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString() + "PatineteVolador Potencia= " + potencia + "\n";
	}

	public double calcularPrecio(double cantidad) {

		return potencia;
	}
}
