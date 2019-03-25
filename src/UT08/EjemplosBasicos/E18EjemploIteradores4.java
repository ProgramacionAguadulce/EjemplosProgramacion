package UT08.EjemplosBasicos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Ejemplo completo de uso de los iteradores con Mapas. En este ejemplo
 * se muestra como usar los iteradors para recorrer en los mapas la lista
 * de claves, la lista de valores y la lista de entradas (Entry).
 * @author Salvador Romero Villegas
 */
public class E18EjemploIteradores4 {
    /** Clase anidada Rectangulo.
     * Esta clase encapsula un rectángulo.
     */
    public static class Rectangulo {
        private String name;
        private double ancho;
        private double alto;
        
        Rectangulo (String name,double ancho, double alto)
        {
            this.name=name;
            this.ancho=ancho;
            this.alto=alto;            
        }

        public double getAncho() {
            return ancho;
        }

        public double getAlto() {
            return alto;
        }
        
        public String getName()
        {
            return name;
        }
        
        public double area ()
        {
            return ancho*alto;
        }
        
        public double perimetro()
        {
            return ancho*2+alto*2;
        }
        
        @Override
        public String toString()
        {
            return String.format("%f x %f [Area: %f; Perimetro: %f]",ancho, alto, area(), perimetro());
        }
    }
    public static void main(String[] args)
    {
        // Creamos varias instancias de la clase Rectangulo
        Rectangulo[] rectangulos=new Rectangulo[3];
        rectangulos[0]=new Rectangulo("a",10,20);        
        rectangulos[1]=new Rectangulo("b",5,25);
        rectangulos[2]=new Rectangulo("c",15,23);
              
        // Hacemos accesible la lista de rectángulos a través de su nombre, 
        // haciendo para ello un mapa:
        Map<String, Rectangulo> m=new HashMap<>();
        for(Rectangulo r:rectangulos)
        {
            m.put(r.getName(),r);
        }
                                               
        // Mostramos la lista de claves (key) del mapa:
        for (String clave: m.keySet())
        {
            System.out.println("Clave: "+clave);
        }
        
        // Mostramos la lista de valores (value) del mapa:
        for (Rectangulo value: m.values())
        {
            System.out.println("Values: "+value.toString());
        }
        
        // Mostramos el key y el valor usando cada Entry del Mapa
        for (Entry<String,Rectangulo> entry: m.entrySet())
        {
            System.out.println(entry.getKey() + " = "+ entry.getValue());
        }
        
    }
}
