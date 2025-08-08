package javatypeconverter;
import java.util.Scanner;
public class JavaTypeConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        double num1 = input.nextInt();
        
        System.out.println("Ingrese otro número: ");
        double num2 = input.nextInt();
        
        double division = num1 / num2;
        
        System.out.println(division);
    }    
}
