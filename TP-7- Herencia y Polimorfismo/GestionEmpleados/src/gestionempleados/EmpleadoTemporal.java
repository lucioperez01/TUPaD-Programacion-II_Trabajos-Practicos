package gestionempleados;
public class EmpleadoTemporal extends Empleado {
    private final double SUELDO_MINIMO = 953.2;

    public EmpleadoTemporal(String nombre) {
        super(nombre);
    }

    //polimorfismo
    @Override
    public double calcularSueldo() {
        return SUELDO_MINIMO;
    }
}
