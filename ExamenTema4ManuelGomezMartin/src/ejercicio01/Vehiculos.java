package ejercicio01;

public class Vehiculos implements IAlquiler {

	private String matricula;
	private double tamanioEnMetros;
	private int anioFabricacion;
	private int numBastidor;

	public Vehiculos(String matricula, double tamanioEnMetros, int anioFabricacion, int numBastidor) {
		super();
		this.matricula = matricula;
		this.tamanioEnMetros = tamanioEnMetros;
		this.anioFabricacion = anioFabricacion;
		this.numBastidor = numBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getTamanioEnMetros() {
		return tamanioEnMetros;
	}

	public void setTamanioEnMetros(double tamanioEnMetros) {
		this.tamanioEnMetros = tamanioEnMetros;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public int getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(int numBastidor) {
		this.numBastidor = numBastidor;
	}

	@Override
	public String toString() {
		return "Vehiculo Matrícula= " + matricula + ", Tamaño en metros= " + tamanioEnMetros + ", Año de Fabricación= "
				+ anioFabricacion + ", Número de bastidor= " + numBastidor + "\n";
	}

	@Override
	public double calcularPrecio(double cantidad) {
		int cien = 100;
		return tamanioEnMetros * anioFabricacion / cien;
	}

}
