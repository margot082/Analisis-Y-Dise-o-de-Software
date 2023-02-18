package entradas;
import conciertos.Concierto;

public class EntradaLowCost extends EntradaIndividual
{

    public EntradaLowCost(double precio, Concierto concierto, String dni)
    {
        super(precio, Zona.PISTA, concierto, dni);
    } 
}
