package claseempleado;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    
    //constructor 3 parametros
    public Empleado(int id, String nombre, String puesto, double salario) {
        setID(id);
        setNombre(nombre);
        setPuesto(puesto);
        setSalario(salario);
        totalEmpleados++;
    }
    
    //constructor 2 parametros
    public Empleado(String nombre, String puesto){
        setNombre(nombre);
        setPuesto(puesto);
        this.id = generarID();
        this.salario = 1000;
        totalEmpleados++;
    }
    
    public void setID(int id){
            this.id = id;
    }
    
    public int generarID(){
        return 146238749;
    }
    
    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }
    
    public void setPuesto(String puesto) {
        if(puesto != null) {
            this.puesto = puesto;
        }
    }
    
    public void setSalario(double salario){
            this.salario = salario;
    }
    
    // getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    
    public void actualizarSalario(int porcentaje) {
        this.salario = this.salario * ((porcentaje / 100.0) + 1);
        System.out.println("Salario actualizado!");
    }
    
    public void actualizarSalario(double cantidad){
           this.salario += cantidad; 
           System.out.println("Salario actualizado!");
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
}
