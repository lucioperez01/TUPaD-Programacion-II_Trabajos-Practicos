package geometriaformas;
public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura, String nombre) {
        super(nombre);
        setBase(base);
        setAltura(altura);
    }

    public final void setBase(double base) {
        this.base = base;
    }

    public final void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
        return base * altura;
    }
}
