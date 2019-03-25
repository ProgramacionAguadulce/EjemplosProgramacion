package UT08.EjemplosBasicos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Ejemplo que muestra como la modificación de los elementos mutables
 * almacenados en dos listas, se modifican en ambas listas, dado que
 * las listas contienen realmente una referencia al objeto, y no una copia
 * del mismo.
 * @author Salvador Romero Villegas
 */
public class E13ModificacionExternaElementosLista2 {
    
    /**
     * Clase anidada MiInteger.
     * Encapsula un entero de forma mutable.
     */
    public static class MiInteger {
        int i=0;
        MiInteger (int i)
        {
            this.i=i;
        }
        @Override
        public String toString()
        {
            return Integer.toString(i);
        }
    }
    public static void main(String[] args)
    {
        // Creamos una lista ordenada según orden de inserción
        List<MiInteger> listaLinked=new LinkedList<>(); 
        List<MiInteger> listaArray=new ArrayList<>(); 
        Random n=new Random();
        
        // Insertamos en la lista 10 objetos MiInteger
        for (int i=0;i<10;i++)
        {           
            int elemento=n.nextInt(10);
            listaLinked.add(new MiInteger(elemento));                                  
        }      
              
        // Copiamos el LinkedList en el ArrayList        
        listaArray.addAll(listaLinked);
                
        // Vemos que números han sido introducidos en el ArrayList
        int i=0;
        while (i<listaArray.size())
            System.out.printf("Elemento en la posición %d: %s\n", i, listaArray.get(i++));                
        
        // Modificamos los elementos del LinkedList (en teoría, el ArrayList no se toca)
        for (i=0;i<10;i++)
        {                       
            listaLinked.get(i).i=-1;
        }            
       
        // Vemos como quedan los elementos del ArrayList (verás que también aparecen modificados)
        i=0;
        while (i<listaArray.size())
            System.out.printf("Nueva lista %d: %s\n", i, listaArray.get(i++));                
        
    }
}
