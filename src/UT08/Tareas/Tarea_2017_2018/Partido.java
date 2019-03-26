package UT08.Tareas.Tarea_2017_2018;

import java.time.LocalDate;

/**
 * Clase que encapsula los datos de un partido.
 * @author Profesor
 */
public class Partido implements Comparable<Partido> {
    
    private Equipo local;
    private Equipo visitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;        
    
    /**
     * Constructor de la clase partido.
     * @param local Equipo que juega como local.
     * @param visitante Equipo que juega como visitante.
     * @param puntosLocal Puntos del equipo local en el partido.
     * @param puntosVisitante Puntos del equipo visitante en el partido.
     * @param fecha Fecha en la que se disputó el partido.
     * @throws IllegalArgumentException Excepción que se lanza cuando pasa
     * algo de lo siguiente: equipo local o visitante son null, los puntos
     * son negativos (alguno de ellos), la fecha es null o anterior a 1/1/1990.
     */
    public Partido (Equipo local, Equipo visitante, int puntosLocal, int puntosVisitante, LocalDate fecha) throws IllegalArgumentException
    {
        if (local==null || visitante==null || local==visitante ||
            puntosLocal<0 || puntosVisitante<0 ||
            fecha==null || fecha.isBefore(LocalDate.of(1990,1,1)))
        {
            throw new IllegalArgumentException("Los datos de creación del partido son erróneos.");
        }
        this.local=local;
        this.visitante=visitante;
        this.puntosLocal=puntosLocal;
        this.puntosVisitante=puntosVisitante;
        this.fecha=LocalDate.from(fecha);
    }
    
    /**
     * Obtiene el nombre del equipo local.
     * @return nombre del equipo local.
     */
    public String nombreEquipoLocal()
    {
        return local.getNombreEquipo();
    }
    
    /**
     * Obtiene el nombre del equipo visitante.
     * @return nombre del equipo visitante.
     */
    public String nombreEquipoVisitante()
    {
        return visitante.getNombreEquipo();
    }
    
    /**
     * Calcula cual es el equipo ganador.
     * @return El equipo que ha ganado el encuentro o null si el encuentro
     * resultó en empate.
     */
    public Equipo equipoGanador()
    {
        Equipo ganador=null;
        if (puntosLocal<puntosVisitante)
        {
            ganador=visitante;
        } else if (puntosLocal>puntosVisitante)
        {
            ganador=local;
        }
        return ganador;        
    }
    
    /**
     * Método que retorna una versión en cadena del partido, que incluye:
     * - fecha del partido.
     * - nombre del equipo visitante y sus puntos.
     * - nombre del equipo local y sus puntos.
     * @return Cadena con la información del partido.
     */
    @Override
    public String toString()
    {
        StringBuilder sb=new StringBuilder();
        sb.append(fecha.toString()).append (" - ");
        sb.append(local.getNombreEquipo()).append (" ").append(puntosLocal);
        sb.append(" - ");
        sb.append(visitante.getNombreEquipo()).append (" ").append(puntosVisitante);
        return sb.toString();
    }

    /**
     * Método encargado de comparar un partido con otro.
     * @param o Instancia de partido con la que se comparará esta intancia.
     * @return <ul><li>0 si ambas instancias tienen la misma fecha, mismo equipo local y mismo equipo visitante.</li>
     *         <li>1 si esta instancia es anterior a la que se pasa por parámetro.</li>
     *         <li>-1 si esta instancia es posterior a la que se pasa por parámetro.</li>
     *         </ul>
     */
    @Override
    public int compareTo(Partido o) {
        int r=fecha.compareTo(o.fecha);     
        /* Parte opcional */        
        if (r==0)                            
            r=local.getNombreEquipo().compareTo(o.nombreEquipoLocal());                                
        if (r==0)
            r=visitante.getNombreEquipo().compareTo(o.nombreEquipoVisitante());        
        /* Fin parte opcional */
        return r;
    }
}
