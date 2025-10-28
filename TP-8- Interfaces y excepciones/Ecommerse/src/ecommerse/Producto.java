package ecommerse;
public class Producto implements Pagable {
    private String nombre;
    private double precio;
    private String id;
    private final double MARGEN_DE_GANANCIA = 1.35;

    public Producto(String id, String nombre, double precio) {
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    private void setNombre(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }
    
    private void setId(String nombre) {
        if(nombre != null){
            this.nombre = nombre;
        }
    }

    private void setPrecio(double precio) {
        if(precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que 0");
        }
    }
    
    @Override
    public double calcularTotal() {
        return this.precio * this.MARGEN_DE_GANANCIA;
    }
}
