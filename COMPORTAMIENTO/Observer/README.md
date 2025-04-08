Observer es un patrón de diseño de comportamiento que te permite definir un mecanismo de suscripción para notificar a
varios objetos sobre cualquier evento que le suceda al objeto que están observando.

-El Notificador envía eventos de interés a otros objetos. Esos eventos ocurren cuando el notificador cambia su estado o ejecuta algunos comportamientos. Los notificadores contienen una infraestructura de suscripción que permite a nuevos y antiguos suscriptores abandonar la lista.
-Cuando sucede un nuevo evento, el notificador recorre la lista de suscripción e invoca el método de notificación declarado en la interfaz suscriptora en cada objeto suscriptor.
-La interfaz Suscriptora declara la interfaz de notificación. En la mayoría de los casos, consiste en un único método
actualizar . El método puede tener varios parámetros que permitan al notificador pasar algunos detalles del evento junto
a la actualización.
-Los Suscriptores Concretos realizan algunas acciones en respuesta a las notificaciones emitidas por el notificador. Todas
estas clases deben implementar la misma interfaz de forma que el notificador no esté acoplado a clases concretas.
-Normalmente, los suscriptores necesitan cierta información contextual para manejar correctamente la actualización. Por
este motivo, a menudo los notificadores pasan cierta información de contexto como argumentos del método de notificación.
El notificador puede pasarse a sí mismo como argumento, dejando que los suscriptores extraigan la información necesaria
directamente.
-El Cliente crea objetos tipo notificador y suscriptor por separado y después registra a los suscriptores para las actualizaciones del notificador


Utiliza el patrón Observer cuando los cambios en el estado de un objeto puedan necesitar cambiar otros objetos y el grupo
de objetos sea desconocido de antemano o cambie dinámicamente.
El patrón Observer permite que cualquier objeto que implemente la interfaz suscriptora pueda suscribirse a notificaciones de eventos en objetos notificadores. Puedes añadir el mecanismo de suscripción a tus botones, permitiendo a los clientes acoplar su código personalizado a través de clases suscriptoras personalizadas.
Utiliza el patrón cuando algunos objetos de tu aplicación deban observar a otros, pero sólo durante un tiempo limitado
o en casos específicos.
