package claseempleado;
public class ClaseEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(14827474, "Lucio", "Desarrollador", 1200);
        System.out.println(empleado1);
        
        System.out.println("Número de empleados: " + Empleado.getTotalEmpleados());
        
        Empleado empleado2 = new Empleado("Mariana", "Cientifica de datos");
        System.out.println(empleado2);
        
        System.out.println("Número de empleados: " + Empleado.getTotalEmpleados());
        empleado2.actualizarSalario(60);
        System.out.println(empleado2);
        
        empleado1.actualizarSalario(512.50);
        System.out.println(empleado1);
        
        System.out.println("Número de empleados: " + Empleado.getTotalEmpleados());
        
    }
    
}
