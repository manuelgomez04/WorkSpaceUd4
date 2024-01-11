package ejercicio02;

public class Documento {

	private String nombreEmpresa;
	private String cif;
	private String telefono;
	private String direccion;

	public Documento(String nombreEmpresa, String cif, String telefono, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.cif = cif;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Nombre de la Empresa= " + nombreEmpresa + ", CIF= " + cif + ", Télefono= " + telefono + ", Dirección= "
				+ direccion;
	}
	
	public void imprimirDatos () {
		System.out.println("Nombre de la empresa: "+nombreEmpresa);
		System.out.println("CIF: "+ cif);
		System.out.println("Teléfono de contacto: "+ telefono);
		System.out.println("Dirección de la empresa: "+ direccion);
	}

}
