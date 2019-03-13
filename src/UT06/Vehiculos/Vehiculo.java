/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT06.Vehiculos;

/**
 * Clase abstracta vehiculo.
 * @author Salvador Romero Villegas
 */
public abstract class Vehiculo {
    
    protected double distanciaRecorrida;
    private int id=0;

    /**
     * Constructor de la clase Vehiculo.
     * @param id Id del vehilculo.
     */
    public Vehiculo (int id)
    {
        this.id=id;
        distanciaRecorrida=0;
    }
    
    /**
     * Recorrer distancia.
     * @param kilometros kilometros a recorrer.
     * @return true si se pudo recorrer y false en caso contrario. 
     * Si los kilometros son menores de 0, siempre retornará false.
     * 
     */
    public boolean recorrer (double kilometros)
    {
        boolean recorridoEfectuado=false;
        if (kilometros>0)
        {
            distanciaRecorrida+=kilometros;
            recorridoEfectuado=true;
        }
        return recorridoEfectuado;
    }
    
    /**
     * Método que permite obtener el estado en forma de cadena de un vehiculo.
     * @return Estado.
     */
    public abstract String obtenerEstado(); 
    
    /**
     * Obtener el identificador de vehiculo. 
     * No sobrescribile.
     * @return Id del vehiculo.
     */
    public final int getId()
    {
        return id;
    }
}
