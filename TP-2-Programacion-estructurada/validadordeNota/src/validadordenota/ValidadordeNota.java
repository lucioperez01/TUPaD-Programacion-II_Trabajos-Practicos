package validadordenota;
import java.util.Scanner;
public class ValidadordeNota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        
        do {
            System.out.print("Ingrese una nota del 0 al 10: ");
            num = input.nextDouble();
            if (num <0 || num > 10){
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } else {
                System.out.println("Nota guardada correctamente!");
            }
        } while (num < 0 || num > 10);
    }
}
