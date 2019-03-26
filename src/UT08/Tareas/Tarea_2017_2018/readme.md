# Tarea Unidad 8 - 2017-2018

En este proyecto vamos a trabajar intensamente con colecciones: conjuntos, listas y mapas. **No se pueden utilizar arrays**. Vamos a desarrollar un pequeño proyecto que seguro que te resultará interesante.

En este proyecto vamos a generar la clasificación de los equipos en una temporada de Balonmano (aunque bien podría ser de otro deporte). Puede parecer algo complicado, pero verás que enfocándolo paso a paso resulta más sencillo.

**Importante:** échale un vistazo al apartado: **Información de interés**; en él hay una clase Java llamada `Principal`, que contiene código para probar tu tarea.

En nuestro ejercicio tendremos lo siguiente:

*   Una clase `Equipo` que almacenará la información de cada equipo.
*   Una clase `Partido` que almacenará la información de cada partido (resultado, equipos que participan y fecha del encuentro).
*   Una clase `Temporada` que almacenará un mapa con los equipos que participan en la temporada y la lista de partidos de la temporada. Se utilizará un mapa para encontrar más rápidamente el equipo por nombre.

Empieza creando un proyecto NetBeans vacío y adelante:

## Paso 1\. Crear la clase `Equipo`.

Se creará una clase llamada `Equipo`, destinada a almacenar la información de cada equipo. Esta clase contendrá lo siguiente:

1.  Un atributo **privado** llamado `nombreEquipo` que corresponderá al nombre del equipo.
2.  Un atributo **privado** llamado `ciudad` que corresponderá con la ciudad a la que pertenece el equipo.
3.  Crearemos un único **constructor** que admita como parámetro el nombre del equipo y la ciudad, destinado a inicializar los atributos de la instancia.
4.  Crearemos un método `get` (ningún método `set`) solo para el atributo `nombreEquipo` (el atributo `ciudad` no tendrá ningún `get`).
5.  Sobrescribiremos el método `toString` en la clase `Equipo` de tal forma que retorne un `String` con el siguiente aspecto: `Nombre Equipo (Ciudad)`. Por ejemplo: `Aula (Valladolid)`. No olvides intentar usar un `StringBuilder` dentro del método `toString`.

## Paso 2\. Crear la clase `Partido`.

Crearemos una clase llamada `Partido`, destinada a contener la información de cada partido:

