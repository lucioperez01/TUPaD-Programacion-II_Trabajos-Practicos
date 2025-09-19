package libroautoreditorial;
public class Libro {
    private String titulo;
    private int isbn;
    private Editorial editorial;
    private Autor autor;
    
    //constructor
    public Libro(String titulo, int isbn, Editorial editorial) {
        setTitulo(titulo);
        setIsbn(isbn);
        setEditorial(editorial);
    }
    
    //getters & setters
    public String getLibro() {
        return titulo;
    }

    private final void setTitulo(String titulo) {
        if(titulo != null) {
            this.titulo = titulo;  
        }
    }

    public int getIsbn() {
        return isbn;
    }

    private final void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    private final void setEditorial(Editorial editorial) {
        if (editorial != null) {
            this.editorial = editorial;
        }
    }
    
    public void setAutor(Autor autor){
        if(autor != null){
            this.autor = autor;
        }
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", isbn=" + isbn + ", editorial=" + editorial + ", autor=" + autor + '}';
    }
}
