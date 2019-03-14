package UT07.EjemplosBasicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ejemplo de escribir tres ceros por pantalla usando varias clases envoltorio.
 * @author Salvador Romero Villegas
 */
public class E04EscribirTresCeros {
    public static void main(String[] args) {        
       
        try {
            /* Envolvemos un InputStream (bytes) en un InputStreamReader (char)
            para así poder usar un abanico más grande de métodos para leer. */
            InputStreamReader r=new InputStreamReader(System.in);
            /*
            Envolvemos un InputStreamReader en un BufferedReader que hace
            que la lectura de la información más eficiente:
            */
            BufferedReader br=new BufferedReader(r);
            /*Usamos el BufferedReader y sus funciones */
            System.out.println("Introduce una línea cualquiera:");            
            String lineaLeida;
            if ((lineaLeida=br.readLine())!=null)
                System.out.println("Se acaba de leer la línea:"+lineaLeida);
            System.out.println("Y con esto terminamos.");
            
        } catch (IOException ex) {
            System.out.println("Error en la entrada/salida. ");
        }
        /** Importante: no cerramos el flujo dado que sino se cerraría 
         * System.in y no podríamos usarlo después, hasta una siguiente ejecución*/         
    }
}

