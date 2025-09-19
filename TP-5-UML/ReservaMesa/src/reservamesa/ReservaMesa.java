package reservamesa;
public class ReservaMesa {
public static void main(String[] args) { 
        Mesa mesa01 = new Mesa(5, 2);
        //Agregacion
        Reserva reserva01 = new Reserva("21/09/25", "21:30", mesa01);
        Cliente cliente = new Cliente("Lucio Perez", 343548486); 
        
        System.out.println(reserva01);
        
        //asociacion unidireccional
        reserva01.setCliente(cliente);
        
        System.out.println(reserva01); 
    }
}
