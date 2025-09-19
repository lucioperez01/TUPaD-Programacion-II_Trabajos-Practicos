package vehiculomotor;
public class VehiculoMotor {
public static void main(String[] args) {
        Motor motor = new Motor("V8", 7483628);
        //agregacion
        Vehiculo vehiculo = new Vehiculo("ABK156", "Gol", motor);
        Conductor conductor = new Conductor("Lucio", 43029573);
        System.out.println(vehiculo);
        
        //asociacion bidireccional 
        vehiculo.setConductor(conductor);
        conductor.setVehiculo(vehiculo);
        
        System.out.println(conductor.getVehiculo());
        System.out.println(vehiculo.getConductor());
    }
}
