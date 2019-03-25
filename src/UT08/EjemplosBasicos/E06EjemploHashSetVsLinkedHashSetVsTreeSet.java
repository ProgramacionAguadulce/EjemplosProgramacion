package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Ejemplo que ilustra las diferencias entre un HashSet y un LinkedHashSet.
 * @author Salvador Romero Villegas
 */
public class E06EjemploHashSetVsLinkedHashSetVsTreeSet {
    public static void main(String[] args)
    {
        // Creamos un conjunto (Set) de cada tipo:
        Set<Integer> m1=new HashSet<>();
        Set<Integer> m2=new LinkedHashSet<>();
        Set<Integer> m3=new TreeSet<>();
        Random n=new Random();
        
        // Insertamos en cada conjunto el mismo elemento 
        System.out.printf("%20s","Números insertados:");
        for (int i=0;i<10;i++)
        {                    
            int elemento=n.nextInt(100);
            System.out.printf("%3d ",elemento);
            m1.add(elemento);             
            m2.add(elemento);     
            m3.add(elemento);
        }
        System.out.println();      
        
        // Veamos ahora como aparecen los elementos de cada conjunto:        
        System.out.printf("%20s","Hash Set:");
        for (int i:m1)
            System.out.printf("%3d ",i);
        System.out.println();
        System.out.printf("%20s","Linked Hash Set:");
        for (int i:m2)
            System.out.printf("%3d ",i);
        System.out.println();
        System.out.printf("%20s","Tree Set:");
        for (int i:m3)
            System.out.printf("%3d ",i);
        System.out.println();
    }
}
