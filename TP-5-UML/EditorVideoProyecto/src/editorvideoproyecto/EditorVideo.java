package editorvideoproyecto;
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("exportando proyecto...\n" + proyecto + render);
    }
}
