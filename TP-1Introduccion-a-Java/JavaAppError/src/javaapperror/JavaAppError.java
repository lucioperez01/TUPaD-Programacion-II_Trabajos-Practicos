package javaapperror;
import java.util.Scanner;
public class JavaAppError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
	System.out.print("Ingresa tu nombre: "); 
	String nombre = scanner.nextLine();     // SOLUCIONADO
        System.out.println("Hola, " + nombre);     	
    }
}

 


