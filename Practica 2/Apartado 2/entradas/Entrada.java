package entradas;
import conciertos.Concierto;

public abstract class Entrada
{   
    private double precioBase;
    private Zona zona;
    private Concierto concierto;
    public Entrada(double precio, Zona zona, Concierto concierto)
    {
        this.precioBase = precio;
        this.zona = zona;
        this.concierto = concierto;
        return;
    }

    public double precioEntrada()
    {
        if(concierto.getTipoLocalizacion() == ESTADIO)
            return precioBase + precioBase * 0.02;
        return precioBase;
    }

    public Concierto getConcierto()
    {
        return this.concierto;
    }

    @Override
    public String toString()
    {
        return "Entrada de: " + this.concierto + "en Zona" + zona + " por " + this.precioEntrada() + " euros.";
    }
}