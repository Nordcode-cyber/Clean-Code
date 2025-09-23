## Principio del dise**ño de software**

1. Reutilización del código
2. Extensibilidad
3. Encapsulación lo que varia
4. programa una interfaz, no a la implementación
5. Favorece la composición sobre la herencia

### Reutilización del código

Costos y tiempo son dos de los parámetros más valiosos a la
hora de desarrollar cualquier producto de software. Dedicar
menos tiempo al desarrollo se traduce en entrar en el mercado
antes que la competencia. Unos costos más bajos en el desarrollo
significa que habrá más dinero disponible para marketing
y un alcance más amplio a clientes potenciales.
La reutilización de código es una de las formas más habituales
de reducir costos de desarrollo. El propósito es obvio: en lugar
de desarrollar algo una y otra vez desde el principio, ¿por qué
no reutilizar el código existente en nuevos proyectos?

### Extensibilidad

El cambio es lo único constante en la vida de un programador.

En primer lugar, comprendemos mejor el problema una vez
que comenzamos a resolverlo. A menudo, para cuando finalizamos
la primera versión de una aplicación, estamos listos
para reescribirla desde el principio porque entonces comprendemos
mucho mejor diversos aspectos del problema. También
creciste profesionalmente y tu propio código te parece basura.

### Encapsula lo que varia

Identifica los aspectos de tu aplicación que varían y sepáralos
de los que se mantienen inalterables.

El objetivo principal de este principio es minimizar el efecto
provocado por los cambios, puedes aislar las partes del programa que
varían, en módulos independientes, protegiendo el resto del código frente a efectos adversos. 
Al hacerlo, dedicarás menos
tiempo a lograr que el programa vuelva a funcionar, implementando
y probando los cambios. Cuanto menos tiempo dediques
a realizar cambios, más tiempo tendrás para implementar
funciones.

### Programa a una interfaz, no a una implementación.
Programa a una interfaz, no a una implementación. Depende de abstracciones, no de clases concretas.
Sabrás que el diseño es lo suficientemente flexible si puedes extenderlo con facilidad y sin descomponer el código existente.
Vamos a asegurarnos de que esta afirmación es correcta,viendo un nuevo ejemplo con gatos. Un Gato que puede
comer cualquier comida es más flexible que uno que sólo puede comer salchichas. Al primer gato le puedes dar salchichas
porque éstas son un subgrupo de “cualquier comida”, pero puedes extender el menú de ese gato con cualquier otra
comida. Cuando quieres hacer que dos clases colaboren, puedes comenzar por hacer una dependiente de la otra. Caramba, yo mismo
suelo empezar haciendo eso. Sin embargo, hay otra forma más flexible de establecer la colaboración entre objetos: