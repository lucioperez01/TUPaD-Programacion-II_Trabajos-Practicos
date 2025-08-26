package registrodemascotas;
public class RegistroDeMascotas {
    public static void main(String[] args) {
        Mascota leon = new Mascota();
        leon.setNombre("León");
        leon.setEspecie("Gato");
        leon.cumplirAnios(1);
        
        //mostrar info
        leon.mostrarInfo();
        
        //cumplir años
        leon.cumplirAnios(5);
        
        //mostrar info
        leon.mostrarInfo();
        
        //cumplir años
       leon.cumplirAnios(8);
       
       //mostrar info
       leon.mostrarInfo();          
    }
}
