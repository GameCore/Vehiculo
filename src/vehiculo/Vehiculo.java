package vehiculo;

abstract public class Vehiculo
{
private String dueno;
private int puertas;
private int ruedas;

public Vehiculo( String dueno, int puertas, int ruedas )
{
this.dueno = dueno;
this.puertas = puertas;
this.ruedas = ruedas;
}

public void establecerDueno( String nuevoDueno )
{
dueno = nuevoDueno;
}

public String obtenerDueno()
{
return dueno;
}

public void establecerNumeroPuertas ( int numeroPuertas )
{
puertas = numeroPuertas;
}

public int obtenerNumeroPuertas()
{
return puertas;
}

public void establecerNumeroRuedas ( int numeroRuedas )
{
ruedas = numeroRuedas;
}

public int obtenerNumeroRuedas()
{
return ruedas;
}      


public abstract void caracteristicas(); 

public String toString()
    {
    return "El dueño es:" + obtenerDueno() + "\n" + "El numero de puertas es:"+obtenerNumeroPuertas()+"\n"+
            "El numero de ruedas es:"+ obtenerNumeroRuedas()+"\n";

    }

}