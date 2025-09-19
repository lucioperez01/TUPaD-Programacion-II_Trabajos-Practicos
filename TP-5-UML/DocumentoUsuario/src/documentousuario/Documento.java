package documentousuario;
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;

    //constructor 
    public Documento(String titulo, String contenido, Usuario usuario) {
        setTitulo(titulo);
        setContenido(contenido);
        
        //composición 
        String hoy = "23/09/25";
        FirmaDigital firmaDigital = new FirmaDigital("0xab72cd84xz2j32", hoy, usuario);
        setFirmaDigital(firmaDigital);
    }
    
    //setters
    private final void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }
    }

    private final void setContenido(String contenido) {
        if(contenido != null){
            this.contenido = contenido;
        }
    }

    private final void setFirmaDigital(FirmaDigital firmaDigital) {
        if(firmaDigital != null){
            this.firmaDigital = firmaDigital;
        }
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + '}';
    }
}
