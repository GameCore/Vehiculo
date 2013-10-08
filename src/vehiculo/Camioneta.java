package vehiculo;

public class Camioneta extends Vehiculo
{

    private double carga;
    //private String caracteristicas="";
    private String caracteristicas="Tipo:Camioneta Modelo:B451  Velocidad Maxima:260Km/h   Caja de Velocidad: Manual\n";
    
   public Camioneta(String nombre, int puertas, int ruedas, double peso )
   {
   super( nombre , puertas , ruedas );
   carga( peso );
   }
   
   public void carga( double kilos )
   {
   carga = kilos;
   }
   
   public double obtenerCarga()
   {
   return carga;
   }

public void caracteristicas()
{
String a="Tipo:Camioneta\nModelo:B451\n Velocidad Maxima:260Km/h \n Caja de Velocidad: Manual\n";
  caracteristicas = a;
}

public String obtenerCaracteristicas()
{
return caracteristicas;
}
public String toString()
    {
    return super.toString()+ "El maximo peso que soporta es:" + obtenerCarga() + "Kg" +"\n"+ obtenerCaracteristicas();
    }
}