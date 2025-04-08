Bridge es un patrón de diseño estructural que te permite dividir una clase grande, o un grupo de clases estrechamente
relacionadas, en dos jerarquías separadas (abstracción e implementación) que pueden desarrollarse independientemente
la una de la otra.

-La Abstracción ofrece lógica de control de alto nivel. Depende de que el objeto de la implementación haga el trabajo de
bajo nivel.
-La Implementación declara la interfaz común a todas las implementaciones concretas. Una abstracción sólo se puede comunicar con un objeto de implementación a través de los métodos que se declaren aquí. La abstracción puede enumerar los mismos métodos que la implementación, pero normalmente la abstracción declara funcionalidades complejas que dependen de una amplia variedad de operaciones primitivas declaradas por la implementación.
-Las Implementaciones Concretas contienen código específico de plataforma.
-Las Abstracciones Refinadas proporcionan variantes de lógica de control. Como sus padres, trabajan con distintas implementaciones a través de la interfaz general de implementación.
-Normalmente, el Cliente sólo está interesado en trabajar con la abstracción. No obstante, el cliente tiene que vincular el objeto de la abstracción con uno de los objetos de la implementación.


Utiliza el patrón Bridge cuando quieras dividir y organizar una
clase monolítica que tenga muchas variantes de una sola funcionalidad (por ejemplo, si la clase puede trabajar con diversos servidores de bases de datos).
Conforme más crece una clase, más difícil resulta entender cómo funciona y más tiempo se tarda en realizar un cambio.
Cambiar una de las variaciones de funcionalidad puede exigir realizar muchos cambios a toda la clase, lo que a menudo provoca que se cometan errores o no se aborden algunos de los efectos colaterales críticos.
El patrón Bridge te permite dividir la clase monolítica en varias jerarquías de clase. Después, puedes cambiar las clases de cada jerarquía independientemente de las clases de las otras.
Esta solución simplifica el mantenimiento del código y minimiza el riesgo de descomponer el código existente.



