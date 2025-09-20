###                                      LISKOV SUBSTITUTION PRINCIPLE

Al extender una clase, recordar de tener la capacidad, de pasar objetos de las subclases, en lugar,
de objetos de la clase padre, sin descomponer codigo fuente, esto significa que las subclases,
es decir clases derivadas, deben permanecer compatible con el comportamiento de la superclase.
Al sobreescribir un metodo, extiende el comportamiento base en lugar de substituirlo con algo,
totalmente distinto.

###                         Objetos de una subclase deberían poder sustituir objetos de la superclase 
###                                  sin alterar el correcto funcionamiento del programa.

###                              Los tipos de parametros en el metodo de una subclase deben coincidir 
###                             o ser mas abstractos que los tipos de parametros del metodo de la superclase

###                                 El tipo de retorno en el metodo de una subclase debe coincidir o ser subtipo, 
###                                         del tipo de retorno del metodo de la superclase
            