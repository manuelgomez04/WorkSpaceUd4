package ejemploInterfaces;

public class Principal {

	public static void main(String[] args) {

		Animal a = new Animal("programador", 2);

		a.localizar(a);
		a.cazar(a);

		Persona p = new Persona("Luismi", 46);
		System.out.println();
		p.localizar(a);
		p.cazar(a);

		Persona A = new Alumno("Manuel", 19, 6.57);
		System.out.println();
		a.huir();
	}

}
