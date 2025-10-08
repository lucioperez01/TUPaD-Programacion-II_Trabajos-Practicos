package tiendastock;
import java.util.ArrayList;
import java.util.HashSet;
public class Inventario {
    
    private ArrayList<Producto> productos;
    
    public Inventario(){
        this.productos = new ArrayList<>();
    }
    
    
    public void agregarProducto(Producto p) {
        if(p != null) {
            productos.add(p);
            System.out.println("Se agregó " + p + " al inventario.");
        }
    }
    
    public void listarProductos(){
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
        
    public Producto buscarProductoPorId(String id){
        int i = 0;
        while ( i < this.productos.size() ) {
            if ( id.equals(productos.get(i).getId()) ){
                return productos.get(i);
            }
            i++; 
        }
        return null;
    }
    
    
    public boolean eliminarProducto(String id){
        int i = 0;
        while ( i < this.productos.size() ) {
            if ( id.equals(productos.get(i).getId()) ){
                Producto productoAEliminar = productos.get(i);
                productos.remove(i);
                System.out.println(productoAEliminar.getNombre()+ "id: "+ id + " se ha eliminado exitosamente del inventario");
                return true; //fue eliminado
            }
            i++; 
        }
        return false; //no se pudo eliminar / no fue encontrado
    }
    
    public void actualizarStock( String id, int nuevaCantidad) {
        int i = 0;
        while ( i < this.productos.size() ) {   //mientras i < cant productos
            if ( id.equals(productos.get(i).getId()) ){     // si id == id de cada prod
                productos.get(i).setCantidad(nuevaCantidad);  // si sí, se llama al setter 
                System.out.println("Se actualizó la cantidad de existencias de: " + productos.get(i).getNombre() + ", id:" + id + ". Nueva cantidad: " + productos.get(i).getCantidad());
            }
           i++;     
        }
    }
    
    public ArrayList filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        
        for (Producto producto : productos) {  //recorremos todos los prod
            if(producto.getCategoria() == categoria ) {  //si categoria es igual a la proporsionada
                productosFiltrados.add(producto); //agregar
                System.out.println(producto); 
            }
        }
        return productosFiltrados;
    }
    
    public void obtenerTotalStock() {
        int acum = 0;
        for (Producto producto : productos) {  
            System.out.println(producto.getNombre() + ": " + producto.getCantidad());
            acum = acum + producto.getCantidad();
        }
        
        System.out.println("Total de productos en el inventario: " + acum);
    }
    
    public Producto obtenerProductoConMayorStock() {
        int mayor = -1;
        Producto productoConMayorCantidad = null; 
        for (Producto producto : productos) {  // por cada prod
            if (producto.getCantidad() > mayor) { // si cantidad > mayor
                mayor = producto.getCantidad();  // se guarda en maoyor
                productoConMayorCantidad = producto;  // se guarda la instancia
            }
        }
        return productoConMayorCantidad; // se retorna la instancia
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltradosPorPrecio = new ArrayList<>();
        
        for (Producto producto : productos) {
            if( producto.getPrecio() >= min && producto.getPrecio() <= max ){ // si min < precio < max
                productosFiltradosPorPrecio.add(producto); // añadimos a precios filtrados
                
            }
        }
        System.out.println(productosFiltradosPorPrecio);
        return productosFiltradosPorPrecio;
    }
    
    public void mostrarCategoriasDisponibles(){
        HashSet<CategoriaProducto> categorias = new HashSet(); // set --> no duplicados
        for (Producto producto : productos) { // por cada producto
            categorias.add(producto.getCategoria()); // añadir al set
        }
        for (CategoriaProducto categoria: categorias) { // recorremos el set
            System.out.println(categoria + ": \nDescripcion: " + categoria.getDescripcion() + ".");  // mostrar
        }
    }
}