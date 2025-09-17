                               OPEN / CLOSED PRINCIPLE

La idea fundamental de este principio, es evitar el codigo existente se descomponga cuando implementas,
nuevas funciones. Una clase esta abierta si puedes extenderla, (crear subclases y tambien añadir metodos,
campos, sobreescribir comportamiento base,etc). Algunos lenguajes permiten restringir en mayor medida la,
 extension de una clase con la palabra clave final.

                                La clase esta completa
Si se encuentra al 100%  para que otras clase las utilicen, su interfaz esta clraramente definida y no se cambiara,
en el futuro. una clase puede estar al mismo tiempo abierta(para la extension) y cerrada(para la modificacion).
En lugar de cambiar directamente el codigo de la clase, puedes crear subclases, y sobreescribir las partes, 
de la clase original que quieras que se comporten de otra forma.

                                            Clave

Este principio no esta pensado para aplicarse a todos los cambio de una clase, si sabes que hay un error en la clase,
debes areglarlo;  no crees subclases para ello . Una clase hija no debe ser responsable de los problemas de la 
clase padre