package reservamesa;
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        setNumero(numero);
        setCapacidad(capacidad);
    }
  
    private final void setNumero(int numero) {
        this.numero = numero;
    }

    private final void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
}
