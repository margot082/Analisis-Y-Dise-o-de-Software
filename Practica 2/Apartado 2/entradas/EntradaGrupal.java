package entradas;

import java.util.ArrayList;
import java.util.List;
import conciertos.Concierto;

public class EntradaGrupal extends Entrada
{
    private List<EntradaIndividual> entradas;
    public EntradaGrupal()
    {

        this.entradas = new ArrayList<Entrada>();
    }

    public void add(EntradaIndividual e)
    {
        this.entradas.add(e);
    }

    @Override
    public double precioEntrada()
    {
        double precioTotal = 0.0;
        int i = 0;
        for(EntradaIndividual entrada : entradas)
        {
            precioTotal += entrada.precioEntrada();
            i += 1;
        }

        if(i < 15)
            return precioTotal - precioTotal*i/100;
        return precioTotal - precioTotal*0.15;
    }
}
