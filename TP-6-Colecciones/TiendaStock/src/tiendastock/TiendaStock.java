package tiendastock;
import java.util.ArrayList;
public class TiendaStock {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        cargarInventario(inventario);
        
        System.out.println("Listar productos:");
        inventario.listarProductos();
        
        System.out.println("-----------------------");
        System.out.println("Buscar por ID");
        inventario.buscarProductoPorId("CEC697").mostrarInfo();
        
        System.out.println("-----------------------");
        System.out.println("Filtrar por categoria:");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        System.out.println("-----------------------");
        System.out.println("Eliminar producto por id:");
        inventario.eliminarProducto("CEC697");
        System.out.println("Listar productos: ");
        inventario.listarProductos();
        System.out.println("Falta paquete de fideos, antes era el cuarto. Fue eliminado");
        
        System.out.println("-----------------------");
        System.out.println("Actualizar stock de un producto:");
        inventario.buscarProductoPorId("GKO599").mostrarInfo();
        inventario.actualizarStock("GKO599", 1);  //tenia cantidad: 3, se actualizó a cantidad: 1
        System.out.println("Cantidad actualizada:");
        inventario.buscarProductoPorId("GKO599").mostrarInfo();
        
        System.out.println("-----------------------");
        System.out.println("Mostrar total stock: ");
        inventario.obtenerTotalStock();
        
        System.out.println("-----------------------");
        System.out.println("Mostrar producto con mayor mayor stock: ");
        inventario.obtenerProductoConMayorStock().mostrarInfo();
        
        System.out.println("-----------------------");
        System.out.println("Filtrar productos por precio (min: 1000, max:3000):");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        
        System.out.println("-----------------------");
        System.out.println("Mostrar categorias disponibles");
        inventario.mostrarCategoriasDisponibles();
    }
    
    public static void cargarInventario(Inventario inventario){
        Producto lavarropas01 = new Producto("GJD459", "Samsung Inverter", 358675.3, 5, CategoriaProducto.HOGAR);
        Producto celular01 = new Producto("GKO599", "Motorola Edge 50", 13588775.1, 3, CategoriaProducto.ELECTRONICA);
        Producto remera01 = new Producto("KJN752", "Remera Guns & Roses", 10867.0, 15, CategoriaProducto.ROPA);
        Producto fideos01 = new Producto("CEC697", "Paquete de fideos 500g", 1001, 35, CategoriaProducto.ALIMENTOS);
        Producto lavarropas02 = new Producto("GUR809", "Drean Next", 230675.3, 7, CategoriaProducto.HOGAR);
        Producto televisor01 = new Producto("TRO834", "Hitachi TV 24 pulgadas", 358675.3, 5, CategoriaProducto.HOGAR);
        Producto arroz01 = new Producto("FSZ023", "Paquete de arroz 1kg", 1300.0, 53, CategoriaProducto.ALIMENTOS);
        Producto estereo01 = new Producto("XER328", "JBL Party Box", 985632.9, 5, CategoriaProducto.ELECTRONICA);
        Producto bermuda01 = new Producto("VBO034", "Bermudas talle 44", 12755.0, 48, CategoriaProducto.ROPA);
        Producto tablet01 = new Producto("IFC832", "Tablet Xiaomi", 365322.5, 3, CategoriaProducto.ELECTRONICA);
    
        
        inventario.agregarProducto(lavarropas01);
        inventario.agregarProducto(celular01);
        inventario.agregarProducto(remera01);
        inventario.agregarProducto(fideos01);
        inventario.agregarProducto(lavarropas02);
        inventario.agregarProducto(televisor01);
        inventario.agregarProducto(arroz01);
        inventario.agregarProducto(estereo01);
        inventario.agregarProducto(bermuda01);
        inventario.agregarProducto(tablet01); 
        }
    
}
