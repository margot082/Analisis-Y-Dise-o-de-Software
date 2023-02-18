package entradas;
import conciertos.Concierto;

public class EntradaLowCost extends Entrada
{
    private String dni;
    public EntradaLowCost(double precio, Concierto concierto, String dni)
    {
        super(precio, Zona.PISTA, concierto);
        this.dni = dni;
    } 
}
