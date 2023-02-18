package entradas;
import conciertos.Concierto;

public class EntradaVIP extends Entrada
{
    private String dni; 
    private String nombrePalco; 
    private int fila; 
    private int columna; 
    private boolean firma; 

    public EntradaVIP(double precio, Concierto concierto, String dni, String nombrePalco,
                            int fila, int columna, boolean firma)
    {
        super(precio, Zona.PALCO, concierto);
        this.dni = dni;
        this.nombrePalco = nombrePalco;
        this.fila = fila;
        this.columna = columna;
        this.firma = firma;
        return;
    }

    @Override
    public double precioEntrada()
    {
        if(firma)
            return super.precioEntrada() + super.getConcierto().getFirmas();
        return super.precioEntrada();
    }
}
