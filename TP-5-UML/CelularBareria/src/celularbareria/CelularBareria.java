package celularbareria;
public class CelularBareria {
    public static void main(String[] args){
        
        Bateria b01 = new Bateria("Power Charge", 3500);
        Celular celular01 = new Celular(153728, "Samsung", "S74", b01);
        Usuario usuario01 = new Usuario("Lucio Perez", 43029505);
        
        //celular tiene una bateria y bateria puede existir sin celular
        System.out.println(celular01);
        
        celular01.setUsuario(usuario01);
        usuario01.setCelular(celular01);
        
        // asociación bidireccional 
        System.out.println(celular01.getUsuario());
        System.out.println(usuario01.getCelular());
    }
}
