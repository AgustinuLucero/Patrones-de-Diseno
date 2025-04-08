Strategy es un patrón de diseño de comportamiento que te permite definir una familia de algoritmos, colocar cada uno de
ellos en una clase separada y hacer sus objetos intercambiables.

-La clase Contexto mantiene una referencia a una de las estrategias concretas y se comunica con este objeto únicamente a
través de la interfaz estrategia.
-La interfaz Estrategia es común a todas las estrategias concretas. Declara un método que la clase contexto utiliza para ejecutar una estrategia.
-Las Estrategias Concretas implementan distintas variaciones de un algoritmo que la clase contexto utiliza
-La clase contexto invoca el método de ejecución en el objeto de estrategia vinculado cada vez que necesita ejecutar el algoritmo. La clase contexto no sabe con qué tipo de estrategia funciona o cómo se ejecuta el algoritmo.
-El Cliente crea un objeto de estrategia específico y lo pasa a la clase contexto. La clase contexto expone un modificador set que permite a los clientes sustituir la estrategia asociada al contexto durante el tiempo de ejecución.

Utiliza el patrón Strategy cuando quieras utiliza distintas variantes de un algoritmo dentro de un objeto y poder cambiar
de un algoritmo a otro durante el tiempo de ejecución.
Utiliza el patrón Strategy cuando tengas muchas clases similares que sólo se diferencien en la forma en que ejecutan cierto comportamiento.
Utiliza el patrón Strategy cuando tengas muchas clases similares que sólo se diferencien en la forma en que ejecutan cierto comportamiento.
Utiliza el patrón para aislar la lógica de negocio de una clase, de los detalles de implementación de algoritmos que pueden no ser tan importantes en el contexto de esa lógica.
Utiliza el patrón cuando tu clase tenga un enorme operador condicional que cambie entre distintas variantes del mismo
algoritmo.
