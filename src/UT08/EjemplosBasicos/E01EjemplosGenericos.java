package UT08.EjemplosBasicos;

import java.util.List;

/**
 * Ejemplos de métodos genéricos comparados con versions no genéricas.
 * @author Salvador Romero Villegas
 */
public class E01EjemplosGenericos {
          
    /**
     * Método que intercambia dos posiciones dadas de un array de cualquier tipo genérico.
     * @param <T> Tipo genérico (cualquier tipo de objeto)
     * @param array Array de tipo T.
     * @param posicion1 Posición 1.
     * @param posicion2 Posicion 2.
     * @return true si se pudo hacer el intercambio, o false en caso contrario.
     */
    public static <T> boolean swap(T[] array, int posicion1, int posicion2)
    {
        boolean done=false;
        if (posicion1<array.length && posicion2<array.length 
                && posicion1>0 && posicion2>0 && posicion1!=posicion2)
        {
            T tmp=array[posicion1];            
            array[posicion1]=array[posicion2];
            array[posicion2]=tmp;
            done=true;
        }
        return done;
    }
    
    /**
     * Obtiene el elemento central de la lista de String.
     * @param <T> Tipo de elemento contenido en la lista.
     * @param e Lista de elementos tipo String (da igual la implementación).
     * @return Elemento central (si lo hay) o null si no lo hay.
     */
    public static <T> T elementoCentral (List<T> e)
    {
        T ret=null;
        if (e!=null && !e.isEmpty())
        {
            ret=e.get(e.size()/2); //
        }
        return ret;
    }
    
    /**
     * Version genérica del método invertir (T) es cualquier tipo de clase.
     * @param <T> Cualquier tipo de clase.
     * @param arrayAInvertir Array a invertir.
     */
    public static <T> void invertir(T[] arrayAInvertir)
    {
        for (int i=0;i<arrayAInvertir.length/2;i++)
        {
            T aux=arrayAInvertir[i];
            arrayAInvertir[i]=arrayAInvertir[arrayAInvertir.length-i-1];
            arrayAInvertir[arrayAInvertir.length-i-1]=aux;
        }        
    }
    
     /**
     * Version genérica del método invertir (T) es cualquier tipo de clase.
     * @param arrayAInvertir Array a invertir.
     */
    public static void invertirArrayEnteros(int[] arrayAInvertir)
    {
        for (int i=0;i<arrayAInvertir.length/2;i++)
        {
            int aux=arrayAInvertir[i];
            arrayAInvertir[i]=arrayAInvertir[arrayAInvertir.length-i-1];
            arrayAInvertir[arrayAInvertir.length-i-1]=aux;
        }        
    }
    
    public static void main (String[] args)
    {
        /* Ejemplo de uso del método invertir no genérico */
        Integer[] m1={0,1,2,3,4};                
        E01EjemplosGenericos.invertir(m1);        
        for(int n:m1) 
            System.out.println(n);  
        
        /* Ejemplo de uso del método invertir genérico con enteros*/
        Integer[] m2={0,1,2,3,4};                
        E01EjemplosGenericos.<Integer>invertir(m2);                
        for(int n:m2) 
            System.out.println(n); 
        
        /* Ejemplo de uso del método invertir genérico con cadenas*/
        String[] m3={"a","b","c","d","e"};                
        E01EjemplosGenericos.<String>invertir(m3);                
        for(String cad:m3) 
            System.out.println(cad); 
        
    }
}
