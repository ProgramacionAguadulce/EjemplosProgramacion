package UT08.EjemplosBasicos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/**
 * Ejemplo de unión de dos Set, para crear un único conjunto si elementos
 * repetidos.
 * @author Salvador Romero
 */
public class E07UnionConjuntos {
    public static void main(String[] args)
    {
        // Creamos un conjunto (Set)
        Set<Integer> m1=new HashSet<>();
        Set<Integer> m2=new LinkedHashSet<>();
        Random n=new Random();
        
        // Insertamos en el conjunto m1 números aleatorios
        for (int i=0;i<5;i++)
        {           
            int elemento=n.nextInt(10);
            m1.add(elemento);                                  
        }
        
        // Insertamos en el conjunto m2 números aleatorios
        for (int i=0;i<5;i++)
        {           
            int elemento=n.nextInt(10);
            m2.add(elemento);                                  
        }
              
        // Mostramos los elementos del conjunto m1 usando un iterador        
        System.out.print("Conjunto 1 : ");
        for (int i:m1)
            System.out.printf("%3d ",i);
        System.out.println();
        
        // Mostramos los elementos del conjunto m2 usando un iterador        
        System.out.print("Conjunto 2 : ");
        for (int i:m2)
            System.out.printf("%3d ",i);
        System.out.println();
        
        // Unimos los conjuntos. m1 ahora contendrá la unión de ambos conjuntos.        
        m1.addAll(m2);
        
        // Mostramos los elementos del conjunto m1 usando un iterador        
        System.out.print("Unión 1 y 2: ");
        for (int i:m1)
            System.out.printf("%3d ",i);
        System.out.println();
                                
    }
}
