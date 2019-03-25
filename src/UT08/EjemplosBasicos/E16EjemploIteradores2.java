package UT08.EjemplosBasicos;

import java.util.LinkedList;
import java.util.List;

/**
 * Ejemplo donde no se usan iteradores para acceder a la lista de elementos.
 * En su lugar, se usan bucles for-each.
 * @author Salvador Romero Villegas
 */
public class E16EjemploIteradores2 {
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
              
        // Convertimos un array en una lista (usando un bucle for-each)
        List<Rectangulo> lista=new LinkedList<>();
        for (Rectangulo rectangulo : rectangulos) {
            lista.add(rectangulo);
        }
                               
        // Mostramos las instancias de rectángulos (usando un bucle for-each)
        for (Rectangulo p : lista) {
            System.out.println(p);
        }
        
    }
}
