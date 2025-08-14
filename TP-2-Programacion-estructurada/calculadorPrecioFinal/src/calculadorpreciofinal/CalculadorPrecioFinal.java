package calculadorpreciofinal;
import java.util.Scanner;
public class CalculadorPrecioFinal { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de impuesto: ");
        double impuesto = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = Double.parseDouble(input.nextLine());
                
        double precio_final = calcularPrecioFinal(impuesto, descuento, precio);
        
        System.out.println("El precio final es: " + precio_final);
    } // cierra main
    // método para calcular precio final
    public static double calcularPrecioFinal(double impuesto, double descuento, double precio_base) {
        double precio_final;
        precio_final = precio_base + (precio_base * (impuesto/100.0)) - (precio_base* (descuento/100));
        return precio_final; 
    }
}
