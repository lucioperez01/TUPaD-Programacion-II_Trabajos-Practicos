package impuestocontribuyente;
public class ImpuestoContribuyente {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Juan Perez", 2033589958);
        Impuesto impuesto = new Impuesto(15835);
        Calculadora calculadora = new Calculadora();
        
        //asociacion unidireccional
        impuesto.setContribuyente(contribuyente);
        System.out.println(impuesto);
        
        //dependencia de uso
        calculadora.calcular(impuesto);
    }
}