1.  Un atributo **privado** llamado `local` que corresponderá al equipo local (clase `Equipo`).
2.  Un atributo **privado** llamado `visitante` que corresponderá al equipo visitante (clase `Equipo`).
3.  Un atributo **privado** llamado `puntosLocal` que corresponderá a los puntos obtenidos en el partido por el equipo local.
4.  Un atributo **privado** llamado `puntosVisitante` que corresponderá a los puntos obtenidos en el partido por el equipo visitante.
5.  Un atributo **privado** llamado `fecha` que corresponderá con la fecha del partido, y que será de tipo [LocalDate](https://docs.oracle.com/javase/9/docs/api/java/time/LocalDate.html "Documentación de la clase LocalDate (se abre en una nueva ventana)."). **Es buena idea que leas la documentación de esta clase en este momento.**
6.  No se implementará **ningún método `get` ni** `set`.
7.  **Implementar** el método público `nombreEquipoLocal` (sin ningún parámetro), que retornará un `String` con el nombre del equipo local.
8.  **Implementar** el método público `nombreEquipoVisitante` (sin ningún parámetro), que retornará un `String` con el nombre del equipo visitante.
9.  **Implementar** el método público `equipoGanador` (sin ningún parámetro), que retornará el equipo que ha ganado el partido (instancia de `Equipo`), o `null` si el partido resultó en empate.
10.  **Sobrescribir** el método `toString` de forma que obtenga la información del partido en formato cadena con el siguiente formato: `2017-12-01 - Aula 9 - Castellón 15` (fecha, equipo local, puntos, equipo visitante, puntos). Para añadir la fecha en formato texto puedes simplemente usar el método `toString` de la clase `LocalDate`.

## Paso 3\. Completar la información de cada partido.

Completar la clase `Partido` con lo siguiente:

1.  Añade un **constructor** que admita 5 parámetros (**no habrá ningún otro constructor**): equipo local, equipo visitante, puntuación equipo del local, puntuación del equipo visitante y fecha (instancia de `LocalDate`).
2.  A la hora de establecer la fecha del partido es necesario que hagas una copia de la fecha. Para ello puedes crear una instancia de `LocalDate` partiendo de otra existente usando el método estático [from](https://docs.oracle.com/javase/9/docs/api/java/time/LocalDate.html#from-java.time.temporal.TemporalAccessor- "Documentación del método from de la clase LocalDate.") de dicha clase (se puede usar dado que `LocalDate` implementa la interfaz `TemporalAccessor`). Si este punto te resulta demasiado complejo, déjalo para el final.
3.  El constructor deberá **lanzar una excepción** con el mensaje `Los datos de creación del partido son erróneos.`, si ocurre alguno de los casos siguientes:
    1.  Alguna puntuación es inferior a 0.
    2.  Algunas de las instancias de equipo son `null`.
    3.  La fecha proporcionada es `null`.
    4.  La fecha proporcionada es anterior a 1 del 1 de 1990\. Para hacer esta última operación puedes utilizar el método de instancia `isBefore` de la clase `LocalDate`, pasándole como parámetro una instancia de `LocalDate` con la fecha 1 del 1 de 1990\. Si este punto te resulta demasiado complejo, déjalo para el final.

## Paso 4\. Crear la clase `Temporada`.

Crea una clase llamada `Temporada`, que contendrá toda la información de la temporada. Esta clase tendrá lo siguientes atributos:

1.  Un atributo **privado** llamado `equipos` que será un mapa (`Map`) que contendrá todos los equipos que participan en la temporada. En el mapa (un `HashMap` por ejemplo), la llave o clave será el nombre del equipo y el contenido la instancia de `Equipo`. Esto permitirá buscar fácilmente equipos por su nombre.
2.  Un atributo **privado** llamado `partidos` que será un conjunto (`Set`) que contendrá todos los partidos que se han jugado. El conjunto que puedes utilizar es un `TreeSet` (más adelante se pedirá que se implemente la interfaz `Comparable` en la clase `Partido`, y esto permitirá que el conjunto esté ordenado de forma automática por fecha).
3.  Un atributo **privado** llamado `nombreTemporada` que será el nombre de la temporada (por ejemplo, "<span style="font-family: courier\ new, courier, monospace;">División de Honor Femenina 2017/2018</span>").
4.  Crea un **constructor** para la clase `Temporada` (solo uno), que admita como argumento el nombre de la temporada. Dentro del constructor habrá que establecer el nombre de la temporada en la instancia, y crear instancias del mapa y del conjunto para almacenar los equipos y los partidos respectivamente.
5.  Crea el método `get` para el atributo `nombreTemporada` (solo ese método `get`, ninguno más, y tampoco ningún método `set`).

## Paso 5\. Añadir un equipo para que participe en la temporada.

En la clase `Temporada`, **implementa** un método llamado `añadirEquipo` que admita como parámetro una instancia de `Equipo` y devuelva `true` solo si se ha podido insertar el equipo en el mapa de equipos. El equipo solo se insertará si no está previamente en el mapa. Recuerda que se usará el nombre del equipo como llave (`key`), y la instancia del equipo pasada como parámetro como valor (`value`). Si un equipo con el mismo nombre se intenta volver a insertar, se retornará `false`.

## Paso 6\. Listar los equipos que participan en la temporada.

**Implementa** un método llamado `listaDeEquipos` en la clase `Temporada` que retorne toda la lista de equipos en formato en una lista `(List<Equipo>`). Aquí tendrás que usar tu ingenio para pasar todos los equipos del mapa de equipos (`Map<Equipo>`) de la clase `Temporada` a una lista (`ArrayList<Equipo>` por ejemplo).

## Paso 7\. Añadir un nuevo partido a la temporada.

**Implementa** un método llamado `insertarPartido` en la clase `Temporada` que permita insertar una instancia de `Partido` en el conjunto de partidos de la temporada. Este método no retornará nada (`void`). Solo se podrá insertar el partido si ambos equipos (local y visitante) forman parte de los equipos de la temporada (es decir, están dentro del mapa `equipos`). Si alguno de los equipos no está en el mapa de equipos, es porque no se ha añadido previamente con el método `añadirEquipo` y el método `insertarPartido` no deberá por tanto insertar el partido, en su lugar deberá lanzar una excepción tipo `IllegalArgumentException` con el texto `Alguno de los dos equipos no está en esta temporada.`.

## Paso 8\. Calcular los puntos que ha conseguido un equipo.

Implementa un método público llamado `calcularPuntosEquipo` en la clase `Temporada` que permita calcular cuantos puntos tiene un equipo en base a los partidos que ha jugado: **partidos empatados 1 puntos**, **partidos ganados 3 puntos**. Para esto, se recorrerá toda la lista de partidos del conjunto de partidos y se obtendrá el equipo ganador de cada partido (usando el método `equipoGanador` de la clase `Partido`). El método admitirá como parámetro un `String` con el nombre del equipo, y devolverá un entero con la cantidad de puntos obtenidos de dicho equipo.

Después se sobrecargará el método anterior, `calcularPuntosEquipo`, para que admita como parámetro una instancia de `Equipo` en lugar de un `String`. Haz que este método calcule los puntos del equipo pasado por parámetro **invocando al otro método**.

## Paso 9\. Listar los partidos de la temporada.

En la clase `Temporada` implementa un método llamado `partidosToString` que genere un `String`. Dicho `String` resultante contendrá la lista (en formato texto) de partidos en los que ha participado un equipo pasado por parámetro (ya sea como local o como visitante). Este método admitirá un único parámetro, que será una instancia de la clase `Equipo`, y como se ha comentado antes, retornará un `String`. Si el equipo pasado por parámetro es `null`, en la lista se mostrarán todos los partidos de la temporada de todos los equipos. Internamente, deberá usar el método `toString` de la clase `Partido` para generar una lista que tendrá el siguiente aspecto (en el siguiente ejemplo se muestra la lista de partidos del equipo Zuazo):


    2017-12-06 - Aula 10 - Zuazo 16
    2017-12-10 - Castellón 13 - Zuazo 18
    2017-12-16 - Zuazo 18 - Castellón 9
    2017-12-17 - Zuazo 11 - Málaga 11
    2017-12-18 - Zuazo 17 - Aula 14


Después, implementa **una versión sobrecargada** del método `partidosToString` que no admita ningún parámetro, y que simplemente retorne la lista de todos los partidos. Para realizar este método, es obligatorio usar el otro método `partidosToString` ya creado (ten en cuenta que esta versión sin parámetros se usa en la clase `Principal` proporcionada a modo de ejemplo).

## Paso 10\. Mostrar los resultados de los temporada.

Sobrescribe el método `toString` en la clase `Temporada`. En este método se obtendrá un `String` que contendrá el nombre de la temporada y el listado de todos los equipos participantes en la temporada con su correspondiente puntuación. Para hacer este método debes hacer uso de los métodos `listaDeEquipos` (para obtener la lista de equipos) y `calcularPuntosEquipo` (para calcular los puntos de cada equipo). Un ejemplo de `String` generado por este método podría ser el siguiente:  


    ----------------------
    Equipos participantes:
    ----------------------
    Zuazo (Barakaldo) : 13
    Castellón (Castellón) : 4
    Málaga (Málaga) : 11
    Aula (Valladolid) : 0


## Paso 11\. Ordenación.

Este apartado es un poco más complejo, por lo que si no te sale, ten en mente que son solo unas décimas de la tarea (0,83 puntos para ser exactos). En este apartado se pide que los datos que retornan los métodos `partidosToString` y `toString` de la clase `Temporada` aparezcan ordenados, para ello:

*   Implementa en la clase `Partido` la interfaz `Comparable` y el método asociado a dicha interfaz. Impleméntalo de tal forma que los partidos se ordenen por fecha de forma ascendente (de más antiguo a más nuevo) dentro del `TreeSet` donde son almacenados. Recuerda que los `TreeSet` son árboles ordenados automáticamente, pero que necesitan que el objeto que almacenan implemente la interfaz `Comparable`. Esto hará que cuando se invoque el método `partidosToString` los partidos aparezcan ya ordenados. Este sería un ejemplo de ejecución una vez que dicha interfaz está implementada:  


        -----------------
        Lista de partidos
        -----------------
        2017-12-01 - Aula 9 - Castellón 15
        2017-12-06 - Aula 10 - Zuazo 16
        2017-12-07 - Málaga 23 - Aula 11
        2017-12-08 - Málaga 13 - Castellón 13
        2017-12-09 - Castellón 17 - Málaga 18
        2017-12-10 - Castellón 13 - Zuazo 18
        2017-12-16 - Zuazo 18 - Castellón 9
        2017-12-17 - Zuazo 11 - Málaga 11
        2017-12-18 - Zuazo 17 - Aula 14
        2017-12-22 - Aula 13 - Málaga 19


_Nota: consulta la documentación de la clase [LocalDate](https://docs.oracle.com/javase/9/docs/api/java/time/LocalDate.html "Documentación de la clase LocalDate (se abre en una nueva ventana).") para ver que métodos implementados por dicha clase pueden ayudarte a comparar una fecha con otra (hay un método que hace justo lo que necesitas)._

*   Modifica el código de la clase `toString` de la clase `Temporada` para que ordene los equipos participantes según su puntuación (de mayor a menor puntuación). Para ello puedes usar el método estático `sort` de la clase `Collections`. Este método permite ordenar una lista usando un comparador (que es una clase que implementa la interfaz `Comparator`). Para hacer esto tienes varias opciones:
    *   Opción a: crear una clase interna adicional que implemente la interfaz `Comparator` (interna a la clase `Temporada`).
    *   Opción b: usar una clase anónima que implemente la interfaz `Comparator`.

    Un ejemplo de como quedaría la lista de equipos después de implementar lo anterior sería el siguiente:


        Temporada: División de Honor Femenina 2017/2018
        ----------------------
        Equipos participantes:
        ----------------------
        Zuazo (Barakaldo) : 13
        Málaga (Málaga) : 11
        Castellón (Castellón) : 4
        Aula (Valladolid) : 0

Nota: para poder ordenar esta lista es necesario que calcules los puntos los puntos de cada equipo invocando el método `calcularPuntosEquipo` de la clase Temporada.

## Paso 12\. Documentación y estilo.

*   Documenta todas las clases y métodos de tu código con comentarios JavaDoc.
*   Indenta tu código de forma adecuada. Recuerda que NetBeans puede hacer esto por tí (selecciona el código a "poner bonito" y pulsa `Alt+Mayús.+F`).
*   Respeta el nombrado de variables explicado en la unidad 1\. Recuerda que en NetBeans puedes renombrar rápidamente una variable, un método o una clase, situando el cursor encima del nombre y pulsando `Ctrl+R`.