package celularbareria;
public class Bateria {
    private String modelo;
    private int capacidad;
    
    public Bateria(String modelo, int capacidad){
        setModelo(modelo);
        setCapacidad(capacidad);
    }

    public void setModelo(String modelo) {
        if(modelo != null){
            this.modelo = modelo;
        }
        
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Bateria{" + "modelo=" + modelo + ", capacidad=" + capacidad + '}';
    }
}
