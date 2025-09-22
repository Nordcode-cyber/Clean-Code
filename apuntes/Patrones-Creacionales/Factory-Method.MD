####                                            FACTORY METHOD

Proporciona una interfaz para la creacion de objetos, en una superclase, mientras permite a las subclase, alterar el tipo de objeto,
que se crearan.El patrón Factory Method sugiere que, en lugar de llamar al operador _new_ para construir objetos directamente, se invoque
a un método fábrica especial.Los objetos devueltos por el método, fábrica a menudo se denominan productos.
#####                         **Utiliza el Método Fábrica cuando no conozcas de antemano las*
#####                   **dependencias y los tipos exactos de los objetos con los que deba funcionar tu código.*

El patrón Factory Method separa el código de construcción de producto del código que hace uso del producto. Por ello, es
más fácil extender el código de construcción de producto de forma independiente al resto del código.
Por ejemplo, para añadir un nuevo tipo de producto a la aplicación, sólo tendrás que crear una nueva subclase creadora y
sobrescribir el Factory Method que contiene.

#####                                           APLICABILIDAD DEL  FACTORY METHOD

El patrón Factory Method separa el código de construcción de producto del código que hace uso del producto. Por ello, es
más fácil extender el código de construcción de producto de forma independiente al resto del código.
Por ejemplo, para añadir un nuevo tipo de producto a la aplicación, sólo tendrás que crear una nueva subclase creadora y
sobrescribir el Factory Method que contiene.