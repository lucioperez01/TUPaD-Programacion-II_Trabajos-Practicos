package computadorapropietario;
public class ComputadoraPropietario {
public static void main(String[] args) {
        //composicion: Computadora crea un objeto PlacaMadre ↓
        Computadora computadora = new Computadora("Asus", 1285963586);
        Propietario propietario = new Propietario("Lucio Pérez", 43029506);
        
        System.out.println(computadora);
        
        //asociacion bidireccional
        computadora.setPropietario(propietario);
        propietario.setComputadora(computadora);
        
        System.out.println(propietario.getComputadora());
        System.out.println(computadora.getPropietario());
    }
    
}
