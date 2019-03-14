package UT07.EjemplosBasicos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Contar vocales de un archivo de texto. 
 * Ejemplo de como usar un flujo de datos para leer un archivo y contar
 * todas sus vocales.
 * @author Salvador Romero Villegas
 */
public class E05ContarVocalesV3 {
    public static void main(String[] args) 
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Introduzca el archivo a contar bytes: ");
        String filepath=sn.nextLine();
        
        File f=new File(filepath); 
        FileReader fr=null;
        try { 
            fr=new FileReader(f);
            // Uso de la clase BufferedReader como "envoltorio" de un FileReader
            BufferedReader br=new BufferedReader(fr); 
            int vocales=0;
            for (int c=br.read();c!=-1;c=br.read())
            {
                if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                    c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                    vocales++;                    
            }
            System.out.printf("El número de vocales son: %d\n",vocales);
        } catch (FileNotFoundException ex) {
            System.out.printf("No he encontrado el archivo %s.\n",filepath);
        } catch (IOException ex) {
            System.out.printf("Error al leer el archivo %s.\n",filepath);
        } finally {
            if (fr!=null)
            {
                try {
                    fr.close();
                } catch (IOException ex) {
                    System.out.printf("Error cerrando el archivo %s.\n",filepath);
                }
            }
        }        
    }
}
