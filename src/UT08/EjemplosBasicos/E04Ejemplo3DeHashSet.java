package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Ejemplo de uso de conjuntos con números aleatorios, donde luego se acceden
 * a los elementos usando un iterador.
 * 
 * @author Salvador Romero Villegas
 */
public class E04Ejemplo3DeHashSet {
    public static void main(String[] args)
    {
        // Creamos un conjunto (Set)
        Set<Integer> conjuntoDeEnteros=new HashSet<>();
        Random randomGenerator=new Random();
        
        // Insertamos en el conjunto un número indeterminado de números      
        for (int i=0;i<10;i++)
        {            
            conjuntoDeEnteros.add(randomGenerator.nextInt(100));             
        }
        
        System.out.println("Números de elementos del conjunto:"+ conjuntoDeEnteros.size());                
        
        // Obtenemos el iterador del conjunto de enteros
        Iterator<Integer> iterator=conjuntoDeEnteros.iterator();
        // Mientras el iterador tenga elementos (hasNext), obtenemos el siguiente elemento (next)
        while (iterator.hasNext()) 
            System.out.println(iterator.next());
                
    }
}
