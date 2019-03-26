package UT08.Tareas.Tarea_2017_2018;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/**
 * Clase destinada a contener la información y métodos asociados a una temporada.
 * @author profesor
 */
public class Temporada {  
    
    private String nombreTemporada;
    private Map<String,Equipo> equipos;
    private Set<Partido> partidos;
    
    /**
     * Constructor de Temporada.
     * @param nombre Nombre dado a la temporada.
     */
    public Temporada (String nombre)
    {
        this.nombreTemporada=nombre;
        equipos=new HashMap<>();
        partidos=new TreeSet<>();
    }

    /**
     * Obtiene el nombre de la temporada.
     * @return Nombre de la temporada.
     */
    public String getNombreTemporada() {
        return nombreTemporada;
    }        
    
    /** 
     * Añadir un equipo a la temporada.
     * @param equipo Equipo a añadir a la temporada.
     * @return Retornará true si el equipo se pudo añadir correctamente,
     * false en caso contrario. No se podrá añadir si el equipo ya esta insertado
     * o si equipo es null.
     */
    public boolean añadirEquipo (Equipo equipo)
    {
        boolean ret=false;
        if (equipo !=null && !equipos.containsKey(equipo.getNombreEquipo()))
        {
            equipos.put(equipo.getNombreEquipo(), equipo);
            ret=true;
        }
        return ret;
    }
    
    /**
     * Obtiene una lista de equipos con todos los equipos participantes
     * en la temporda.
     * @return Lista de equipos (List<Equipo>)
     */
    public List<Equipo> listaDeEquipos()
    {
        List<Equipo> ret=new ArrayList<>(equipos.values());                                        
        return ret;
    }
    
    /**
     * Inserta un partido en la temporada.
     * @param m Partido a insertar.
     * @throws IllegalArgumentException Lanzará esta excepción si el partido 
     * es null o si alguno de los equipos no juega en esta temporada.
     */
    public void insertarPartido (Partido m) throws IllegalArgumentException
    {
        if (m!=null && equipos.containsKey(m.nombreEquipoLocal()) && 
                equipos.containsKey(m.nombreEquipoVisitante()))
                {
                    partidos.add(m);
                }
        else
            throw new IllegalArgumentException("Alguno de los dos equipos no está en esta temporada.");
    }
    
    /**
     * Calcula los puntos obtenidos por un equipo en base a los partidos jugados.
     * @param e Equipo del que se quieren calcular los puntos.
     * @return Puntos del equipo.
     */
    public int calcularPuntosEquipo(Equipo e)
    {
        return calcularPuntosEquipo(e.getNombreEquipo());
    }

    /**
     * Calcula los puntos obtenidos por un equipo en base a los partidos jugados.
     * @param nombreEquipo nombre del equipo del que se quieren calcular los puntos.
     * @return Puntos del equipo.
     */    
    public int calcularPuntosEquipo(String nombreEquipo) {
        int recuento = 0;
        for (Partido p : partidos) {
            if (p.nombreEquipoLocal().equals(nombreEquipo)
                    || p.nombreEquipoVisitante().equals(nombreEquipo)) {
                Equipo ganador = p.equipoGanador();
                if (ganador == null) {
                    recuento++;
                } else if (ganador.getNombreEquipo().equals(nombreEquipo)) {
                    recuento += 3;
                }
            }
        }
        return recuento;
    }
    
    /**
     * Obtiene un litado en forma de texto con todos los partidos jugados.
     * @return Cadena que contiene información con todos los partidos jugados.
     */
    public String partidosToString ()
    {
        return partidosToString(null);
    }
    
    /**
     * Obtiene un listado en forma de texto con todos los partidos jugados por
     * un equipo concreto pasado por parámetro. Si el equipo pasado por parámetro
     * es null, la lista contendrá todos los partidos.
     * @param e Equipo del que se mostrarán los partidos, o null.
     * @return Lista de partidos en formato texto.
     */
    public String partidosToString (Equipo e)
    {
        StringBuilder cad=new StringBuilder();
        for (Partido p:partidos)
        {
            if (e==null || p.nombreEquipoLocal().equals(e.getNombreEquipo())
                    || p.nombreEquipoVisitante().equals(e.getNombreEquipo()))
            {                
                cad.append(p.toString());
                cad.append("\n");
            }
        }
        return cad.toString();
    }
    
    
    /**
     * Método que retorna información sobre la temporada que incluirá la lista
     * de equipos participantes en la temporada y su puntuación.
     * @return Cadena con los equipos participantes en la temporada y su puntuación.
     */
    @Override
    public String toString ()
    {
        StringBuilder cad=new StringBuilder();
        cad.append("Temporada: ").append(nombreTemporada).append("\n");
        
        List<Equipo> listaDeEquipos=listaDeEquipos();
        Collections.sort(listaDeEquipos, new Comparator<Equipo>(){
            @Override
            public int compare(Equipo o1, Equipo o2) {
                return calcularPuntosEquipo(o2)-calcularPuntosEquipo(o1);
            }            
        });
        
        cad.append("----------------------\n");
        cad.append("Equipos participantes:\n");
        cad.append("----------------------\n");
        
        for (Equipo e:listaDeEquipos)
        {            
            cad.append(e);
            cad.append(" : ");
            cad.append(calcularPuntosEquipo(e.getNombreEquipo()));
            cad.append("\n");
        }
        
        return cad.toString();
    }
}
