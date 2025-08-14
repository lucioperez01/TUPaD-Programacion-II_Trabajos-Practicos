package actualizadordestock;
import java.util.Scanner;
public class ActualizadorDeStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingresa la cantidad vendida: ");
        int cantVendida = Integer.parseInt(input.nextLine());
        
        System.out.print("Ingrese la cantidad recibida del producto: ");
        int cantRecibida = Integer.parseInt(input.nextLine());
        //llama al metodo que calcula el stock
        int stockActualizado = actualizarStock(stockActual, cantVendida, cantRecibida);
        // imprime resultado
        System.out.println("Stock actualizado: " + stockActualizado);
    }
    // calcula el stock actualizado
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int stockActualizado = stockActual - cantidadVendida + cantidadRecibida;
        return stockActualizado;
    }
}
