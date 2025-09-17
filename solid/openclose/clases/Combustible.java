package solid.openclose.clases;

public class Combustible implements Impuesto{
    public double calcular(double monto) {
        return monto * 1.3;
    }

    
}
