package puerto;
import embarcaciones.*;

/**
 * Esta clase es define el controlador del puerto donde
 * estaran todas las embarcaciones
 *
 * @author profesores de ADSOF
*/
public class ControladorPuerto 
{	
	/**
     * Punto de entrada del programa
     *
     * Crea una serie de embarcaciones de distintos tipos y distintos
	 * atributos para posteiormente calcular e imprimir por pantalla
	 * los costes por dia de cada embarcacion, asi como el coste
	 * total de todas las embarcaciones
    */
	public static void main(String[] args) 
	{	
		/*Crea las embarcaciones*/
		Embarcacion[] barcos = 
		{ 
				new EmbarcacionMotor("New Titanic", 20, 55.5, 2, TipoMotor.ELECTRICO),
				new Velero("Mini Lusitania", 30, 65, 4.5, 2),
				new EmbarcacionMotor("Nautilus", 3, 26.5, 1, TipoMotor.GASOLINA),
				new EmbarcacionMotor("Bismark pro", 10, 32.7, 3, TipoMotor.DIESEL),
				new LanchaCompeticion("Victory", false)
		};
		
		double costeTotal = 0;
		/*Costes de cada embarcacion*/
		for (Embarcacion e : barcos) 
		{			
			System.out.println(e + "\n  - Coste: "+e.getCoste()+" euros/dia");
			costeTotal += e.getCoste();
		}
		/*Coste total*/
		System.out.println("\nCoste total: "+costeTotal+" euros");
	}
}
