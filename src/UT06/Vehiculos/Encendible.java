/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT06.Vehiculos;

/**
 * Interfaz encendible. Aquellos objetos o vehiculos encendibles deben
 * implementar esta interfaz.
 * 
 * @author Salvador Romero
 */
public interface Encendible {
    /**
     * Encender.
     */
    public void encender();
    /**
     * Apagar.
     */
    public abstract void apagar();
}
