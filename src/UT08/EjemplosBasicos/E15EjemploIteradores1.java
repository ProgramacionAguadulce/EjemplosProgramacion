package UT08.EjemplosBasicos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplo donde se usan iteradores para acceder a los elementos de una lista
 * de Rectángulos.
 * @author Salvador Romero Villegas
 */
public class E15EjemploIteradores1 {
     /** Clase anidada Rectangulo.
     * Esta clase encapsula un rectángulo.
     */
    public static class Rectangulo {
        private double ancho;
        private double alto;
        
        Rectangulo (double ancho, double alto)
        {
            this.ancho=ancho;
            this.alto=alto;            
        }

        public double getAncho() {
            return ancho;
        }

        public double getAlto() {
            return alto;
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
        rectangulos[0]=new Rectangulo(10,20);        
        rectangulos[1]=new Rectangulo(5,25);
        rectangulos[2]=new Rectangulo(15,23);
              
        // Convertimos un array en una lista
        List<Rectangulo> lista=new LinkedList<>();
        for (int i=0;i<rectangulos.length;i++)
        {
            lista.add(rectangulos[i]);
        }
                               
        // Mostramos las instancias de rectángulos  
        for (Iterator<Rectangulo> it=lista.iterator(); it.hasNext();)
        {
            Rectangulo p=it.next();
            System.out.println(p);
        }
        
    }
}
