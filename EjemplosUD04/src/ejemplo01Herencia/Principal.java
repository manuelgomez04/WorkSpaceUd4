package ejemplo01Herencia;

public class Principal {

	public static void main(String[] args) {
		
		Trabajador t = new Trabajador ("Manuel", "Empleado", "975514123f");
		
		Empleado e = new Empleado ("Manuel", "Empleado", "142254w",2000, 15);
		
		Empleado e2 = new Empleado ("3C", 1500.00, 12.5);
		
		Consultor c = new Consultor ("Juanjo", "Ni idea", "452315321z", 45, 20);
		
		System.out.println(t);
		System.out.println(e);
		System.out.println(e2);
		System.out.println(c);
	
		System.out.println(t.calcularPaga());
		
		System.out.println(e.calcularPaga());
		
		System.out.println(e2.calcularPaga());
		
		System.out.println(c.calcularPaga());
		
		
		c.avisarExtras();
		}

}
