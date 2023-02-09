import java.util.*;

/*
 * Esta aplicacion muestra generaliza la creacion de secuencias
 * del estilo p(n) = p(n-i) + p(n-j)
 * 
 * @author Santiago Salas santiago.salas@estudiante.uam.es
 * @author Diego Nuñez diego.nunnezg@estudiante.uam.es
 */
public class SecuenciaSkiponacci 
{   
    /*Atributos privados de la clase*/
    private int first, second;
    private List<Integer> sequence;

    /*
     * Constructor del objeto.
     * 
     * Este metodo contruye el objeto a partir de los argumentos creados
     * Crea objetos de secuencia de tipo p(n) = p(n-i) + p(n-j)
     * 
     * @param first (int): correspondiente al valor de i en la formula de creacion de la  frecuencia
     * @param second (int): correspondiente al valor de j en la formula de creacion de la  frecuencia
     * @param init (List<Integer>): Lista de valores iniciales de la secuencia
     * @param n (int): Tamaño de la secuencia que se quiere crear  
     */
    public SecuenciaSkiponacci(int first, int second, List<Integer> init, int n)
    {
        this.first = first;
        this.second = second;
        this.sequence = new ArrayList<>(init);
        while(this.sequence.size() < n) 
        {
            this.next();
        }
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
        return this.sequence.toString();
    }

    /*
     * Metodo que genera el siguiente valor de la secuencia y lo añade a
     * la secuencia del objeto.
     * 
     * @return proxElemento (int): El proximo elemento de la secuencia
     */
    public int next() 
    {
        int numElementos = this.sequence.size();
        int proxElemento = this.sequence.get(numElementos-first)+this.sequence.get(numElementos-second);
        this.sequence.add(proxElemento);
        return proxElemento;
    }

    /*
     * Metodo que comprueba si la secuencia pasada como argumento es del mismo
     * tipo que la secuencia del objeto.
     * 
     * 
     * @param seq (List<Integer>): Secuencia a comprobar
     * @return (boolean): true si son del mismo tipo, false si no lo son
     */
    public boolean esSecuencia(List<Integer> seq) 
    {   
        /*Tamaño de la secuencia a comprobar*/
        int n = seq.size();
        
        /*Si la secuencia del objeto es mas corta que la secuencia a comprobar
         * Se genera una nueva secuencia a partir de la del objeto pero de tamaño n
         * La nueva secuencia se compara con la secuencia a comprobar para revisar si son iguales
         */
        if(this.sequence.size() < n)
        {
            SecuenciaSkiponacci tester = new SecuenciaSkiponacci(this.first, this.second, this.sequence, n);
            return tester.sequence.equals(seq);
        }
        /*Si la secuencia del objeto es igual de larga o mas larga, se recorta 
         * y se compara con la secuencia a comprobar
         */
        else
        {
            List<Integer> tester = new ArrayList<>(this.sequence.subList(0,n));
            return tester.equals(seq);
        }
       
    }

    /*
     * Punto de entrada de la aplicacion.
     * 
     * Este metodo genera 3 tipos de secuencia utilizando el constructor
     * Imprime por pantalla las 3 secuencias creadas
     * Añade un valor a una de las secuencias y imprime los cambios
     * Comprueba si una secuencia es fibonacci y si otra seccuencia es perrin
     * 
     * @param args Los argumentos de la línea de comando
     */
    public static void main (String ...args) 
    {
        SecuenciaSkiponacci padovan = new SecuenciaSkiponacci(2, 3, List.of(1, 1, 1), 10);
        SecuenciaSkiponacci perrin = new SecuenciaSkiponacci(2, 3, List.of(3, 0, 2), 10);
        SecuenciaSkiponacci fibonacci = new SecuenciaSkiponacci(1, 2, List.of(0, 1), 10);
        System.out.println("Padovan[10] : "+ padovan);
        System.out.println("Perrin[10] : "+ perrin);
        System.out.println("Fibonacci[10]: "+ fibonacci);
        System.out.println("Fibonacci(11): "+ fibonacci.next());
        System.out.println("Fibonacci[11]: "+ fibonacci);
        System.out.println("Es Fibonacci?: "+ fibonacci.esSecuencia(List.of(0, 1, 1, 2, 3)));
        System.out.println("Es Perrin?: "+ perrin.esSecuencia(List.of(3, 0, 2, 4)));
    }
}
    