package calculadorajava;

import java.util.Scanner;

public class Calculadorajava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = input.nextInt();
                
        System.out.println("Ingrese un número: ");
        int num2 = input.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = (double) num1 / num2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
    
}





