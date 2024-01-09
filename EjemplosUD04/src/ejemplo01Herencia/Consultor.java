package ejemplo01Herencia;

public class Consultor extends Trabajador{

	private int horas;
	private double tarifa;
	
	public Consultor(String nombre, String puesto, String dni, int horas, double tarifa) {
		super(nombre, puesto, dni);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString()+" Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}

	public double calcularPaga() {
		
		return horas * tarifa;
		
	}
	
	// AUNQUE NO SE USE DENTRO, PARA REESCRIBIR EL MÉTODO SIEMPRE TENDREMOS QUE PASAR EL PARÁMETRO QUE TENGA LA MADRE.
	// ESTE MÉTODO ES INÚTIL PERO NI PUTO CASO JAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJAJJAJAJASJDFHAKLSDJHGFLASHDGLAKDFJADFHLLKDHFLKGHSDFLKGHSKLDFJ
	
	public double calcularPagaV2 (double fijo) {
		
		return calcularPaga();
	}
	
}
