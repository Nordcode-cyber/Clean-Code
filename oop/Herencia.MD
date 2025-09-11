  HERENCIA TEORIA
La herencia nos permitirá representar características o comportamiento en común entre clases, permitiendo 
definir en la clase Padre los atributos o métodos que sean comunes a las clases hijas, las cuales heredarán 
estos atributos o métodos definidos en la clasePadre.
• Lo anterior permite evitar duplicar el código entre la clase Padre y las clases Hijas, por lo que cumplimos con la reutilización de código que esuno de los principales objetivos de la POO.
• Si aplicamos el concepto de Herencia, podemos modelar de unamanera más sencilla sistemas del mundo real. Si ya la definición de objetos es un gran aporte, diseñar una jerarquía de clases, nos facilitará
aún más el modelado de clases.
La herencia o relación es-un es la relación que existe entre dos clases: la clase denominada,derivada que se crea a partir de otra ya existente, denominada clase base. La nueva clase hereda de la clase ya existente.
Por ejemplo, si existe una clase Figura y se desea crear una clase Triángulo, esta clase puede derivarse de Figura, ya que tendrá en común con ella un estado y un comportamiento, aunque luego tendrá sus características propias. Triángulo es un tipo de Figura. Otro ejemplo, puede ser Programador que es un tipo de empleado.
Evidentemente, la clase base y la clase derivada tienen código y datos comunes, de modo que si se crea, la clase derivada de modo independiente, se duplicaría mucho de lo que ya se ha escrito, para la clase base. 

Java soporta el mecanismo de extensión (extends) que permite crear clases
derivadas o clases que son extensión de otra clase, de modo que la nueva clase hereda todos los miembros datos y los métodos que pertenecen 
a la clase ya existente. La declaración de derivación de clases debe incluir la palabra reservada extends y, a continuación, el nombre de la clase base
de la que se deriva. La primera línea de cada declaración debe incluir el formato siguiente:
class nombre _ clase extends nombre _ clase _ base por ejemplo:
public class Ave extends Mascota 

                                                                REGLA
En Java se debe incluir la palabra reservada extends en la línea de la declaración de la clase derivada. Esta palabra reservada produce que
todos los miembros no privados (private) de la clase base se hereden 
en la clase derivada.
Miembros private de clase base son los únicos que la clase derivada no hereda, por lo que no se puede acceder a ellos desde métodos 
de la clase derivada. Los miembros con visibilidad public, protected se incorporan a la clase derivada con la misma visibilidad que tienen en la clase base.
La relación de herencia reduce código redundante en los programas o aplicaciones. 

                                                                IMPORTANTE
En el paradigma de la orientación a objetos, para que un lenguaje sea considerado orientado a objetos, debe soportar la propiedad de la herencia. La herencia múltiple se produce cuando una clase deriva de dos o más clases base. Este tipo
de herencia crea problemas por las colisiones o conflictos de nombres, esa es una de las razones por las que Java no incorpora la herencia múltiple. En caso de considerarse necesario se puede simular herencia múltiple con los interfaces.
Un objeto de una clase derivada se crea siguiendo este orden: primero la parte del objeto correspondiente a la clase base y, a continuación, se crea la parte propia de la clase derivada. Para llamar al constructor de la clase base desde el constructor de la clase derivada se emplea
la palabrea reservada super().

                                 CONCEPTO FUNDAMENTAL DE LA HERENCIA EN LA PROGRAMACIÓN ORIENTADA A OBJETOS

La herencia es uno de los conceptos fundamentales de la programación orientada a objetos (POO). La herencia permite que una clase herede las propiedades y comportamientos de otra clase, lo que le permite reutilizar código y crear una jerarquía de clases.

Por ejemplo, si tenemos una clase llamada "Animal" que tiene las propiedades "edad" y "peso" y el comportamiento "comer", podemos crear una clase llamada "Perro" que herede las propiedades y el comportamiento de "Animal". Esto significa que la clase "Perro" tendrá automáticamente las propiedades "edad" y "peso" y el comportamiento "comer". Además, podemos agregar nuevas propiedades y comportamientos a la clase "Perro", como "ladrar".

                      Para comprender mejor la herencia en POO, es importante entender algunos conceptos clave, como:

Clase: una plantilla que define las propiedades y comportamientos de un objeto.
Objeto: una instancia de una clase que tiene valores concretos para sus propiedades y puede realizar sus comportamientos.
Propiedades: características de un objeto que describen su estado.
Comportamientos: acciones que un objeto puede realizar.
Jerarquía de clases: la relación entre clases en la que una clase hereda las propiedades y comportamientos de otra clase.
En resumen, la herencia en POO permite que una clase herede las propiedades y comportamientos de otra clase, lo que permite crear una jerarquía de clases y reutilizar código. Entender estos conceptos básicos es clave para comprender la herencia en POO.