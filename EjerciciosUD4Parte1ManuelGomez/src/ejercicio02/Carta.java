package ejercicio02;

public class Carta extends Documento {
	private String fecha;

	public Carta(String nombreEmpresa, String cif, String telefono, String direccion, String fecha) {
		super(nombreEmpresa, cif, telefono, direccion);
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return super.toString() + " Fecha= " + fecha;
	}

	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("Fecha: " + fecha);
	}

}
