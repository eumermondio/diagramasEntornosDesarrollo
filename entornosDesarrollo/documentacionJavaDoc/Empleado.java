package documentacionJavaDoc;

/**
 * <h2>Clase Empleado se usa para crear y leer empleados de la bbdd</h2> Busca
 * la info de javadoc en <a href="https://www.google.com/">GOOGLE</a>
 * 
 * @see <a href="https://www.google.com/">Google</a>
 * @version 4-2022
 * @author diurno
 * @since 06/04/2022
 */
public class Empleado {
	/**
	 * Atributo nombre del empleado
	 */
	private String nombre;
	/**
	 * Atributo apellido del empleado
	 */
	private String apellido;
	/**
	 * Atributo salario del empleado
	 */
	private double salario;

	/**
	 * Constructor con 3 parametros Crea un empleado con nombre,apellidos y salario
	 * 
	 * @param nombre   <i>Nombre del empleado</i>
	 * @param apellido <i>Apellido del empleado</i>
	 * @param salario  <i>Salario del empleado</i>
	 */
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	/**
	 * Sube el salario al empleado
	 * 
	 * @param subida <i>Subida del salario del empleado</i>
	 */
	public void subidaSalario(double subida) {
		this.salario *= subida;
	}

	/**
	 * Comprueba que el nombre no este vacio
	 * 
	 * @return
	 *         <ul>
	 *         <li>True: Si el nombre no esta vacio</li>
	 *         <li>False: Si el nombre esta vacio</li>
	 *         </ul>
	 */
	private boolean comprobar() {
		if (nombre.equalsIgnoreCase("")) {
			return false;
		}
		return true;
	}
}
