##                                                 TEORIA

Los patrones creacionales proporcionan varios mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización
del código existente.Evitando la complejidad del código y la dependencia directa de clases concretas. 
El objetivo principal es dejar que el sistema decida qué objetos necesita crear en lugar de que el programador,
 lo especifique manualmente en cada punto del código.

###                                                CLAVE

 Estos patrones se dividen en dos categorías principales: de clase y de objeto. Los patrones de clase usan,
  la herencia para delegar la creación de objetos, mientras que los patrones de objeto usan la composición
   (delegación) para delegar la creación de objetos.

####                                            FACTORY METHOD

Proporciona una interfaz para la creacion de objetos, en una superclase, mientras permite a las subclase, alterar el tipo de objeto,
que se crearan.El patrón Factory Method sugiere que, en lugar de llamar al operador _new_ para construir objetos directamente, se invoque
a un método fábrica especial.Los objetos devueltos por el método, fábrica a menudo se denominan productos.
#####                         **Utiliza el Método Fábrica cuando no conozcas de antemano las*
#####                   **dependencias y los tipos exactos de los objetos con los que deba funcionar tu código.*

