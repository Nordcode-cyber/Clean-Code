                                          UNA CLASE DEBE TENER UNA RAZON PARA CAMBIAR                   

Itenta hacer a cada clase responsable de una unica parte de la funcionalidad proporcionada por el software, y haz que esa responsabilidad,
quede totalmente encapsulada por la clase.
El principal objetivo de este principio, es reducir la complejidad.No hace falta que inventes un disenio sofisticado para un programa que tiene,
200 lineas de codigo. Con un puñado de buenos metodos te ira bien. Cuando tu programa crece y cambia constantemente. En cierto punto las clases se vuelven tan grandes, que ya no puedes recordar sus detalles.
La navegación del código se ralentiza hasta ir a paso de tortuga y tienes que recorrer clases enteras o incluso un programa completo para encontrar algo específico. El número de entidades en el programa supera tu capacidad cerebral y sientes que pierdes el control sobre el código.
Hay más: si una clase hace demasiadas cosas, tienes que cambiarla cada vez que una de esas cosas cambia. Al hacerlo, te arriesgas a
descomponer otras partes de la clase que no pretendías cambiar. Si sientes que te resulta difícil centrarte en un aspecto específico del
programa cada vez, recuerda el principio de responsabilidad única y comprueba si es el momento de dividir algunas clases en partes.
