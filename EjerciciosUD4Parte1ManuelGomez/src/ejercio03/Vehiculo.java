package ejercio03;

public class Vehiculo {

	private String matricula;
	private String numeroBastidor;
	private int categoriaEmisiones;

	public Vehiculo(String matricula, String numeroBastidor, int categoriaEmisiones) {
		super();
		this.matricula = matricula;
		this.numeroBastidor = numeroBastidor;
		this.categoriaEmisiones = categoriaEmisiones;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public int getCategoriaEmisiones() {
		return categoriaEmisiones;
	}

	public void setCategoriaEmisiones(int categoriaEmisiones) {
		this.categoriaEmisiones = categoriaEmisiones;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", numeroBastidor=" + numeroBastidor + ", categoriaEmisiones="
				+ categoriaEmisiones + "]";
	}

	public double calcularImpuesto() {
		double precio = 0;

		if (categoriaEmisiones == 1) {
			precio = 200;
		}
		if (categoriaEmisiones == 2) {
			precio = 300;
		}
		if (categoriaEmisiones == 3) {
			precio = 400;
		}
		if (categoriaEmisiones == 4) {
			precio = 500;
		}
		return precio;
	}

}
