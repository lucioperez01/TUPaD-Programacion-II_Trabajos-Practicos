package impresorrecursivo;
public class ImpresorRecursivo {
    public static void main(String[] args) {
        double[] precios = {120, 50, 300, 56.5, 38, 145};
        
        impresionRecursiva(precios, 0);
        
        //modificacion ↓
        precios[3] = 524.5;
        
        System.out.println("\nPrecios modificados: ");
        impresionRecursiva(precios, 0);

    }
    //metodo recursivo para recorrer array
    public static void impresionRecursiva(double[] array, int indice){
        if (indice >= array.length) {
            return; // Caso base: fin del array
        }
        System.out.println(array[indice]);
        impresionRecursiva(array, indice + 1);
        
    }
}
