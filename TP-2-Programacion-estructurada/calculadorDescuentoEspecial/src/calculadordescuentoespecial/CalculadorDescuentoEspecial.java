package calculadordescuentoespecial;
import java.util.Scanner;
public class CalculadorDescuentoEspecial {
    //variable global
    final static double DESCUENTO = 0.10;
    //main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        double precioFinal = calcularDescuentoEspecial(precio);
        //imprimir en pantalla
        System.out.println("El precio final con descuento es: " + precioFinal + "$");
    }
    //calculos de descuentos
    public static double calcularDescuentoEspecial(double precio) {
        double precioFinal = precio * (1 - DESCUENTO);
        double descuentoAplicado = DESCUENTO * precio;
        System.out.println("El descuento especial aplicado es de: " + descuentoAplicado + "$");
        return precioFinal;
    }
}
