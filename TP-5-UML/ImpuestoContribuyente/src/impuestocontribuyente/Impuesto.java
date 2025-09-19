package impuestocontribuyente;
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    //constructor
    public Impuesto(double monto) {
        setMonto(monto);
    }

    //setters
    private final void setMonto(double monto) {
        this.monto = monto;
    }
    
    //getters

    public double getMonto() {
        return monto;
    }
    
    //asociacion unidireccional
    public void setContribuyente(Contribuyente contribuyente) {
        if(contribuyente != null) {
            this.contribuyente = contribuyente;
        }
    }

    @Override
    public String toString() {
        return "Impuesto{" + "monto=" + monto + ", contribuyente=" + contribuyente + '}';
    }
}
