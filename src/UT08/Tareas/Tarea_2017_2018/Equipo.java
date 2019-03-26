package UT08.Tareas.Tarea_2017_2018;

/**
 * Clase que encapsula la información de un equipo.
 * @author profesor
 */
public class Equipo {    
    private String nombreEquipo;
    private String ciudad;
    
    /**
    * Constructor de equipo.
    * @param nombreEquipo Nombre del equipo.
    * @param ciudad Ciudad del equipo.
    */
    public Equipo (String nombreEquipo, String ciudad)
    {
        this.nombreEquipo=nombreEquipo;
        this.ciudad=ciudad;
    }
   
    /**
     * Obtiene el nombre del equipo.
     * @return Nombre del equipo.
     */
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    /**
     * Representación del equipo en formato texto.
     * @return Nombre del equipo y ciudad del equipo en formato texto.
     */
    @Override
    public String toString()
    {
        StringBuilder cad=new StringBuilder();
        cad.append(nombreEquipo);
        cad.append(" (").append(ciudad).append(")");
        return cad.toString();
    }
}
