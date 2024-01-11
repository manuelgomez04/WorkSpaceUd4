package ejercicio02;

public class TarjetaDeVisita extends Documento {
	private String nombreEmpleado;
	private String telefonoContacto;
	private String dni;

	public TarjetaDeVisita(String nombreEmpresa, String cif, String telefono, String direccion, String nombreEmpleado,
			String telefonoContacto, String dni) {
		super(nombreEmpresa, cif, telefono, direccion);
		this.nombreEmpleado = nombreEmpleado;
		this.telefonoContacto = telefonoContacto;
		this.dni = dni;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return super.toString() + "  Nombre del empleado= " + nombreEmpleado + ", Teléfono de contacto= "
				+ telefonoContacto + ", DNI= " + dni;
	}

	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.println("Nombre del empleado : " + nombreEmpleado);
		System.out.println("Teléfono de contacto del empleado: " + telefonoContacto);
		System.out.println("DNI del empleado: " + dni);
	}

}
