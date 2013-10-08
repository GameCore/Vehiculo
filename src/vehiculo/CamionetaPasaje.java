
package vehiculo;

public class CamionetaPasaje extends Camioneta{
 
    //private String caracteristicas="";
    private String caracteristicas="Tipo:Camioneta de Pasaje Modelo:NJ51  Velocidad Maxima:220Km/h  Caja de Velocidad: Manual\n";
    
    public CamionetaPasaje(String nombre, int puertas, int ruedas, double peso)
    {
   super( nombre , puertas , ruedas, peso );
   
    }
    

    public void caracteristicas()
{
caracteristicas = "Tipo:Camioneta de Pasaje Modelo:NJ51  Velocidad Maxima:220Km/h   Caja de Velocidad: Manual\n";
}

public String obtenerCaracteristicas()
{
return caracteristicas;
}
public String toString()
    {
    return super.toString();
    }   
    
}
