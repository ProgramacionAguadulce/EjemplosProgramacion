package UT08.EjemplosBasicos;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Ejemplo de reemplazo de elementos en lista de objetos inmutables.
 * 
 * @author Salvador Romero Villegas
 */
public class E12ModificacionDeUnaListaDeObjetosInmutables {
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
        System.out.print("Contenido de la lista: ");
        while (i<lista.size())
            System.out.printf("%3d", lista.get(i++));                
        System.out.println();
        
        // Eliminamos los números menores de 5 usando el método remove
        i=0;        
        while (i<lista.size())
        {
            if (lista.get(i)<5) {
                System.out.printf("Se cambia el elemento %d (%d) por -1.\n", i, lista.get(i));
                lista.remove(i); 
                lista.add(i,-1);                                                        
            }
            i++;
        }
       
        // Vemos que números han quedado en la lista
        i=0;
        System.out.print("Contenido de la lista: ");
        while (i<lista.size())
            System.out.printf("%3d", lista.get(i++));                
        System.out.println();
    }
}
