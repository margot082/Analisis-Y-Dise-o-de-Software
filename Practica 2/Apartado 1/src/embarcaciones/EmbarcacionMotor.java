package embarcaciones;

/**
 * Esta clase es subclase de Embarcacion y permite crear 
 * objetos de tipo EmbarcacionMotor, que como su nombre
 * dice son embarcaciones con motor. 
 *
 * @author profesores de ADSOF
*/
public class EmbarcacionMotor extends Embarcacion 
{	
	/*Costante publica, coste por motor de estas embarcaciones*/
	public static final double COSTE_MOTOR = 20.0;

	/*Atributos*/
	private int numMotores;			//Numero de motores
	private TipoMotor tipoMotor;	//Tipo de motor
	
	/**
     * Método constructor del objeto.
     *
     * Este método construye el objeto a partir de constantes definidas en la propia clase
     * y mediante el metodo super para construir con la herencia de su clase padre.
     *
     * @param nombre (String) cadena que indica el nombre de la lancha
     * @param capacidad (int) numero de personas que entran en el velero
     * @param dimensiones (double) tamano del Velero
     * @param numMotores (int) numero de motores de esta embarcacion
     * @param motor (TipoMotor) referencia al ENUM tipo motor que establece que 
	 *               tipo de motor tiene esta embarcacion asi como su factor
	 *               de multiplicacion asociado
    */
	public EmbarcacionMotor (String nombre, int capacidad, double dimensiones, 
								  int numMotores, TipoMotor motor) 							  
	{
		super(nombre, capacidad, dimensiones);
		this.numMotores = numMotores;
		this.tipoMotor = motor;
	}
	
	/**
     * Sobreescritura del metodo que transforma al objeto en una cadena
     *
     * Este método convierte correctamente en una cadena que muestra toda
     * la informacion necesaria. Para ello utiliza la funcion de 
     * transformacion a cadena de su padre para todos los atributos heredados
     * y posteriormente muestra los atributos propios
     *
     * @return String. El objeto convertido en cadena
    */
	@Override 
	public String toString() 
	{
		return "Barco a motor: "+super.toString()+ ", motores: " + this.numMotores + ", tipo: " + this.tipoMotor;
	}
	
	/**
     * Sobreescritura del metodo que calcula el coste por dia de
     * este subtipo de embarcacion
     *
     * El coste por dia es el coste por dia normal de una enbarcacion
     * (mediante el getCoste de su padre, en este caso Embarcacion)
     * mas un coste extra que se calcula del numero de motores por el
	 * coste por motor por el factor asociado al tipo de motor
     *
     * @return double, el coste por dia
    */
	@Override 
	public double getCoste() 
	{
		return super.getCoste()+EmbarcacionMotor.COSTE_MOTOR*this.numMotores*this.tipoMotor.factorMotor();
	}
}

