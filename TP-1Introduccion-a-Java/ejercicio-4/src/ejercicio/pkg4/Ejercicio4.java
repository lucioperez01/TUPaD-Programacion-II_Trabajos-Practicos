package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
                
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        String edad = input.nextLine();
        
        System.out.println("Hola " + nombre + "!. \nTu edad es: " + edad);
    }
    
}