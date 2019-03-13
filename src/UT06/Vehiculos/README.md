# Ejemplo de Vehículos

En este ejemplo se plantea el siguiente modelo de información:

* Existirá una clase `PersonaPropietaria` que podrá poseer una lista de Vehiculos.
* Se podrán agregar, eliminar, etc. `Vehiculos` en base a un identificador de vehiculo.
* Un `Vehiculo` será una clase abstracta, que podrá tener varias implementaciones.
* La interfaz `Encendible` se aplicará a aquellos objetos que puedan encenderse.
* Un `Coche` será una implementación de `Vehiculo` y además será `Encendible`.
* Una `Moto` será una implementación de `Vehiculo` y además será `Encendible`.
* Un `Coche` tendrá 2 faros, una matrícula y un cuenta kilometros de trayecto.
* Una `Moto` tendrá solo 1 faro y una matrícula.
* Un `Faro` será un objeto encencible.

