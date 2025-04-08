Adapter es un patrón de diseño estructural que permite la colaboración entre objetos con interfaces incompatibles.

El adaptador obtiene una interfaz compatible con uno de los objetos existentes.
Utilizando esta interfaz, el objeto existente puede invocar con seguridad los métodos del adaptador.
Al recibir una llamada, el adaptador pasa la solicitud al segundo objeto, pero en un formato y orden que ese segundo objeto espera.

Utiliza la clase adaptadora cuando quieras usar una clase existente, pero cuya interfaz no sea compatible con el resto del
código. El patrón Adapter te permite crear una clase intermedia que sirva como traductora entre tu código y una clase heredada, una clase de un tercero o cualquier otra clase con una interfaz extraña.

Utiliza el patrón cuando quieras reutilizar varias subclases existentes que carezcan de alguna funcionalidad común que no
pueda añadirse a la superclase.
