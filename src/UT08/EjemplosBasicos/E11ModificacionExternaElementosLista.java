package UT08.EjemplosBasicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Ejemplo de como se modifican los elementos de una lista cuando
 * estos son mutables.
 * 
 * @author Salvador Romero Villegas
 */
public class E11ModificacionExternaElementosLista {

    /**
     * Clase MiInteger. Clase que envuelve un entero mutable.
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
        List<MiInteger> lista=new LinkedList<>(); 
        Random n=new Random();
        
        // Insertamos en la lista 10 objetos MiInteger (objeto mutable)
        for (int i=0;i<10;i++)
        {           
            int elemento=n.nextInt(10);
            lista.add(new MiInteger(elemento));                                  
        }      
              
        // Vemos que números han sido introducidos
        int i=0;
        while (i<lista.size())
            System.out.printf("Elemento en la posición %d: %s\n", i, lista.get(i++));                
        
        // Modificamos las instancias de la lista, sin añadir nuevas instancias.
        for (i=0;i<10;i++)
        {                       
            lista.get(i).i=-1;
        }            
       
        // Vemos como los elementos han sido modificados
        i=0;
        while (i<lista.size())
            System.out.printf("Nueva lista %d: %s\n", i, lista.get(i++));                
        
    }

}
