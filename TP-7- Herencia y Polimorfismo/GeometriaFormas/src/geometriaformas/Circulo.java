package geometriaformas;
public class Circulo extends FiguraGeometrica {
    private String color;
    private double radio;

    public Circulo(String color, double radio, String nombre) {
        super(nombre);
        setColor(color);
        setRadio(radio);
    }

    public final void setColor(String color) {
        if( color != null ) {
            this.color = color;
        }
    }

    public final void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI * radio;
    }
}
