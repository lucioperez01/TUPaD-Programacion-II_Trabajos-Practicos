package geometriaformas;
import java.util.ArrayList;
public class GeometriaFormas {
    
    public static void main(String[] args) {
        Circulo circulo = new Circulo("rojo", 5.6, "circunferencia");
        Rectangulo rectangulo = new Rectangulo(3, 4.3, "Cuadrado");
        
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(rectangulo);
        
        for (FiguraGeometrica figura : figuras) {
            double resultado = figura.calcularArea();
            System.out.println(resultado);
        }
    }
}
