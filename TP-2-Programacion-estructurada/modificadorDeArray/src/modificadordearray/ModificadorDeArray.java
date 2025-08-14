package modificadordearray;
public class ModificadorDeArray {
    public static void main(String[] args) {
        double[] precios = {120, 50, 300, 56.5, 38, 145};
        System.out.println("Precios originales: ");      
        impresorDeArray(precios); //llamada a metodo que imprime array
        
        //modificacion ↓
        precios[3] = 524.5;
        
        System.out.println("\nPrecios modificados: ");
        impresorDeArray(precios);
    }
    // metodo que imprime array
    public static void impresorDeArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("$" + array[i]);
        }
    }
}
