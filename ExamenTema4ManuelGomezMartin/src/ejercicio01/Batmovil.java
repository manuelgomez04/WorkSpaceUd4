package ejercicio01;

public class Batmovil extends Vehiculos {

	private int numRuedas;

	public Batmovil(String matricula, double tamanioEnMetros, int anioFabricacion, int numBastidor, int numRuedas) {
		super(matricula, tamanioEnMetros, anioFabricacion, numBastidor);
		this.numRuedas = numRuedas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	@Override
	public String toString() {
		return super.toString() + "Batmovil Número de Ruedas= " + numRuedas + "\n";
	}

	public double calcularPrecio(double cantidad) {

		return cantidad * numRuedas;
	}

	public void avisarMaximo(int limite) {
		if (numRuedas > limite) {
			System.out.println("Desplegado al máximo");
		}
	}
}
