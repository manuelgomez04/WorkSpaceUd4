package ejemplo01Herencia;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, String dni, double sueldo, double impuestos) {
		super(nombre, puesto, dni); // Súper es una llamada al constructor de la clase madre (trabajador en este caso) 
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	
	
}
