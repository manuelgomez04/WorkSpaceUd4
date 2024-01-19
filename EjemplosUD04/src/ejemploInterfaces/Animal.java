package ejemploInterfaces;

public class Animal implements IDepredador, IPresa {

	private String nombre;
	private int numPatas;

	public Animal(String nombre, int numPatas) {
		super();
		this.nombre = nombre;
		this.numPatas = numPatas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", numPatas=" + numPatas + "]";

	}

	@Override
	public void cazar(Animal presa) {
		System.out
				.println("AL ATAQUEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEER");
	}

	@Override
	public void localizar(Animal presa) {
		System.out.println("I´m looking for food");

	}

	@Override
	public void huir() {
		System.out.println("Yow corre loco");
	}

}
