
package UT06.Vehiculos;

/**
 * Clase Moto. Vehiculo con matrícula y un faro. Sin cuentakilometros por
 * trayecto.
 * @author Salvador Romero Villegas
 */
public class Moto extends Vehiculo implements Encendible {

    private Faro faro1 = new Faro();
    private String matricula;
    private boolean encendido=false;
    
    /**
     * Constructor clase Moto. 
     * @param id id del vehiculo (moto en este caso)
     * @param matricula Matrícula de la moto.
     */
    public Moto(int id, String matricula) {
        super(id);
        this.matricula = matricula;
        this.encendido=false;
    }
    
    /**
     * Enciende los faros de la moto, si la moto está encendida.
     */
    public void encenderFaros() {
        if (encendido) {
            faro1.encender();
        }
    }

    /**
     * Apaga los faros de la moto.
     */
    public void apagarFaros() {
        if (encendido) {
            faro1.apagar();
        }        
    }
    
    /**
     * Retorna el estado de la moto.
     * @return "Encendido" si está arrancada y "Apagado" en caso contrario.
     */
    @Override
    public String obtenerEstado() {
        return encendido?"Encendido":"Apagado";
    }

    @Override
    public void encender() {
        this.encendido=true;
    }

    @Override
    public void apagar() {
        this.apagarFaros();
        this.encendido=false;
    }
    
    @Override
    public String toString() {
        
        return "Moto "+getId()+" {" + faro1.toString() + " " + matricula + "} " + " -->  Kilometros totales: "+this.distanciaRecorrida;
    }  
}
