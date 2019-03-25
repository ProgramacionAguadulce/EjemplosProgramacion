package UT08.EjemplosBasicos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejemplo de uso de conjuntos con números aleatorios, donde luego se acceden
 * a los elementos usando un bucle for-each.
 * 
 * @author Salvador Romero Villegas
 */
public class E09OrdenacionInversaTreeSet {
    public static void main(String[] args)
    {
        // Creamos un conjunto (Set)
        Set<Integer> conjuntoDeEnteros=new TreeSet<>(new Comparator<Integer> (){
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2-i1;
            }            
        });
        
        Random randomGenerator=new Random();
        
        // Insertamos en el conjunto un número indeterminado de números      
        for (int i=0;i<10;i++)
        {            
            conjuntoDeEnteros.add(randomGenerator.nextInt(100));             
        }
        
        System.out.println("Números de elementos del conjunto:"+ conjuntoDeEnteros.size());                
             
        for (Integer numero: conjuntoDeEnteros) {
            System.out.println(numero);
        }
    }
}
