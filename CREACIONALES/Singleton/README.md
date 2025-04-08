Singleton es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia,
a la vez que proporciona un punto de acceso global a dicha instancia.

La clase Singleton declara el método estático obtenerInstancia que devuelve la misma instancia de su propia clase.
El constructor del Singleton debe ocultarse del código cliente. La llamada al método obtenerInstancia debe ser la única
manera de obtener el objeto de Singleton.

Utiliza el patrón Singleton cuando una clase de tu programa tan solo deba tener una instancia disponible para todos los
clientes; por ejemplo, un único objeto de base de datos compartido por distintas partes del programa.

Utiliza el patrón Singleton cuando necesites un control más estricto de las variables globales.
