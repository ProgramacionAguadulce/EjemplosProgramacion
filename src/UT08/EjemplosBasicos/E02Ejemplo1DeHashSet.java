package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Ejemplo de uso de HashSet para insertar un número indeterminado de elementos
 * diferentes.
 * @author Salvador Romero
 */
public class E02Ejemplo1DeHashSet {
     public static void main(String[] args)
    {
        // Creamos un conjunto (Set) de tipo HashSet de elementos <Integer>
        Set<Integer> m=new HashSet<>();
        Random n=new Random();
        
        // Insertamos en el conjunto un número indeterminado de números
        int elementos=20+n.nextInt(81);   
        for (int i=0;i<elementos;i++)
        {            
            m.add(i); 
        }
        
        System.out.println("Números de elementos del conjunto:"+ m.size());                        
    }
}
