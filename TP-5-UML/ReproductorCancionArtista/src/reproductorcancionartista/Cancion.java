package reproductorcancionartista;
public class Cancion {
    private String titulo;
    private Artista artista;

    //constructor
    public Cancion(String titulo) {
        setTitulo(titulo);
    }

    private final void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;   
        }
    }
    
    //asociacion unidireccional
    public void setArtista(Artista artista) {
        if (artista != null) {
            this.artista = artista;
        }
    }

    public Artista getArtista() {
        return artista;
    }
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
}
