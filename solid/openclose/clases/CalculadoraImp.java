

public class CalculadoraImp {
      public double calcular(double monto, String tipoImpuesto) {
        if (tipoImpuesto.equals("IVA")) {
            return monto * 0.21;
        } else if (tipoImpuesto.equals("GANANCIAS")) {
            return monto * 0.35;
        }
        return 0;
    }

    
}
