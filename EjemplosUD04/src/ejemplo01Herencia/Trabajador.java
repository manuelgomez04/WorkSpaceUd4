package ejemplo01Herencia;

public class Trabajador {

	private String nombre;
	private String puesto;
	private String dni;
	
	public Trabajador(String nombre, String puesto, String dni) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
		this.dni = dni;
	}
	
	

	public Trabajador(String dni) {
		super();
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + ", dni=" + dni + "]";
	}
	
	public double calcularPaga () {
		return 0.0;
	}
	
	
	/*ESTO NO ES UN RETOQUE DE CALCULAR PAGA, ES OTRA COSA*/
	public double calcularPagaV2 (double fijo) {

		return fijo;
		
	}
	
	public void darBaja () {
		
		puesto = "Baja";
		
	}
	
}
