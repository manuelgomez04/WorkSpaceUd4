package ejemploPolimorfismo;

public class OperacionesFiguras {

	public double calcularAreaFigura(Figura F) {
		return F.calcularArea();
	}

	public double sumarAreas(Figura lista[]) {

		double resultado = 0;

		for (int i = 0; i < lista.length; i++) {
			resultado += calcularAreaFigura(lista[i]);
		}
		return resultado;
	}

	// ESTE ES EL MÉTODO QUE NO USAREMOS, YA QUE DIGAMOS QUE NOS "SALTAMOS" UN PASO
	// EN EL POLIMORFISMO. YA QUE ES MENOS GENÉRICA.

	public double sumarAreasFiguras2(Figura[] lista) {

		double suma = 0;

		for (int i = 0; i < lista.length; i++) {
			suma += lista[i].calcularArea();
		}
		return suma;
	}

	public double sumarAreaAviso(Figura[] lista) {

		double resultado = 0;

		for (int i = 0; i < lista.length; i++) {
			resultado += calcularAreaFigura(lista[i]);

			// EN ESTE CASO QUEREMOS QUE SI ES UN CÍRCULO, NOS MUESTRE EL MÉTODO MOSTRAR
			// RADIANES, EXCLUSIVO DE LA CLASE CÍRCULO, TENEMOS QUE CASTEAR
			// UNA FIGURA COMO UN CÍRCULO, PARA PODER ACCEDER AL MÉTODO.
			if (lista[i] instanceof Circulo) {

				// FORMA 1 (VOY A USAR ESTO)
				((Circulo) lista[i]).mostrarRadianes();
				// MEJOR NO USARLO
				Circulo c = (Circulo) lista[i];
				c.mostrarRadianes();
			}
		}
		return resultado;

	}

}
