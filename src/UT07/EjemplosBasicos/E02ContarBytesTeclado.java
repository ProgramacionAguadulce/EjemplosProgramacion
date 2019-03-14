package UT07.EjemplosBasicos;

import java.io.IOException;

/**
 * Ejemplo de uso de System.in.
 * En este ejemplo simplemente se cuentan los bytes leidos por teclado.
 * Se leerán bytes hasta que se introduzca el carácter '0'.
 * 
 * @author Salvador Romero Villegas.
 */
public class E02ContarBytesTeclado {
    public static void main(String[] args) {        
        try {
            int recuento=0;
            int dato;        
            System.out.println("Se leerán datos hasta que se introduzca un 0:");
            do {                
                dato = System.in.read();
                if (dato!=48)
                    recuento++;
            } while (dato != 48);
            System.out.printf("Se han leído %d bytes hasta el 0.", recuento);
        } catch (IOException e) {
            System.out.println("Error al leer datos.");
        }
        /* Atención: No debes invocar System.in.close(), dado que si cierras
        ese flujo de entrada, no podrás volver a leer datos del teclado hasta
        la próxima ejecución. */
    }
}

