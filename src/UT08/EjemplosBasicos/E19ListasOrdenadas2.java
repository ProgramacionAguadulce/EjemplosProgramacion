package UT08.EjemplosBasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejemplo que se ordena una lista usando la "ordenación natural" del elemento.
 * Esta ordenación natural se realiza a través de la implementacion de la interfaz 
 * "Comparable".
 * @author Salvador Romero Villegas
 */
public class E19ListasOrdenadas2 {
    /** Clase anidada Rectangulo.
     * Esta clase encapsula un rectángulo.
     */
    public static class Rectangulo implements Comparable<Rectangulo> {
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
            return String.format("%s : %f x %f [Area: %f; Perimetro: %f]", name, ancho, alto, area(), perimetro());
        }

        @Override
        public int compareTo(Rectangulo o) {
            return name.compareTo(o.name);
        }
    }
    public static void main(String[] args)
    {             
        // Hacemos accesible la lista de rectángulos a través de su nombre, 
        // haciendo para ello un mapa:
        List<Rectangulo> lista=new ArrayList<>();
        lista.add(new Rectangulo("b",10,20));
        lista.add(new Rectangulo("a",5,25));
        lista.add(new Rectangulo("z",15,23));
        lista.add(new Rectangulo("d",11,88));
                
        // Mostramos la lista de rectángulos
        
        /*Un pequeño atajo para mostrar en una línea cada entrada de la 
          lista usando expresiones lambda de Java 8. Esto no se ve en el
          módulo, así que no os asustéis: */
        lista.forEach(System.out::println);        
        
        System.out.println("\nOrdenamos:\n");
        /* Y ahora ordenamos usando el comparador anterior */        
        Collections.sort(lista);      
        
        /* Mostramos ahora el contenido de la lista, que esta vez, aparecerá
        ordenado por nombre*/
        lista.forEach(System.out::println);
        
    }
}
