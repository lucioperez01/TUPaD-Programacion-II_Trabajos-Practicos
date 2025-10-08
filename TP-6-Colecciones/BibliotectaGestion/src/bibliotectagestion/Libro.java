package bibliotectagestion;
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        setIsbn(isbn);
        setTitulo(titulo);
        setAnioPublicacion(anioPublicacion);
        setAutor(autor);
    }

    public final void setIsbn(String isbn) {
        if(isbn != null){
            this.isbn = isbn;
        }
    }

    public final void setTitulo(String titulo) {
        if(titulo != null) {
            this.titulo = titulo;
        }
    }

    public final void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public final void setAutor(Autor autor) {
        if ( autor != null){
            this.autor = autor;
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + ", autor=" + autor + '}';
    }
}
