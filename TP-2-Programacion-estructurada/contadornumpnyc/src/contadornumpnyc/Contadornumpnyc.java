package contadornumpnyc;
import java.util.Scanner;
public class Contadornumpnyc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contadorP = 0;
        int contadorN = 0;
        int contadorC = 0;
        int num;        
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número N°" + i + ": ");
            num = input.nextInt();
            
            if (num == 0) {
                contadorC += 1;
            } else if (num > 0) {
                contadorP += 1;
            } else if (num < 0) {
                contadorN += 1;
            }
        }
        System.out.println("Resultados:\nPositivos: " + contadorP + "\nNegativos: " + contadorN + "\nCeros: " + contadorC);
    }
    
}
