package animalespolimorfismos;
import java.util.ArrayList;
public class AnimalesPolimorfismos {

    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(vaca);
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
