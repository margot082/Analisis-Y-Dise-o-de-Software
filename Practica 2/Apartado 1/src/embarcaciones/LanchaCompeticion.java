package embarcaciones;

/**
 * Esta clase es subclase de EmbarcacionMotor y permite crear 
 * objetos de tipo LanchaCompeticion.
 *
 * @author Santiago Salas santiago.salas@estudiante.uam.es
 * @author Diego Nuñez diego.nunnezg@estudiante.uam.es
*/
public class LanchaCompeticion extends EmbarcacionMotor 
{   
    /* Atributos privados de clase*/
    private boolean catamaran;      //es o no catamaran 

    /* Constantes usadas para inicializar LanchaCompeticion.*/
    private static final int CAPACIDAD = 1;
    private static final double DIMENSIONES = 49.0;
    private static final int NUM_MOTORES = 1;
    private static final TipoMotor TIPO_MOTOR = TipoMotor.GASOLINA;
    private static final double COSTE_LANCHA = 200.0;
    private static final double EXTRA_CATAMARAN = 50.0;

    /**
     * Método constructor del objeto.
     *
     * Este método construye el objeto a partir de constantes definidas en la propia clase
     * y mediante el metodo super para construir aprovechando la herencia de EmbarcacionMotor.
     *
     * @param nombre (String) cadena que indica el nombre de la lancha
     * @param catamaran  (boolean) true si la lancha es un catamaran,
     *                   false si no lo es
    */
    public LanchaCompeticion (String nombre, boolean catamaran)
    {
        super(nombre, CAPACIDAD, DIMENSIONES, NUM_MOTORES, TIPO_MOTOR);
        this.catamaran = catamaran;
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
		if(catamaran) return super.toString() +", de competicion (catamaran)";
        return super.toString() +", de competicion";
	}
	
    /**
     * Sobreescritura del metodo que calacula el coste por dia de
     * esta embarcacion
     *
     * El coste por dia es de 200 con un extra de 50 en caso de
     * ser un catamaran
     *
     * @return double, el coste por dia
    */
	@Override 
	public double getCoste() 
	{   
        if(catamaran) return COSTE_LANCHA + EXTRA_CATAMARAN;
        return COSTE_LANCHA;
	}
}
