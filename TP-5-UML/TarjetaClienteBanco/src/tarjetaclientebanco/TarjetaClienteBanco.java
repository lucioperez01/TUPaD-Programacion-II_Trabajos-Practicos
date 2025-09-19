package tarjetaclientebanco;
public class TarjetaClienteBanco {
    public static void main(String[] args) {
        //Agregacion ↓
        Banco banco = new Banco("Banelco", 2048592947);
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(411105256, "01/30", banco);
        Cliente cliente = new Cliente("Lucio Perez", 43029505);
        
        // asociacion bidireccional ↓
        tarjetaDeCredito.setCliente(cliente);
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
        
        System.out.println(tarjetaDeCredito.getCliente());
        System.out.println(cliente.getTarjetaDeCredito());
    } 
}
