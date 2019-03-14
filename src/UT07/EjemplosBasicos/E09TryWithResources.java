/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT07.EjemplosBasicos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejemplo de uso de try-with-resources.
 * Las grandes ventajas de un try-with-resources es que no hay que acorcarse
 * de cerrar el archivo.
 * @author Salvador Romero Villegas.
 */
public class E09TryWithResources {
    public static void main(String[] args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca el archivo a contar bytes:");
        String filepath=sn.nextLine();
        try (FileInputStream input=new FileInputStream(filepath)){            
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
        
    }
}
