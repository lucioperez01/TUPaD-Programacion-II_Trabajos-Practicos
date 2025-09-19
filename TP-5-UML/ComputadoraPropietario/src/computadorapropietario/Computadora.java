package computadorapropietario;
public class Computadora {
    private String marca;
    private long numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, long numeroSerie) {
        setMarca(marca);
        setNumeroSerie(numeroSerie);
        PlacaMadre placaMadre = new PlacaMadre("Gigabyte", "B560M"); 
    }


    private final void setMarca(String marca) {
        if(marca != null) {
            this.marca = marca;
        }
    }

    private final void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    
    //asociacion bidireccional
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && this.propietario.getComputadora() != this) {
            this.propietario.setComputadora(this);
        }
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", numeroSerie=" + numeroSerie + ", placaMadre=" + placaMadre + '}';
    }

    
    
    
    
    
}
