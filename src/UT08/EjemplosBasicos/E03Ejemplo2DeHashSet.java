package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Ejemplo de HashSet donde se insertan un número indeterminado de números
 * donde hay repetidos. El resultado es que los números repetidos no se insertan.
 * @author Salvador Romero Villegas
 */
public class E03Ejemplo2DeHashSet {
    public static void main(String[] args)
    {
        // Creamos un conjunto (Set)
        Set<Integer> m=new HashSet<>();
        Random n=new Random();
        
        // Insertamos en el conjunto un número indeterminado de números
        int elementos=20+n.nextInt(81);   
        for (int i=0;i<elementos;i++)
        {            
            m.add(i%10);             
        }
        
        System.out.println("Números de elementos del conjunto:"+ m.size());                
        
    }
}
