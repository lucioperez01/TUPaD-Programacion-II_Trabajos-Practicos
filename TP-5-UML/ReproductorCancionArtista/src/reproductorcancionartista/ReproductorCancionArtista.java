package reproductorcancionartista;
public class ReproductorCancionArtista {
public static void main(String[] args) {
        Artista artista = new Artista("Michael Jackson", "Masculino");
        Cancion cancion = new Cancion("Beat It");
        Reproductor reproductor = new Reproductor();
        
        //redaccion unidireccional
        cancion.setArtista(artista);
        
        //dependencia de uso, reproductor no tiene atributo Cancion
        reproductor.reproducir(cancion);
    }
}
