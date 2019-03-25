package UT08.EjemplosBasicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Ejemplo de uso del método remove eliminando aquellos elementos
 * de una lista que son menores de 5.
 * 
 * @author Salvador Romero Villegas
 */
public class E10EliminacionElementosLista {
    public static void main(String[] args)
    {
        // Creamos una lista ordenada según orden de inserción
        List<Integer> lista=new LinkedList<>(); 
        Random n=new Random();
        
        // Insertamos en la lista 10 números       
        for (int i=0;i<10;i++)
        {           
            int elemento=n.nextInt(10);
            lista.add(elemento);                                  
        }      
              
        // Vemos que números han sido introducidos
        int i=0;
        while (i<lista.size())
            System.out.printf("Elemento en la posición %d: %d\n", i, lista.get(i++));                
        
        // Eliminamos los números menores de 5 usando el método remove
        i=0;        
        while (i<lista.size())
        {
            if (lista.get(i)<5) {
                System.out.printf("Se elimina el elemento %d: %d\n", i, lista.get(i));
                lista.remove(i); 
                
                // Lo siguiente no es necesario, pero me sirve para el ejemplo.
                if (i<lista.size())
                    System.out.printf("\tEl nuevo elemento en la posición %d es : %d\n", i, lista.get(i));
                else
                    System.out.printf("\tNo hay un nuevo elemento en la posición %d.\n",i);
                
            }
            else i++;
        }
       
        // Vemos que números han quedado en la lista
        i=0;
        while (i<lista.size())
            System.out.printf("Ahora el elemento %d de la lista es %d\n", i, lista.get(i++));                
        
    }
}
