package simuladornaveespacial;
public class SimuladorNaveEspacial {
    public static void main(String[] args) {
        NaveEspacial endurance = new NaveEspacial();
        System.out.println("->Estado inicial()");
        endurance.mostrarEstado();
        // despegar
        System.out.println("\n->Despegar()");
        endurance.despegar();
        //avanzar
        System.out.println("\n->Avanzar()");
        endurance.avanzar(1);
        
        //cargar combustible
        System.out.println("\n->Cargar combustible(50)");
        endurance.recargarCombustible(50);
        
        //recargar combustible mal
        System.out.println("\n->Cargar combustible(196.1)");
        endurance.recargarCombustible(196.1);
        
        // despegar de nuevo
        System.out.println("\n->Despegar()");
        endurance.despegar();
        
        // avanzar mal
        System.out.println("\n->avanzar(-50)");
        endurance.avanzar(-50);
        
        //avanzar mas de lo permitido
        System.out.println("\n->avanzar(5001)");
        endurance.avanzar(5001);
        
        //avanzar
        System.out.println("\n->avanzar(50)");
        endurance.avanzar(50);
        
        //avanzar bastante
        System.out.println("\n->avanzar(4500)");
        endurance.avanzar(4550);
        
        //mostrar estado
        System.out.println("\n->Estado actual()");
        endurance.mostrarEstado();
        
        
        //recargar combustible mal
        System.out.println("\n->Cargar combustible(-1)");
        endurance.recargarCombustible(-1);
        
        //tanque lleno
        System.out.println("\n->Cargar combustible(196)");
        endurance.recargarCombustible(196);
        
        // avanzar 
        System.out.println("\n->avanzar(20000)");
        endurance.avanzar(20000);
        
        //mostrar estado final:
        System.out.println("\n->Estado final()");
        endurance.mostrarEstado();
    }
    
}
