package vehiculo;

import javax.swing.JOptionPane;

public class PruebaAuto {

    public static void main( String[] args )
    {
        Vehiculo auto[] = new Vehiculo[ 4 ];
        
        auto[ 0 ] = new Auto( "Pablo", 2, 4 );
        auto[ 1 ] = new Camioneta( "Ruben", 2, 4, 150.0 );
        auto[ 2 ] = new Taxi( "Alejandro", 4, 4, false );
        auto[ 3 ] = new CamionetaPasaje( "Susana", 6, 6, 512.0 );
       String salida="";
        for(int i=0; i < auto.length; i++)
        {
        salida += auto[ i ].toString();
        }
        for(int x=0; x < auto.length; x++)
        {
        salida += " \nEl auto  " + x + "  es de la clase " + auto[ x ].getClass().getName();
        }
  JOptionPane.showMessageDialog( null, salida ); // mostrar resultados
System.exit( 0 );
    
    }
}
