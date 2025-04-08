Builder es un patrón de diseño creacional que nos permite construir objetos complejos paso a paso. El patrón nos permite
producir distintos tipos y representaciones de un objeto empleando el mismo código de construcción.



La interfaz Constructora declara pasos de construcción de producto que todos los tipos de objetos constructores tienen
en común.

Los Constructores Concretos ofrecen distintas implementaciones de los pasos de construcción. Los constructores concretos
pueden crear productos que no siguen la interfaz común.

Los Productos son los objetos resultantes. Los productos construidos por distintos objetos constructores no tienen que pertenecer a la misma jerarquía de clases o interfaz.

La clase Directora define el orden en el que se invocarán los
pasos de construcción, por lo que puedes crear y reutilizar configuraciones específicas de los productos.

El Cliente debe asociar uno de los objetos constructores con la clase directora. Normalmente, se hace una sola vez mediante los parámetros del constructor de la clase directora, que utiliza el objeto constructor para el resto de la construcción. No obstante, existe una solución alternativa para cuando el cliente pasa el objeto constructor al método de producción de la clase directora. En este caso, puedes utilizar un constructor diferente cada vez que produzcas algo con la clase directora.


Utiliza el patrón Builder para evitar un “constructor telescópico”.
Digamos que tenemos un constructor con diez parámetros opcionales. Invocar a semejante bestia es poco práctico, por lo
que sobrecargamos el constructor y creamos varias versiones más cortas con menos parámetros. Estos constructores siguen recurriendo al principal, pasando algunos valores por defecto a cualquier parámetro omitido.
El patrón Builder permite construir objetos paso a paso, utilizando tan solo aquellos pasos que realmente necesitamos.
Una vez implementado el patrón, ya no hará falta apiñar decenas de parámetros dentro de los constructores.
