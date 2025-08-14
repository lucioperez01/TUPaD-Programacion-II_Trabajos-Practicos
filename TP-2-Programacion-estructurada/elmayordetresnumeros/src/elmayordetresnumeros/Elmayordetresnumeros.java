package elmayordetresnumeros;
import java.util.Scanner;

public class Elmayordetresnumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mayor = 0;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un número: ");
            int num = input.nextInt();
            
            if (num > mayor){
                mayor = num;
            }    
        }
        System.out.println("El mayor número ingresado fue: " + mayor);
    }  
}
