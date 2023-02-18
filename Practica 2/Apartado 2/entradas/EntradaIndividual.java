package entradas;
import conciertos.Concierto;

public class EntradaIndividual extends Entrada
{
    private String dni;
    public EntradaIndividual(double precio, Zona zona, Concierto concierto, String dni)
    {
        super(precio, zona, concierto);
        this.dni = dni;
    } 
}
