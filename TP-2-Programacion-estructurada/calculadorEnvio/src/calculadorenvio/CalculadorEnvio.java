package calculadorenvio;
import java.util.Scanner;
public class CalculadorEnvio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese el peso del producto: ");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese la zona del envio(Nacional o internacional): ");
        String zona = input.nextLine();
        //mostral resultado:
        double precioTotal = calcularTotalCompra(precio, peso, zona);
        System.out.println("El precio final a pagar es de " + precioTotal + "$");
        
    }
    // calcula costo de envio basado en el peso y la zona
    public static double calcularCostoEnvio(double peso, String zona){
        double costoXKg= 0;
        if (zona.toLowerCase().equals("nacional")) {
            costoXKg = 5;
        } else if (zona.toLowerCase().equals("internacional")) {
            costoXKg = 10;
        } else {
            System.out.println("La zona ingresada no es válida. Zona indicada: " + zona);
        }
        return costoXKg * peso;
    }
    //calcula el total
    public static double calcularTotalCompra(double precioProducto, double peso, String zona) {
        double costoEnvio = calcularCostoEnvio(peso, zona); //se utiliza calcularCostoEnvio dentro del metodo
        double precioFinal = precioProducto + costoEnvio;
        return precioFinal;
    }
}
