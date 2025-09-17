package solid.openclose.clases;



public class Iva implements Impuesto {

    @Override
    public double calcular(double monto) {
        return monto * 0.21;
     
        
    }
    
}
