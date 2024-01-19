package ejemploInterfaces;

public interface IDepredador {

	// A los métodos que componen una interfaz, debido a que todos son abstractoss,
	// no es necesario escribir la palabra abstract.
	// Tampoco es necesario escribirle el "Public" delante, ya que por defecto todos
	// son públicos.

	// Los atributos de la interfaz son de tipo final y public, por lo que no hay
	// que escribirlo tampoco. Los atributos de las interfaces son constantes

	public abstract void cazar(Animal presa);

	void localizar(Animal presa);

}
