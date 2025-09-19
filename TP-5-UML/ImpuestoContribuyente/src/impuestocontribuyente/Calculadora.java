package impuestocontribuyente;
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double impuestoMontoFinal = impuesto.getMonto() * 1.21;
        
        System.out.println("Monto final del impuesto: " + impuestoMontoFinal);
    }
}
