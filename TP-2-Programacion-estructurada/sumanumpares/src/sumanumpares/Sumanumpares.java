package sumanumpares;
import java.util.Scanner;
public class Sumanumpares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int suma = 0;
        do {
            System.out.print("Ingrese un número: ");
            num = input.nextInt();
            
            if (num % 2 == 0){
                suma = suma + num;
            }
        } while (num != 0);
        System.out.println("La suma de los números pares es: " + suma);
    }
}
