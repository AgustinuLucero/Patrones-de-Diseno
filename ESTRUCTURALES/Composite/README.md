Composite es un patrón de diseño estructural que te permite componer objetos en estructuras de árbol y trabajar con 
esas estructuras como si fueran objetos individuales.

-La interfaz Componente describe operaciones que son comunes a elementos simples y complejos del árbol.
-La Hoja es un elemento básico de un árbol que no tiene subelementos. Normalmente, los componentes de la hoja acaban realizando la mayoría del trabajo real, ya que no tienen a nadie a quien delegarle el trabajo.
-El Contenedor (también llamado compuesto) es un elemento que tiene subelementos: hojas u otros contenedores. Un contenedor no conoce las clases concretas de sus hijos. Funciona con todos los subelementos únicamente a través de la interfaz componente. Al recibir una solicitud, un contenedor delega el trabajo a sus
subelementos, procesa los resultados intermedios y devuelve el resultado final al cliente.
-El Cliente funciona con todos los elementos a través de la interfaz componente. Como resultado, el cliente puede funcionar de la misma manera tanto con elementos simples como complejos del árbol.

Utiliza el patrón Composite cuando tengas que implementar una estructura de objetos con forma de árbol.
El patrón Composite te proporciona dos tipos de elementos básicos que comparten una interfaz común: hojas simples y contenedores complejos. Un contenedor puede estar compuesto por hojas y por otros contenedores. Esto te permite construir una estructura de objetos recursivos anidados parecida a un árbol.

Utiliza el patrón cuando quieras que el código cliente trate elementos simples y complejos de la misma forma.
Todos los elementos definidos por el patrón Composite comparten una interfaz común. Utilizando esta interfaz, el cliente no tiene que preocuparse por la clase concreta de los objetos con los que funciona.