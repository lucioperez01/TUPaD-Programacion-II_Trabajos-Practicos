package cuentabancariatitular;
public class CuentaBancaria {
    private long cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    //constructor
    public CuentaBancaria(long cbu, double saldo) {
        setCbu(cbu);
        setSaldo(saldo);
        ClaveSeguridad claveSeguridad = new ClaveSeguridad(26389, "25/10/25");
        setClaveSeguridad(claveSeguridad);
    }

    //setters
    private final void setCbu(long cbu) {
        this.cbu = cbu;
    }

    private final void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private final void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        if(claveSeguridad != null) {
            this.claveSeguridad = claveSeguridad;
        }
    }
    
    //asociacion bidireccional
    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && this.titular.getCuentaBancaria() != this) {
            this.titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + '}';
    }
}
