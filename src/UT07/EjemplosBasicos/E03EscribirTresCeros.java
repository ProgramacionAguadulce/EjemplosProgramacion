package UT07.EjemplosBasicos;

/**
 * Ejemplo de uso del método write de la clase System.out.
 * Escribe tres 0 por pantalla aunque el dato pasado por argumento al método
 * write es diferente.
 * @author Salvador Romero Villegas.
 */
public class E03EscribirTresCeros {
    public static void main(String[] args) {        
        
        System.out.write('0');
        System.out.write(48); 
        System.out.write(4400);
        System.out.write('\n');
        System.out.flush();
    }
}

