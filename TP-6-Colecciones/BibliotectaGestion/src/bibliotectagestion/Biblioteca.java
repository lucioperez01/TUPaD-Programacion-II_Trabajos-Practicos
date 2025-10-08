package bibliotectagestion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        if(nombre != null) {
            this.nombre = nombre;
        }
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        if (isbn != null && titulo != null && autor != null){
            Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
            libros.add(libro);
        }
    }
    
    public void listarLibros(){
        for (Libro libro : libros) {
            System.out.println(libros);
        }
    }
    
    public Libro buscarLibroPosIsbn(String isbn){
        int i =0;
        Libro libro = null;
        
        while( i < libros.size() ) {
            if( isbn.equals(libros.get(i).getIsbn()) ) {
                libro = libros.get(i);
                System.out.println(libro);
            }
            i++;
        }
        return libro;
    }
    
    public void eliminarLibro(String isbn){
        int i =0;
        Libro libro = null;
        while(i < libros.size() && isbn.equals(libros.get(i).getIsbn())) {
            if(isbn.equals(libros.get(i).getIsbn())){
                libro = libros.get(i);
                libros.remove(libro);
                System.out.println("Se eliminó: " + libro + " de la biblioteca");
            }
        }
        i++;
    }
    
    
    public void obtenerCantidadLibros(){
        int i = 0; 
        for (Libro libro : libros) {
            i++;
        }
        System.out.println(i);
    }
    
    public void filtrarLibrosPorAnio(int anio){
        List<Libro> librosFiltrados = new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getAnioPublicacion() == anio){
                librosFiltrados.add(libro);
                System.out.println(libro);
            }
        }
    }
    
    public HashSet<Autor> mostrarAutoresDisponibles(){
        //System.out.println(libros);
        HashSet<Autor> autoresConjunto = new HashSet<>();
        for(Libro libro : libros) {
            autoresConjunto.add(libro.getAutor());
        }
        for (Autor autor : autoresConjunto) {
            System.out.println("    - " + autor.getNombre());
        }
        return autoresConjunto;
    }
}
