package vehiculo;

public class Auto extends Vehiculo
{
private boolean descapotable = true;
private String estado;
//private String caracteristicas="";
private String caracteristicas="Tipo:Automovil   Modelo:A365   Velocidad Maxima:200Km/h   Caja de Velocidad: Estandar \n";

public Auto( String nombre, int numeroPuertas, int numeroRuedas )
{
super( nombre , numeroPuertas, numeroRuedas );
}

public void subir( boolean estadoCapota )
{
descapotable = estadoCapota == true ? true : false;
}

public void bajar( boolean estadoCapota )
{
descapotable = estadoCapota == false ? false : true;
}
public String obtenerEstadoCapota()
{
this.estado = descapotable == true ? "La capota esta arriba \n" : "La capota esta abajo \n";
return estado;
}
public void caracteristicas()
{
   caracteristicas = "Tipo:Automovil \n Modelo:A365 \n Velocidad Maxima:200Km/h \n Caja de Velocidad: Estandar \n";
}
public String obtenerCaracteristicas()
{
return caracteristicas;
}
public String toString()
    {
    return super.toString() + obtenerEstadoCapota() + obtenerCaracteristicas();
    }

  
}