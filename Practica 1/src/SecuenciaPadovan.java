import java.util.*;

/*
 * Esta aplicacion crea secuencias de tipo Padovan
 * del estilo p(n) = p(n-2) + p(n-3)
 * 
 * @author Santiago Salas santiago.salas@estudiante.uam.es
 * @author Diego Nuñez diego.nunnezg@estudiante.uam.es
 */
public class SecuenciaPadovan 
{   
    /*Atributos privados de la secuencia*/
    private static final List<Integer> PADOVAN_INIT = List.of(1, 1, 1);
    private List<Integer> secuencia;

    /*
     * Constructor del objeto.
     * 
     * Este metodo contruye el objeto a partir de los argumentos creados
     * @param num (int): Tamaño de la secuencia que se quiere crear  
     */
    public SecuenciaPadovan(int num) 
    {
        this.secuencia = new ArrayList<>(PADOVAN_INIT);
        while (this.secuencia.size()<num)
            this.next();
    }

    /*
     * Sobreescritura del metodo toString para poder trasformar correctamente
     * el objeto a cadena.
     * 
     * @return (Sting): representacion de la secuencia del objeto como String
     */
    @Override
    public String toString() 
    {
        return this.secuencia.toString();
    }

    /*
     * Metodo que genera el siguiente valor de la secuencia y lo añade a
     * la secuencia del objeto.
     * 
     * @return proxElemento (int): El proximo elemento de la secuencia
     */
    public int next() 
    {
        int numElementos = this.secuencia.size();
        int proxElemento = this.secuencia.get(numElementos-2)+this.secuencia.get(numElementos-3);
        this.secuencia.add(proxElemento);
        return proxElemento;
    }

    /*
     * Revisa si una secuencia pasada como argumento es o no es una secuencia
     * Padovan. 
     * 
     * @param seq (List<Integer>): Secuencia a comprobar
     * @return (boolean): true si el argumento es una secuencia Padovan, false si no lo es.
     */
    public static boolean esPadovan(List<Integer> seq) 
    {
        if (seq.size()<3) return false;
        SecuenciaPadovan sp = new SecuenciaPadovan(seq.size());
        return sp.secuencia.equals(seq);
    }

    /*
     * Punto de entrada de la aplicacion
     * 
     * Este metodo itera sobre los argumentos de entrada. Para cada uno de ellos 
     * genera su secuencia Padovan, la imprime por pantalla y posteriormente añade un elemento adicional.
     * Tiene un correcto control de errores para numeros enteros inferiores a 3 (debido a que la secuencia
     * Padovan mas corta tiene longitud 3). Pero no para argumentos de tipos diferentes al entero
     * 
     * Tras iterar sobre los argumentos, se realiza la comprobacion de dos secuencias para revisar si son Padovan
     * y se imprimen los resultados por pantalla.
     * 
     * @param args Los argumentos de la línea de comando, se esperan numeros enteros
     */
    public static void main (String ...args) 
    {
        for (String size : args) 
        {
            int len = Integer.valueOf(size);
            if (len<3)
                System.out.println("Longitud "+len+" incorrecta");
            else 
            {
                SecuenciaPadovan sp = new SecuenciaPadovan(Integer.valueOf(size));
                System.out.println("\nSecuencia de longitud "+len+": "+sp);
                System.out.println("Siguiente elemento: "+sp.next());
                System.out.println("Secuencia final: "+sp);
            }
        }
        System.out.println(SecuenciaPadovan.esPadovan(List.of(1, 1, 1, 2, 2, 3)));
        System.out.println(SecuenciaPadovan.esPadovan(List.of(1, 1)));
    }
}