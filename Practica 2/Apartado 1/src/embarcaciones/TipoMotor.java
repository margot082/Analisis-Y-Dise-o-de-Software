package embarcaciones;

/**
 * Enumeracion para los tipos de motores de gasolina
 * pueden ser de gasolina, diesel o electrico
 * cada  uno de ellos tiene un factor de multiplicacion
 * asociado
 *
 * @author profesores de ADSOF
*/
public enum TipoMotor 
{
	/*Cada objeto del enumerado inicializa el factor en el constructor*/
	GASOLINA(2), DIESEL(1.5), ELECTRICO (1);				
	
	/*Atributos*/
	private double factor; 		// factor de coste
	
	/**
     * Método constructor del enumerador.
     *
     * Permite anadir nuevos tipos de motor con su propio factor de 
	 * multiplicacion
	 * 
	 * @param multip (double) factor de multiplicacion de este
	 *  		     tipo de motor
    */
	TipoMotor(double multip) 
	{	
		this.factor = multip;
	}
	
	/**
     * Método getter del atributo factor
	 * 
	 * @return (double) factor de multiplicacion de este
	 *  		     tipos de motor
    */
	public double factorMotor()
	{ 
		return this.factor;
	}
}
