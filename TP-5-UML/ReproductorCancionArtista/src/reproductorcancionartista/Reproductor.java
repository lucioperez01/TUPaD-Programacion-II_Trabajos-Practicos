package reproductorcancionartista;
public class Reproductor {
    
    public void reproducir(Cancion cancion) {
        if(cancion != null) {
            System.out.println("Reproduciendo cancion...\n" + cancion);
        }
    }
}
