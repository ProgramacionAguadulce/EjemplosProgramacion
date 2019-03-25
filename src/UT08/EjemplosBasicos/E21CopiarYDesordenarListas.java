package UT08.EjemplosBasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ejemplo de como copiar y desordenar listas.
 * @author Salvador Romero Villegas
 */
public class E21CopiarYDesordenarListas {
    /** Clase anidada Rectangulo.
     * Esta clase encapsula un rectángulo.
     */
    public static class Rectangulo implements Comparable<Rectangulo> {
        private String name;
        private double ancho;
        private double alto;
        
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
        List<Rectangulo> lista1=new ArrayList<>();
        lista1.add(new Rectangulo("b",10,20));
        lista1.add(new Rectangulo("a",5,25));
        lista1.add(new Rectangulo("z",15,23));
        lista1.add(new Rectangulo("d",11,88));
                
        /* Ordenamos la lista1 */                
        Collections.sort(lista1);      
        
        /* 1º Vamos a copiar una lista a otra usando el constructor copia.
        lista2 contendrá exactamente los mismos elementos que lista 1 en 
        el mismo orden (no se crean copias de los objetos almacenados),
        pero serán listas diferentes.*/
        List<Rectangulo> lista2=new ArrayList<>(lista1);
        
        /* 2º Vamos a copiar una lista a otra usando el método addAll. */   
        //Creamos una lista vacía
        List<Rectangulo> lista3=new ArrayList<>();         
        //Añadimos el contenido de lista1 a lista3
        lista3.addAll(lista1); 
        
        /* Le damos la vuelta a la lista 2 */
        Collections.reverse(lista2);

        /* Desordenamos la lista 3 */
        Collections.shuffle(lista3);
        
        /* Mostramos las 3 listas */
        System.out.println("Mostramos la lista 1 (ordenada ascendentemente):");
        lista1.forEach(s->System.out.println("\t"+s));
        System.out.println("Mostramos la lista 2 (ordenada descendentemente):");
        lista2.forEach(s->System.out.println("\t"+s));        
        System.out.println("Mostramos la lista 3 (desordenada):");
        lista3.forEach(s->System.out.println("\t"+s));
                               
    }
}
