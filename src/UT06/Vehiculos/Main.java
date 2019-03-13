
package UT06.Vehiculos;

/**
 * Clase principal de ejemplo.
 * @author Salvador Romero Villegas
 */
public class Main {
    
    /**
     * Ejemplo de implementación de un método que admite como parámetro
     * una clase tipo abstracta (Vehiculo), usando polimorfismo.
     * @param v Instancia de Vehiculo (Coche o Moto).
     * @param distancia Distancia a recorrer.
     */
    public static void miMetodoRecorrer (Vehiculo v, double distancia)
    {
        v.recorrer(distancia);
    }
    
    /**
     * Ejemplo de implementación de un método que admite como parámetro
     * una interfaz (Encendible), usando polimorfismo.
     * @param e Instancia de clase que implementa la interfaz encendible.     
     */
    public static void endencerLoQueSea (Encendible e )
    {
        e.encender();
    }        
    
    /**
     * Código de ejemplo.
     * @param argv 
     */
    public static void main(String[] argv) {        
              
        Moto  moto1 = new Moto(1,"1234ABC");
        moto1.encender();
        miMetodoRecorrer(moto1,20.4);
        moto1.apagar();
        System.out.println(moto1.toString());
        
        Coche coche1 = new Coche(2,"1111AAA");
        Coche coche2 = new Coche(3,"2222BBB");
      
        coche1.encender();
        coche2.encender();
        
        
        miMetodoRecorrer(coche1,10.2); 
        
        coche2.recorrer(100.2);        
        coche1.resetTrayecto();
        
        miMetodoRecorrer(coche1,5);
        endencerLoQueSea(coche1); 
        System.out.println(coche1.toString());
        System.out.println(coche2.toString());
        
        PersonaPropietaria persona=new PersonaPropietaria("Pedro", "Arrinda");
        persona.añadirVehiculo(moto1);
        persona.añadirVehiculo(coche1);
        persona.añadirVehiculo(coche2);
        System.out.println(persona);
        
        Moto  moto2 = new Moto(1,"1234ABC");
        Encendible e=null;
        Vehiculo v=null;
        if (moto2 instanceof Encendible)
        {
            e=(Encendible)moto2;
        }
        if (moto2 instanceof Vehiculo)
        {
            v=(Vehiculo)moto2;
        }
        System.out.println(v);
    }
}
