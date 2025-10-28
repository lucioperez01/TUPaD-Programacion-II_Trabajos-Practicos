package excepcionesMain;
public class ExcepcionesMain{
    public static void main(String[] args) throws EdadInvalidaExcepcion {
        Operador op = new Operador();
        op.pedirDosNumeros();
        
        op.cadenaANumero();
        
        op.leerArchivo();
        
        op.validadorEdad();
    
        op.leerArchivoConBufferedReader();
    }
}
    
