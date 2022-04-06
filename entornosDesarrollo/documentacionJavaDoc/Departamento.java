package documentacionJavaDoc;

/**
 * <h2>Clase Departamento se usa para crear y leer deptos de la bbdd</h2> Busca
 * la info de javadoc en <a href="https://www.google.com/">GOOGLE</a>
 * 
 * @see <a href="https://www.google.com/">Google</a>
 * @version 4-2022
 * @author diurno
 * @since 06/04/2022
 */
public class Departamento {
	/**
	 * Atributo codigo del depto
	 */
	private int codigo;
	/**
	 * Atributo nombre del depto
	 */
	private String nombre;
	/**
	 * Atributo activo del depto
	 */
	private boolean activo;

	/**
	 * Constructor con 3 parametros Crea un depto con codigo,nombre y activo
	 * 
	 * @param nombre   <i>Nombre del depto</i>
	 * @param apellido <i>Apellido del depto</i>
	 * @param salario  <i>Salario del depto</i>
	 */
	public Departamento(int codigo, String nombre, boolean activo) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.activo = activo;
	}

	/**
	 * Activa o desactiva el depto
	 * 
	 * @param subida <i>Status del depto</i>
	 */
	public boolean setStatus(boolean status) {
		return this.activo = status;
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
