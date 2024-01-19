package ejemploInterfaces;

public class Alumno extends Persona implements IPresa {

	private double notaMedia;

	public Alumno(String nombre, int edad, double notaMedia) {
		super(nombre, edad);
		this.notaMedia = notaMedia;
	}

	@Override

	public void huir() {
		// TODO Auto-generated method stub

	}

}
