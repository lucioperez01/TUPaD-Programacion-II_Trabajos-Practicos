package gestionuniversidad;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombreCompleto;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombreCompleto, String especialidad) {
        setId(id) ;
        setNombreCompleto(nombreCompleto);
        setEspecialidad(especialidad);
        this.cursos = new ArrayList<>();
    }

    public void setId(String id) {
        if(id != null) {
            this.id = id;
        }
    }

    public void setNombreCompleto(String nombreCompleto) {
        if(nombreCompleto != null) {
            this.nombreCompleto = nombreCompleto;
        }
    }

    public void setEspecialidad(String especialidad) {
        if(especialidad != null) {
            this.especialidad = especialidad;
        }
    }
    
    // metodos
    public void agregarCursos(Curso curso) {
        int i = 0;
        if ( !this.cursos.contains(curso) ) {
            this.cursos.add(curso);
        }
    }
    
    public void eliminarCurso(Curso curso) {
        if( this.cursos.contains(curso) ) {
            this.cursos.remove(curso);
        }
    }
    
    public void eliminarTodosLosCursos() {
        this.cursos = null;
    }
    
    public void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void mostrarInfo() {
        System.out.println("Profesor{" + "nombreCompleto=" + nombreCompleto + ", cursos=" + cursos + '}');
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombreCompleto=" + nombreCompleto + ", especialidad=" + especialidad + '}';
    }
}
