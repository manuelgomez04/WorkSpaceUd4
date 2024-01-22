package ejercicio05;

public class Empleado {

	private String nombre;
	private String apellidos;
	private double sueldoBase;
	private int numEmpleados;

	public Empleado(String nombre, String apellidos, double sueldoBase, int numEmpleados) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sueldoBase = sueldoBase;
		this.numEmpleados = numEmpleados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", sueldoBase=" + sueldoBase
				+ ", numEmpleados=" + numEmpleados + "]";
	}

	public double calcularSueldo() {
		return sueldoBase;
	}
}
