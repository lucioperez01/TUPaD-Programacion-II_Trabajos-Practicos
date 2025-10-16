package geometriaformas;
public abstract class FiguraGeometrica {
    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        if ( nombre != null ){
            this.nombre = nombre;
        }
    }
    
    public abstract double calcularArea();
}
