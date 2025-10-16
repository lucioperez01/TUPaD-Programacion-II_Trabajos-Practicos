package gestionempleados;
import java.util.ArrayList;

public class GestionEmpleados {
    public static void main(String[] args) {
        EmpleadoPlanta empleadoP01 = new EmpleadoPlanta("Julio López", 9);
        EmpleadoPlanta empleadoP02 = new EmpleadoPlanta("María Martinez", 25);
        EmpleadoPlanta empleadoP03 = new EmpleadoPlanta("Sofia Gimenez", 12);
        EmpleadoTemporal empleadoT01 = new EmpleadoTemporal("Mario Sanchez");
        EmpleadoTemporal empleadoT02 = new EmpleadoTemporal("Agustin Ramirez");
        EmpleadoTemporal empleadoT03 = new EmpleadoTemporal("Elvira Gomez");
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empleadoP01);
        empleados.add(empleadoP02);
        empleados.add(empleadoP03);
        empleados.add(empleadoT01);
        empleados.add(empleadoT02);
        empleados.add(empleadoT03);
        
        for (Empleado empleado : empleados) {
            String texto = ( empleado instanceof EmpleadoPlanta ) ? "de planta" : "temporal";
            System.out.println("El sueldo del empleado " + texto + " " + empleado.getNombre() + " es: " + empleado.calcularSueldo());
        }
    }
}
