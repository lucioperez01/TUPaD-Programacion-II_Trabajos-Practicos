package clasificadoredad;
import java.util.Scanner;
public class Clasificadoredad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = input.nextInt();
        String resultado;
        if (edad > 0 && edad < 12) {
            resultado = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            resultado = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            resultado = "Adulto";
        } else if (edad >= 60) {
            resultado = "Adulto mayor";
        } else {
            resultado = "Edad inválida";
        }

        System.out.println("Eres un " + resultado);
    }
}
