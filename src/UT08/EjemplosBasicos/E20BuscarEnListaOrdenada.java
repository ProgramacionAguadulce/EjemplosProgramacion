package UT08.EjemplosBasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejemplo en el que se muestra como buscar en una lista ordenada.
 * @author Salvador Romero Villegas
 */
public class E20BuscarEnListaOrdenada {
    /** Clase anidada Rectangulo.
     * Esta clase encapsula un rectángulo.
     */
    public static class Rectangulo implements Comparable<Rectangulo> {
        private String name;
        private double ancho;
        private double alto;
        
        /* 1º Es normal añadir un constructor mínimo, con lo mínimo
        que debe tener el rectangulo (ancho y alto se consideran por
        defecto 0).*/
        Rectangulo (String name)
        {
            this.name=name;
        }
        
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
                
        /* 2º Ordenamos usando el comparador anterior */        
        Collections.sort(lista);      
        
        
        /* 3º Buscamos proporcionando una instancia de rectangulo que "contenga"
        la información de búsqueda, para eso usamos el constructor de mínimo. */
        int posicion=Collections.binarySearch(lista, new Rectangulo("d") );
        
        /* 
        4º Si la posición retornada es distinta de -1 entonces se encontro el 
        elemento en dicha posición.
        */
        if (posicion==-1)
        {
            System.out.println("Elemento no encontrado.");
        }
        else
        {
            System.out.printf("Rectangulo `d` encontrado en la posicion %d.\n",posicion);
            System.out.println(lista.get(posicion));
        }
                
        
    }
}
