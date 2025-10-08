package tiendastock;
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        setId(id);
        setNombre(nombre);
        setPrecio(precio);
        setCantidad(cantidad);
        setCategoria(categoria);
    }
    
    //setters

    public void setId(String id) {
        if (id != null) {
            this.id = id;            
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;            
        }
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    
    //getters
    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public void mostrarInfo() {
        System.out.println("Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}');
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", categoria=" + categoria + '}';
    }
}
