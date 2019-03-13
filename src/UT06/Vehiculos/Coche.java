
package UT06.Vehiculos;

/**
 * Coche. Clase que implementa un simulador de un coche que extiende
 * la clase Vehiculo y que implementa la interfaz Encendible.
 * 
 * @author Salvador Romero Villegas
 */
public final class Coche extends Vehiculo implements Encendible {    

    private Faro faro1 = new Faro();
    private Faro faro2 = new Faro();
    private double kilometrosTrayecto; 
    private String matricula;
    private boolean encendido;

    /**
     * Constructor que recibe un identificador numérico del vehiculo y 
     * su matrícula. 
     * @param id Identificador numérico del vehiculo.
     * @param matricula Matrícula del vehículo.
     */
    public Coche(int id, String matricula) {    
        super(id);
        this.matricula = matricula;
        this.kilometrosTrayecto=0; 
        this.encendido=false;
    }    
    
    /**
     * Encender los faros del coche.
     * Este método encendería los faros del vehículo.
     */
    public void encenderFaros() {
        if (encendido) {
            faro1.encender();
            faro2.encender();
        }
    }

    /** 
     * Apagar los faros del coche.
     * Este método apagaría los faros del vehículo.
     */
    public void apagarFaros() {
        if (encendido) {
            faro1.apagar();
            faro2.apagar();
        }        
    }
    
    /**
     * Método destinado a resetear el trayecto parcial.
     */
    public void resetTrayecto () { 
        kilometrosTrayecto=0;
    }
    
    /**
     * Implementación del método recorrer una distancia, que tiene en cuenta
     * un trayecto parcial.
     * 
     * @param distancia Distancia a recorrer.
     * @return true si se pudo recorrer la distancia y false en caso contrario.
     */
    @Override
    public boolean recorrer (double distancia)
    {   
     
        boolean ok=false;
        if (encendido) {
            ok=super.recorrer(distancia); /* Invocamos el método superior */
            if (ok)
            { 
                /* Si los kilometros se pudieron recorrer, aumentamos la distancia recorrida en este trayecto */
                kilometrosTrayecto+=distancia;
            }
        }
        return ok;
    }   

    /**
     * Versión en String de la información de esta instancia.
     * @return Información de la instancia.
     */
    @Override
    public String toString() {
        
        return "Coche "+getId()+" [ " + faro1.toString() + " " + matricula + " " + faro2.toString() + "] " + " -->  Kilometros totales: "+ this.distanciaRecorrida + "/ Trayecto:" + kilometrosTrayecto;
    }    
    
    /**
     * Estado del coche.
     * @return "Encendido" si esta encendido o "Apagado" en caso contrario.
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
      
}
