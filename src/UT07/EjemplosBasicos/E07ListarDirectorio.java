package UT07.EjemplosBasicos;

import java.io.File;
import java.util.Scanner;

/**
 * Ejemplo de uso de la clae File para mostrar la información de un archivo
 * o listar el contenido de un directorio. 
 * Este ejemplo pide la ruta a un archivo por teclado, si el archivo existe
 * se mostrará por pantalla su información, y si es un directorio, se 
 * mostrará su contenido.
 * @author Salvador Romero Villegas
 */
public class E07ListarDirectorio {
    public static void main(String[] args) {
         Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca la ruta al archivo o directorio:");
        String filepath=sn.nextLine();
        File f=new File(filepath);
        /* Comprobamos si el archivo existe */
        if (f.exists())
        {
            System.out.printf("El archivo o directorio %s existe.\n",filepath);
            /* Si es un archivo, simplemente mostramos su tamaño */
            if (f.isFile())
            {
                System.out.printf("%s es una archivo de tamaño %d Bytes\n",filepath,f.length());                
            }
            else if (f.isDirectory()) /* Si es un directorio, mostramos su contenido */
            {   
                System.out.printf("\"%s\" es un directorio que contiene: \n",filepath);                
                /* Listamos el contenido del directorio */
                File[] contenido=f.listFiles(); 
                for (int i=0;i<contenido.length;i++)
                {
                    File ar=contenido[i];
                    System.out.printf("\t %s %s\n",ar.getName(),
                            ar.isDirectory()?"<dir>":("["+ar.length()+" Bytes]"));
                }
            }
            
        }
        else
        {
            System.out.printf("El archivo %s no existe.\n",filepath);
        }
    }
}
