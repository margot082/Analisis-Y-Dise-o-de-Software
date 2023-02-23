package embarcaciones;

/**
 * Esta clase es una clase abstracta que define la embarcacion.
 * Sirve para la definicion de metodos y atributos del que heredaran
 * posteriormente los subtiipos de embarcaciones 
 *
 * @author profesores de ADSOF
*/
public abstract class Embarcacion 
{	
	/*Costante publica, coste por hora bases de las embarcaciones*/
	public static final double COSTE_BASE = 5.0;
	/*Atributos*/
	private String nombre;			//nombre de la embarcacion
	private int    capacidad;		//capacidad de la embarcacion
	private double dimensiones;		//dimensiones de la embarcacion

	/**
     * Método constructor del objeto.
     *
     * Este método construye el objeto, este constructor solo sera llamado 
	 * por las subclases hijas mediante la utilizacion de supoer.
     *
     * @param nombre (String) cadena que indica el nombre de la lancha
     * @param capacidad (int) numero de personas que entran en el velero
     * @param dimensiones (double) tamano del Velero
    */
	public Embarcacion (String nombre, int capacidad, double dimensiones) 
	{
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.dimensiones = dimensiones;	
	}

	/**
     * Sobreescritura del metodo que transforma al objeto en una cadena
     *
     * Este método convierte correctamente en una cadena que muestra toda
     * la informacion necesaria.
     *
     * @return String. El objeto convertido en cadena
    */
	@Override 
	public String toString() 
	{		
		return this.nombre + ", capacidad: " + this.capacidad+ ", dimensiones " +this.dimensiones;
	}

	/**
     * Metodo de coste base de una embarcacion por dia
     *
     * El coste se calcula mediante la suma del coste base,
	 * las dimenciones y la capacidad
     *
     * @return double, el coste por dia
    */
	public double getCoste() 
	{
		return Embarcacion.COSTE_BASE+this.dimensiones+this.capacidad;
	}
}

