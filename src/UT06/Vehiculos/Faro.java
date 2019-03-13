
package UT06.Vehiculos;

/**
 * Clase Faro. Simula un faro.
 * @author Salvador Romero Villegas
 */
public class Faro implements Encendible {
        
        private boolean encendido = false;

        @Override
        public void encender() {
            encendido = true;
        }

        @Override
        public void apagar() {
            encendido = false;
        }

        @Override
        public String toString() {
            return encendido ? "*" : "o";
        }
 }
