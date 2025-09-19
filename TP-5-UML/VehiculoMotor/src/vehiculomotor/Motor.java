package vehiculomotor;
public class Motor {
    private String tipo;
    private long numeroSerie;

    //constructor
    public Motor(String tipo, long numeroSerie) {
        setTipo(tipo);
        setNumeroSerie(numeroSerie);
    }

    //setter
    private final void setTipo(String tipo) {
        if(tipo != null){
            this.tipo = tipo;            
        }
    }

    private final void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" + "tipo=" + tipo + ", numeroSerie=" + numeroSerie + '}';
    } 
}
