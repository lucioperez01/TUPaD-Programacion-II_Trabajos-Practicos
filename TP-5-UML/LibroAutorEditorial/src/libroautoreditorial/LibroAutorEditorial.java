package libroautoreditorial;
public class LibroAutorEditorial {
    public static void main(String[] args) {
        //creacion de objetos
        Editorial planeta = new Editorial("Planeta", "San Martin 123");
        Autor antoine = new Autor("Antoine de Saint-Exupery", "francés");
        
        //agregacion
        Libro elPrincipito = new Libro("El Principito", 12348572, planeta);
        
        //asociacion unidireccional
        elPrincipito.setAutor(antoine);
        
        //mostrar por consola
        System.out.println(planeta);
        System.out.println(elPrincipito);
        System.out.println(elPrincipito.getAutor());
    }
}
