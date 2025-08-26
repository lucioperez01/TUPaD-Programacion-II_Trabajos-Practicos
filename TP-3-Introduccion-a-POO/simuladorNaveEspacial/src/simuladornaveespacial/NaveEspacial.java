package simuladornaveespacial;
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private boolean despego = false;
    private double distancia;
    
    public void setNombre( String nombre) {
        this.nombre = nombre;
    }
    
    public void despegar() {
        if (despego == false && combustible != 0) {
            System.out.println("Despegando nave...");
            despego = true;
        }
        else if (combustible == 0) {
            System.out.println("Necesitas combustible para despegar!");
            despego = false;
        }
        else {
            System.out.println("La nave ya despego!");
        }
    }
    
    public double recargarCombustible(double cantidad) {
        //si esta dentro del limite se carga combustible
        if (cantidad + combustible <= 200 && cantidad > 0 ){
            combustible += cantidad;
            System.out.println("Carga de combustible completada con exito!\nCombustible actual: " + combustible);
        }
        else if (cantidad + combustible > 200.0) {        
            System.out.println("Estas intentando sobrepasar el limite del tanque de combustible (200). \nEl combustible actual es: " + combustible);
        }
        else {
            System.out.println("Error: valor invalido.");
        }
        return combustible;
    }
    
    public void avanzar(int distancia) {
        // simulacion: la nave hace 100km por unidad de combustible
        //regla de tres: con un litro hago 100, hago combustible*100 y me da la distancia maxima:
        double distanciaMaxima = combustible*100.0;
        
        //validaciones
        if (distancia > distanciaMaxima) {
            System.out.println("Es imposible recorrer esa distancia con el combustible actual: " + combustible);    
        }
        else if (distancia <= distanciaMaxima && distancia > 0) {
            this.distancia += distancia; 
            
            //calculo el combustible gastado por esa distancia ↓
            double combustibleGastado = distancia / 100.0;
            combustible -= combustibleGastado;
            System.out.println("Distancia recorrida: " + distancia + "km en este viaje." + "\nCombustible gastado: " + combustibleGastado + "\nCombustible actual: " + combustible);
        }
        else {
            System.out.println("Error: Valor ingresado no correspondiente.");
        }
        
    }
    
    public void mostrarEstado() {
        System.out.println("Combustible : " + combustible + "\nDistancia recorrida: " + distancia +"km en total");
    }
}


