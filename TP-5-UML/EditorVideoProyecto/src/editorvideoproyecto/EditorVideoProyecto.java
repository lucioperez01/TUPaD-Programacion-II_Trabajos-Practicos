package editorvideoproyecto;
public class EditorVideoProyecto {
    public static void main(String[] args) {
        Proyecto proyecto= new Proyecto("Video presentacion TPI Programacion II", 10);
        EditorVideo editorVideo = new EditorVideo();
        
        editorVideo.exportar(".mp4", proyecto);
    }
}
