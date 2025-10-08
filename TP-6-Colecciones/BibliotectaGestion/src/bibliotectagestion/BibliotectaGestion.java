package bibliotectagestion;
public class BibliotectaGestion {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("San Martin");    //1. crear biblioteca
        cargarBiblioteca(biblioteca); // 2. y 3: agregar autores, libros y cargar a la biblioteca
        
        System.out.println("Listar todos los libros: ");
        biblioteca.listarLibros();      //4. Listar los libros.
        
        System.out.println("\nBuscar libro por isbn: ");
        biblioteca.buscarLibroPosIsbn("9846274012");        // 5. buscar por isbn
        
        System.out.println("\nFiltrar y mostrar los libros publicados en un año especifico: ");
        biblioteca.filtrarLibrosPorAnio(1605);          // 6. filtrar libros por año
        
        System.out.println("\nEliminar un libro por su ISBN y listar los libros: ");
        biblioteca.eliminarLibro("8473409128");         // 7. eliminar libro: elimino el retrato de dorian grey
        
        System.out.println("\nMostrar la cantidad total de libros en la biblioteca: ");
        biblioteca.listarLibros();                      // 8. Mostrar cantidad total de libros      
        
        System.out.println("\nListar todos los autores disponibles en la bibliioteca: ");
        biblioteca.mostrarAutoresDisponibles();         // 9. Listar todos los autores
    }
    
    public static void cargarBiblioteca(Biblioteca biblioteca) {
        Autor cervantes = new Autor("CVB185", "Miguel de Cervantes", "español");
        Autor borges = new Autor("JDK382", "Jorge Luis Borges", "argentino");
        Autor wilde = new Autor("QWT864", "Oscar Wilde", "irlandes");
        
        biblioteca.agregarLibro("7562086973", "La biblioteca de Babel", 1941, borges);
        biblioteca.agregarLibro("6453820871", "El fantasma de Canterville", 1887, wilde);
        biblioteca.agregarLibro("9846274012", "Don Quijote de La Mancha", 1605, cervantes);
        biblioteca.agregarLibro("7483958123","El Aleph" , 1945, borges);
        biblioteca.agregarLibro("8473409128", "El retrato de Dorian Grey", 1890, wilde);
        biblioteca.agregarLibro("7461840275", "El principe Feliz", 1888, wilde);
    }
}
