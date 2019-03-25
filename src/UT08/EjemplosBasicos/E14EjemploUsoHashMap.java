package UT08.EjemplosBasicos;

import java.util.HashMap;
import java.util.Map;

/**
 * Ejemplo de uso de HashMaps para almacenar un grupo de personas y poder
 * buscarlas rápidamente por su DNI.
 * @author Salvador Romero Villegas
 */
public class E14EjemploUsoHashMap {
    public static class Persona {
        String dni;
        String nombre;
        String apellidos;
        Persona (String dni, String nombre, String apellidos)
        {
            this.dni=dni;
            this.nombre=nombre;
            this.apellidos=apellidos;
        }
        
        public String getDni()
        {
            return dni;
        }
        
        @Override
        public String toString()
        {
            return String.format("[%s] %s %s",dni,nombre,apellidos);
        }
    }
    public static void main(String[] args)
    {
        // Creamos un mapa que asociaría un DNI (string) a cada persona
        Map<String, Persona> map=new HashMap<>(); 
        
        // Añadimos algunas personas al mapa
        Persona p1=new Persona("123","A","B");
        map.put(p1.getDni(), p1);
        Persona p2=new Persona("456","C","D");
        map.put(p2.getDni(), p2);
        Persona p3=new Persona("789","E","F");
        map.put(p3.getDni(), p3);
              
        // Mostramos una de las personas, pero la buscamos por la clave (DNI)
        System.out.println(map.get("456"));
    }
}
