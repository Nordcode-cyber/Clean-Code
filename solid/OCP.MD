El principio Open/Closed (OCP) de SOLID dice:

Las clases deben estar abiertas a la extensión, pero cerradas a la modificación.
O sea: cuando aparecen nuevos requerimientos, no deberías modificar la clase existente, sino extenderla.
🔹 Problema real

Imaginemos que estás desarrollando un sistema de facturación.
Tienes una clase que calcula impuestos:
```public class CalculadoraImpuestos {```
```public double calcular(double monto, String tipoImpuesto) { ```
        ```if (tipoImpuesto.equals("IVA")) {```
        ```return monto * 0.21; ```
        ``` } else if (tipoImpuesto.equals("GANANCIAS")) { ```
               ``` return monto * 0.35; ```
        ```} ```
        ```return 0; ```
       ``` } ```
```}```

Problema: Cada vez que aparece un nuevo impuesto (ej: “Impuesto País”), hay que modificar esta clase. Eso rompe OCP.

```public interface Impuesto { ```
```  double calcular(double monto);```
```} ```
```public class IVA implements Impuesto { ```
``` @Override```
```public double calcular(double monto) { ```
``` return monto * 0.21;```
   ```} ```
```} ```

```public class Ganancias implements Impuesto { ```
```   public double calcular(double monto) {```
```   return monto * 0.35;```
```  } ```
```} ```

*** Y si mañana aparece un nuevo impuesto:
```public class ImpuestoPais implements Impuesto { ```
```   public double calcular(double monto) {```
```   return monto * 0.15;```
```  } ```
```} ```
👉 No toco la CalculadoraImpuestos, solo extiendo con una nueva clase.
### 🔹 Situaciones reales donde aplicar OCP

Pasarelas de pago (agregar PayPal, Stripe, MercadoPago sin modificar el código existente).

Exportadores de reportes (PDF, Excel, CSV, JSON).

Sistemas de notificación (email, SMS, push, WhatsApp).

Motores de reglas de negocio (descuentos según temporada o cliente).


   



    
    
        
    



 


