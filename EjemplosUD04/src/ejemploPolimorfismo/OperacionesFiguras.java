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

}
