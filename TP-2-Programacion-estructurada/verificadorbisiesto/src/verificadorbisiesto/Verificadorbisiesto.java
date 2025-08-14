package verificadorbisiesto;
import java.util.Scanner;
public class Verificadorbisiesto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio_usuario = input.nextInt();
        
        if ((anio_usuario % 4 == 0 && anio_usuario % 100 != 0) || anio_usuario % 400 == 0) {
            System.out.println("El año " + anio_usuario + " es bisiesto!");
        } else {
            System.out.println("El año " + anio_usuario + " NO es bisiesto.");
        }  
    }
}
