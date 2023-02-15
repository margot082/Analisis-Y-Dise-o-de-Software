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
    private boolean catamaran;

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
     * y mediante la herencia de su clase padre.
     *
     * @param 
    */
    public LanchaCompeticion (String nombre, boolean catamaran)
    {
        super(nombre, CAPACIDAD, DIMENSIONES, NUM_MOTORES, TIPO_MOTOR);
        this.catamaran = catamaran;
    }

    @Override 
	public String toString() 
	{
		if(catamaran) return super.toString() +", de competicion (catamaran)";
        return super.toString() +", de competicion";
	}
	
	@Override 
	public double getCoste() 
	{   
        if(catamaran) return COSTE_LANCHA + EXTRA_CATAMARAN;
        return COSTE_LANCHA;
	}
}