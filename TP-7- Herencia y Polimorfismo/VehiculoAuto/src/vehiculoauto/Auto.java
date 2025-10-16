package vehiculoauto;
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        setCantidadPuertas(cantidadPuertas);
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Hola soy un auto con " + cantidadPuertas + " puertas, marca: " + getMarca() + " y modelo: " + getModelo());
    }
}
