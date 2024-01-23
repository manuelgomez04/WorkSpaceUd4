package ejercicio01;

public abstract class Publicacion implements IEjercicio01 {

	private int anioPublicacion;
	private String nombre;
	private boolean prestado;

	public Publicacion(int anioPublicacion, String nombre, boolean prestado) {
		super();
		this.anioPublicacion = anioPublicacion;
		this.nombre = nombre;
		this.prestado = prestado;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public abstract int prestados(Publicacion[] lista);

	public abstract int publicacionesAnterioresA(Publicacion[] listado, int anio);

}
