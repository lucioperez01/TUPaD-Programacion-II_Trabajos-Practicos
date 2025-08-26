package encapsulamientolibro;
public class EncapsulamientoLibro {
    public static void main(String[] args) {
        Libro cleanCode = new Libro();
        cleanCode.setTitulo("Clean Code");
        cleanCode.setAutor("Robert C. Martin");
        cleanCode.setAñoPublicacion(2003);
        
        //mostrar info
        cleanCode.mostrarInfo();
        
        //intento de modificacion:
        cleanCode.setAñoPublicacion(2026);
        
        //mostrar info
        cleanCode.mostrarInfo();
        
        //intento de modificacion:
        cleanCode.setAñoPublicacion(2008);
        
        //mostrar info final
        cleanCode.mostrarInfo();
    }
}
