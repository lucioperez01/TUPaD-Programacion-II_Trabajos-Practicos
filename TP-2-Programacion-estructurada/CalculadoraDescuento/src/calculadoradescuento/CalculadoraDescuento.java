package calculadoradescuento;
import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la categoría del producto(A, B o C): ");
        char categoria = input.nextLine().charAt(0);
        int descuento = 0;
        switch (categoria) {
            case 'A':
            case 'a':
                descuento = 10;
                break;
            case 'B':
            case 'b':    
                descuento = 15;
                break;
            case 'C':
            case 'c':
                descuento = 20; 
        }
        double descuento_decimal = descuento/100.0;
        double precio_final = precio * (1 - descuento_decimal);
        
        System.out.println("Precio original: " + precio + "\nDescuento: " + descuento + "%\nPrecio final: " + precio_final);
    } 
}
