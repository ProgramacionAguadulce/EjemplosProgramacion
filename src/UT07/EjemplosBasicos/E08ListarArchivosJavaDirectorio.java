package UT07.EjemplosBasicos;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * Ejemplo de uso de la clase FilenameFilter donde se muestra como obtener
 * un listado de archivos de un directorio cuya extensión sea ".java".
 * @author Salvador Romero Villegas
 */
public class E08ListarArchivosJavaDirectorio {
    public static void main(String[] args) {
         Scanner sn=new Scanner(System.in);
        System.out.println("Introduzca la ruta al directorio:");
        String filepath=sn.nextLine();
        File f=new File(filepath);
        /* Comprobamos si el archivo existe */
        if (f.exists())
        {
            if (f.isDirectory()) /* Si es un directorio, mostramos su contenido */
            {   
                System.out.printf("\"%s\" contiene los siguientes archivos java: \n",filepath);                
                /* Listamos el contenido del directorio */
                File[] contenido=f.listFiles(new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                       return name.toLowerCase().endsWith("\\.java");
                    }                    
                }); 
                for (int i=0;i<contenido.length;i++)
                {
                    File ar=contenido[i];
                    System.out.printf("\t %s %s\n",ar.getName(),"["+ar.length()+" Bytes]");
                }
            }
            else 
            {
                System.out.printf("%s no es un directorio.\n",filepath);
            }
        }
        else
        {
            System.out.printf("El archivo %s no existe.\n",filepath);
        }
    }
}
