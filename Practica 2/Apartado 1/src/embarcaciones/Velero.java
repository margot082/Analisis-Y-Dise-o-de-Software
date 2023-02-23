package embarcaciones;

/**
 * Esta clase es subclase de Embarcacion y permite crear 
 * objetos de tipo Velero, que es un tipo de embarcacion sin motor. 
 *
 * @author Santiago Salas santiago.salas@estudiante.uam.es
 * @author Diego Nuñez diego.nunnezg@estudiante.uam.es
*/
public class Velero extends Embarcacion 
{   
    /*Atributos de la clase*/
    private double longMastiles; //longitud de los mastiles
    private int nMastiles;       //numero de mastiles

    /**
     * Método constructor del objeto.
     *
     * Este método construye el objeto a partir de constantes definidas en la propia clase
     * y mediante el metodo super para construir con la herencia de su clase padre.
     *
     * @param nombre (String) cadena que indica el nombre de la lancha
     * @param capacidad (int) numero de personas que entran en el velero
     * @param dimensiones (double) tamano del Velero
     * @param longMastiles (double) longitud de los mastiles del Velero
     * @param nMastiles (int) numero de mastiles del Velero
    */
    public Velero (String nombre, int capacidad, double dimensiones,
                        double longMastiles, int nMastiles)
    {
        super(nombre, capacidad, dimensiones);
        this.longMastiles = longMastiles;
        this.nMastiles = nMastiles;
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
		return "Velero: "+super.toString()+ ", " + this.nMastiles + " mastiles, de " + this.longMastiles + " metros";
	}
	
    /**
     * Sobreescritura del metodo que calacula el coste por dia de
     * esta embarcacion
     *
     * El coste por dia es el coste por dia normal de una enbarcacion
     * (mediante el getCoste de su padre, en este caso Embarcacion)
     * mas un coste extra que se calcula del numero de mastiles por la
     * longitud de estos mastiles
     *
     * @return double, el coste por dia
    */
	@Override 
	public double getCoste() 
	{
		return super.getCoste() + this.nMastiles * this.longMastiles;
	}
}
