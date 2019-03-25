package UT08.EjemplosBasicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Este ejemplo ilustra el uso de LinkedList para reflejar como este tipo
 * de colecciones SI pueden almacenar elementos repetidos.
 * @author Salvador Romero Villegas
 */
public class E08EjemploUsoLinkedList {
    public static void main(String[] args)
    {
        // Creamos una lista ordenada según orden de inserción (LinkedList)
        List<Integer> lista1=new LinkedList<>(); 
        Random n=new Random();
        
        // Rellenamos la lista con 10 números aleatorios entre 0 y 8
        for (int i=0;i<10;i++)
        {           
            int elemento=n.nextInt(8);
            lista1.add(elemento);                                  
        }      
                      
        // Mostramos el contenido de la lista lista1 usando un for-each
        System.out.print("Lista 1 : ");
        for (int i:lista1)
            System.out.printf("%3d ",i);
       
        /* Algo que no se podía hacer en los conjuntos y que si se puede
        hacer en las listas: obtener un elemento concreto. */        
        System.out.printf("\nElemento en la posición 5: %d\n", lista1.get(4));
        
    }
}
