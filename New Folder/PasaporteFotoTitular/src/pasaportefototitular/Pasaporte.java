package pasaportefototitular;
public class Pasaporte {
    private int numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;

    //constructor
    public Pasaporte(int numero, String fechaEmision, String imagen, String formato) {
        setNumero(numero);
        setFechaEmision(fechaEmision);
        this.foto = new Foto(imagen, formato);
        
    }
    
    //setters
    private final void setNumero(int numero) {
        this.numero = numero;
    }

    private final void setFechaEmision(String fechaEmision) {
        if(fechaEmision != null) {
            this.fechaEmision = fechaEmision;
        }
    }

    //referencia a Titular - asociacion bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;     
        if (titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
    
    //getters
    public int getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }
    
    //toString
    @Override
    public String toString() {
        return "Pasaporte{" + "numero=" + numero + ", fechaEmision=" + fechaEmision + ", foto=" + foto + '}';
    }
}
