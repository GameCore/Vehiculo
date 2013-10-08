package vehiculo;

public class Taxi extends Auto{
    private String capo;
    //private String caracteristicas="";
    private String caracteristicas = "Tipo:Camioneta Modelo:B451  Velocidad Maxima:250Km/h Caja de Velocidad: Automatico \n";
    
    Taxi( String nombre, int numeroPuertas, int numeroRuedas, boolean descapotable )
    {
    super( nombre , numeroPuertas, numeroRuedas );
    ponerCapota(descapotable);
    }
    
    public void ponerCapota( boolean descapotable )
    {
    capo = descapotable== false ? "Si descapotable \n " : "No es descapotable \n";
    }
    
    public String obtenerCapota()
    {
    return capo;
    }
    
    public void caracteristicas()
{
caracteristicas = "Tipo:Camioneta Modelo:B451  Velocidad Maxima:250Km/h   Caja de Velocidad: Automatico\n";
}

public String obtenerCaracteristicas()
{
return caracteristicas;
}
public String toString()
    {
    return super.toString() + "Capota:" + obtenerCapota();
    }
    
    
}
