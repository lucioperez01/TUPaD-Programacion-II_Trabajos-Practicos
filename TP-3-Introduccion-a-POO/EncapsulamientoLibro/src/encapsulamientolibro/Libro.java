package encapsulamientolibro;
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    // getters -------------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion >= 1000 && añoPublicacion <= 2025) {
            this.añoPublicacion = añoPublicacion;
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nAño de publicacion: " + añoPublicacion + "\n----------------");
    }
}
