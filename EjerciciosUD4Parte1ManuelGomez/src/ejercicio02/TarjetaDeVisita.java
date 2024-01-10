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
		return super.toString() + " TarjetaDeVisita [nombreEmpleado=" + nombreEmpleado + ", telefonoContacto="
				+ telefonoContacto + ", dni=" + dni + "]";
	}

}
