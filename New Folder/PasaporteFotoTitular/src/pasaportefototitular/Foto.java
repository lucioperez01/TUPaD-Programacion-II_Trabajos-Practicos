package pasaportefototitular;
public class Foto {
    private String imagen;
    private String formato;

    //constructor
    public Foto(String imagen, String formato) {
        setImagen(imagen);
        setFormato(formato);
    }

    //setters
    public final void setImagen(String imagen) {
        if(imagen != null) {
            this.imagen = imagen;
        }
    }

    public final void setFormato(String formato) {
        if(formato != null) {
            this.formato = formato;  
        }
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
}
