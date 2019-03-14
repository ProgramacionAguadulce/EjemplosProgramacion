package UT07.EjemplosBasicos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Ejemplo de uso de un RandomAccessFile para escribir 10 bytes, donde cada
 * uno contienen los números del 1 al 10. Ese mismo flujo se utiliza después
 * para volver a leer los 10 bytes y mostrarlos por pantalla.
 * @author Salvador Romero Villegas
 */
public class E06Del1Al10 {
    public static void main(String[] args)
    {
        RandomAccessFile f = null;
        try {
            /* Creamos el acceso Random al archivo (rw creará el archivo si no existe) */
            f = new RandomAccessFile("miarchivo.bin", "rw");

            /* Escribimos 10 bytes, conteniendo los números 1 hasta el 10*/
            for (int i = 1; i <= 10; i++) {
                System.out.printf("Escribiendo %d en la posición %d.\n", i, f.getFilePointer());
                f.write(i);
            }

            f.seek(0); // Volvemos a la posición 0.
            
            System.out.printf("\nTamaño del archivo: %d.\n\n", f.length());

            /* Leemos todos los bytes escritos. f.length() es el tamaño del archivo actual*/
            for (int i = 0; i < f.length(); i++) {
                long posicionActual = f.getFilePointer();
                //Leemos un byte
                byte c = (byte) f.read();
                System.out.printf("Leído el número %d de la posición %d.\n", c, posicionActual);

            }

            System.out.println();
        } catch (FileNotFoundException ex) {
            System.out.println("No se pudo cargar el archivo, ni crearlo.");
        } catch (Exception ioe) {
            System.out.println("Error al leer el archivo.");
        } finally {
            if (f != null) {
                try {
                    /* No lo olvides, hay que cerrarlo igual que los Streams */
                    f.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar el archivo.");
                }
            }
        }
    }
}
