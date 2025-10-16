package gestionempleados;
public class EmpleadoPlanta extends Empleado {
    private String nombre;
    private int aniosAntiguedad;
    private final double SUELDO_MINIMO = 1325.8;

    public EmpleadoPlanta(String nombre, int aniosAntiguedad) {
        super(nombre);
        setAniosAntiguedad(aniosAntiguedad);
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
    
    //polimorfismo
    @Override
    public double calcularSueldo() {
        double sueldo;
        if (this.aniosAntiguedad >= 10 && this.aniosAntiguedad <20){
            return SUELDO_MINIMO + (SUELDO_MINIMO * 1.3);
        } else if (this.aniosAntiguedad >= 20){
            return SUELDO_MINIMO + (SUELDO_MINIMO * 1.5);
        } else {
            return SUELDO_MINIMO;
        }
    }
}
