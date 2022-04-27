package documentacionJavaDoc;

/**
 * <h2>Clase Automovil representa un automovil</h2> Busca la info de javadoc en
 * <a href="https://www.google.com/">GOOGLE</a>
 * 
 * @see <a href="https://www.google.com/">Google</a>
 * @version 4-2022
 * @author diurno
 */
public class Automovil {
	/**
	 * Atributo marca del automovil
	 */
	private String marca;
	/**
	 * Atributo color del automovil
	 */
	private String color;
	/**
	 * Atributo puertas del automovil
	 */
	private int puertas;
	/**
	 * Atributo precio del automovil
	 */
	private double precio;

	/**
	 * Constructor con 4 parametros Crea un automovil con sus propiedades
	 * 
	 * @param marca   <i>Marca del automovil</i>
	 * @param color   <i>Color del automovil</i>
	 * @param puertas <i>Puertas del automovil</i>
	 * @param precio  <i>Precio del automovil</i>
	 */
	public Automovil(String marca, String color, int puertas, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.puertas = puertas;
		this.precio = precio;
	}

	/**
	 * Calcula el descuento del automovil
	 * 
	 * @param precio <i>Precio inicial</i>
	 */
	public void CalcularDto(double precio) {
		precio = precio * 0.10;
	}
}
