package editorvideoproyecto;
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        setFormato(formato);
    }
    
    private final void setFormato(String formato) {
        this.formato = formato;
    }

    //asociación unidireccional 
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", proyecto=" + proyecto + '}';
    }
}
