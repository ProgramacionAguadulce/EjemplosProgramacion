package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Ejemplo de uso de conjuntos con números aleatorios, donde luego se acceden
 * a los elementos usando un bucle for-each.
 * 
 * @author Salvador Romero Villegas
 */
public class E05Ejemplo4DeHashSet {
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
        
        /* El siguiente código entero se podría reemplazar por... */
        //Iterator<Integer> iterator=conjuntoDeEnteros.iterator();
        //while (iterator.hasNext()) 
        //    System.out.println(iterator.next());
                
        for (Integer numero: conjuntoDeEnteros) {
            System.out.println(numero);
        }
    }
}
