package embarcaciones;

public class Velero extends Embarcacion 
{
    private double longMastiles;
    private int nMastiles;

    public Velero (String nombre, int capacidad, double dimensiones,
                        double longMastiles, int nMastiles)
    {
        super(nombre, capacidad, dimensiones);
        this.longMastiles = longMastiles;
        this.nMastiles = nMastiles;
    }

    @Override 
	public String toString() 
	{
		return "Velero: "+super.toString()+ ", " + this.nMastiles + " mastiles, de " + this.longMastiles + " metros";
	}
	
	@Override 
	public double getCoste() 
	{
		return super.getCoste() + this.nMastiles * this.longMastiles;
	}
}
