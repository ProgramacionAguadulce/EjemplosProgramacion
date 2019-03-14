package UT07.EjemplosBasicos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Contar los bytes contenidos en un archivo. 
 * Para leer los bytes de un archivo, usamos un flujo de bytes (acabado en "Stream").
 * @author Salvador Romero Villegas
 */
public class E01ContarBytes {
    public static void main (String [] argsv)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca el archivo a contar bytes:");
        String filepath=sn.nextLine();
        FileInputStream input=null;
        try {
            input=new FileInputStream(filepath);            
            long byteCount=0;
            while (input.read()!=-1)
            {
                byteCount++;
            }
            System.out.printf("El archivo tiene %d bytes.\n", byteCount);
        }
        catch (FileNotFoundException e)
        {
            System.out.printf("El archivo %s no existe.\n",filepath);
        }
        catch (IOException e)
        {
            System.out.printf("Error de E/S al leer el archivo %s.\n", filepath);
        }
        finally {
            if (input!=null)
            {
                try {
                    input.close();
                } 
                catch (Exception e) {
                    System.out.println("Error cerrando el archivo.");
                }
            }
        }
    }
}
