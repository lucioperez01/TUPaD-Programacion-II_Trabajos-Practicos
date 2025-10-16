package vehiculoauto;
public abstract class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        setModelo(modelo);
        setMarca(marca);
    }

    public final void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }
    }

    public final void setModelo(String modelo) {
        if(modelo != null) {
            this.modelo = modelo;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    
    public void mostrarInfo() {
        System.out.println("Hola soy un vehiculo");
    }
}
