package UT06.Vehiculos;

/**
 * Persona propietaria de una lista de vehiculos.
 * @author Salvador Romero
 */
public class PersonaPropietaria {
    
    private String nombre;
    private String apellidos;
    
    public final int MAX_VEHICULOS=10;
    private Vehiculo[] vehiculos=new Vehiculo[MAX_VEHICULOS];
    
    /**
     * Constructor básico.
     * @param nombre Nombre del/la propietario/a.
     * @param apellidos Apellidos.
     */
    public PersonaPropietaria(String nombre, String apellidos)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    
    /**
     * Obtener Nombre.
     * @return El nombre.
     */
    public String getNombre() 
    {
        return this.nombre;
    }

    /**
     * Obtener Apellidos.
     * @return Los apellidos.
     */
    public String getApellidos() 
    {
        return this.apellidos;
    }

    /**
     * Añadir un nuevo vehiculo a la flota de vehiculos de la persona.
     * @param v Vehiculo a añadir.
     * @return true si se puedo añadir el vehiculo (hay menos de 10) y 
     * v es distinto de null. false en cualquier otro caso.
     */
    public boolean añadirVehiculo (Vehiculo v)
    {
        boolean añadido=false;
        if (v!=null) {
            for (int i=0; i<vehiculos.length && !añadido; i++)
            {
                añadido=vehiculos[i]==null;
                if (añadido) { vehiculos[i] = v; }
            }
        }
        return añadido;
    }

    /**
     * Elimina un vehiculo de la flota dado un id determinado.
     * @param id Id del vehiculo.
     * @return true si se pudo eliminar el vehiculo, y false si el vehiculo
     * no estaba en la lista.
     */
    public boolean eliminarVehiculo (int id)
    {
        boolean eliminado=false;
        for (int i=0; i<vehiculos.length && !eliminado; i++)
        {
            eliminado=vehiculos[i]!=null && vehiculos[i].getId()==id;
            if (eliminado) { vehiculos[i] = null; }
        }
        return eliminado;
    }
    
    /**
     * Retorna una instancia de vehiculo dado un id.
     * @param id Id del vehiculo.
     * @return Instancia de vehiculo (si hay un vehiculo con dicho id en la
     * lista) o null en caso contrario.
     */
    public Vehiculo getVehiculo (int id) {
        Vehiculo v=null;
        for (int i=0; i<vehiculos.length && v==null; i++)
        {            
            if (vehiculos[i]!=null && vehiculos[i].getId()==id) 
                { v=vehiculos[i]; }
        }
        return v;
    }
    
    /**
     * Obtener primer vehiculo de la lista.
     * @return null si no hay ningún vehiculo en la lista o la instancia
     * de vehiculo si hay un vehiculo.
     */
    public Vehiculo getPrimerVehiculo ()
    {
        Vehiculo v=null;
        for (int i=0; i<vehiculos.length && v==null; i++)
            v=vehiculos[i];
        return v;
    }

    /**
     * Hace un recuento del total de vehiculos.
     * @return Cuenta el total de vehiculos asociados.
     */
    public int getTotalVehiculos()
    {
        int total=0;        
        for (Vehiculo vehiculo : vehiculos) {
            total += vehiculo != null ? 1 : 0;
        }        
        return total;
    }
    
    /**
     * Genera un array de cadenas con la información de cada vehiculo
     * del array. 
     * @return Array de cadenas con la información de cada vehiculo. 
     * El tamaño del array retornado irá en función del número de vehiculos
     * añadidos. Si no hay vehiculos, retornará un array de tamaño 0.
     */
    public String[] getInfoVehiculos () 
    {
        String[] info=new String[getTotalVehiculos()];
        int totalCoches=0;
        int totalMotos=0;
        int totalOtroTipoDeVehiculos=0;
        for(int i=0, j=0;i<vehiculos.length && j<info.length;i++)
        {
            if (vehiculos[i]!=null)
            {
                info[j]=vehiculos[i].toString();
                j++;
            }            
        }
        return info;
    }
    
    /**
     * Enciende todos los vehiculos encendibles.
     */
    public void encenderTodo()
    {
        for(int i=0, j=0;i<vehiculos.length;i++)
        {
            if (vehiculos[i] instanceof Encendible)
            {
                Encendible e=(Encendible)vehiculos[i];
                e.encender();
            }            
        }
    }
    
    /**
     * Apaga todos los vehiculos encendibles.
     */
    public void apagarTodo(){
        for(int i=0, j=0;i<vehiculos.length;i++)
        {
            if (vehiculos[i] instanceof Encendible)
            {
                Encendible e=(Encendible)vehiculos[i];
                e.apagar();
            }            
        }
    }    
    
    /**
     * Versión en String de la PersonaPropietaria que incluye la lista de 
     * vehiculos.
     * @return Cadena con la información.
     */
    @Override
    public String toString()
    {
      
        StringBuilder sb=new StringBuilder();
        for (String a:getInfoVehiculos())
        {
            sb.append("\t");
            sb.append(a);
            sb.append("\n");
        }        
        return String.format("Nombre: %s | Apellidos: %s \n - %s",nombre,apellidos,sb.toString());
    }
}
