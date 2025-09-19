package generadorqrusuario;
public class GeneradorQRUsuario {
public static void main(String[] args) {
        GeneradorQR generadorQR = new GeneradorQR();
        CodigoQR codigoQR = new CodigoQR(0.25);
        Usuario usuario = new Usuario("Juan Lopez", "juanlopez@hotmail.com");
        
        //asociacion unidireccional
        codigoQR.setUsuario(usuario);
        
        System.out.println(codigoQR);
        
        //dependencia de creacion
        generadorQR.generar("qr");
    }
}
