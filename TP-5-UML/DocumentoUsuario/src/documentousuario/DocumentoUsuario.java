package documentousuario;
public class DocumentoUsuario {
public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan Perez", "juanp@hotmail.com");
        
        //Composición y agregación 
        Documento documento = new Documento("Contrato de Alquiler", "El precio a pagar por el alquiler es de...",  usuario);
    
        System.out.println(documento);
    }  
}
