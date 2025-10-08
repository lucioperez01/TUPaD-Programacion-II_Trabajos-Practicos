package gestionuniversidad;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    

    public Universidad(String nombre) {
        setNombre(nombre);
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        if( nombre != null ) {
            this.nombre = nombre;
        }
    }
    
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null ) {
            this.profesores.add(profesor);
        }
    }
    
    public void agregarCurso(Curso curso) {
        if( curso != null ) {
            this.cursos.add(curso);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Profesor profesorEncontrado = null;
        Curso cursoEncontrado = null;
        
        if ( codigoCurso != null && idProfesor != null ) {
            profesorEncontrado = buscarProfesorPorId(idProfesor);
            
            cursoEncontrado = buscarCursoPorId(codigoCurso);
            
            cursoEncontrado.setProfesor(profesorEncontrado);        //asignamos el profesor al curso
            cursoEncontrado.setProfesor(profesorEncontrado);        // agregamos el curso al profe
            System.out.println("El profesor: " + profesorEncontrado + " ha sido asignado a: " + cursoEncontrado);
        }
    }
    
    public void listarProfesores(){        
        for (Profesor profesor : profesores) {
            System.out.println(profesor);
        }
    }
    
    public void listarCursos(){        
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }
    
    public Profesor buscarProfesorPorId(String id){
        Profesor profesorEncontrado = null;
        for (Profesor profesor : profesores) {        // buscamos el profesor
                if (id.equals(profesor.getId())) {
                    profesorEncontrado = profesor;        // lo asignamos a una variable
                }
            } 
        return profesorEncontrado;
    }
    
    public Curso buscarCursoPorId(String id){
        Curso cursoEncontrado = null;
        for (Curso curso : this.cursos) {                // buscamos el curso
                if (id.equals(curso.getCodigo())) {
                    cursoEncontrado = curso;        // lo asignamos a una variable
                    return cursoEncontrado;
                }
            } 
        return cursoEncontrado;
    }
    
    public void eliminarCurso(String codigo){
        if(codigo != null){
            Curso cursoEncontrado = buscarCursoPorId(codigo);           // Buscamos el curso por el codigo
            Profesor profesorCurso = cursoEncontrado.getProfesor();     // obtenemos el profe de ese curso
            profesorCurso.eliminarCurso(cursoEncontrado);               // eliminamos el curso desde el profe
            this.cursos.remove(cursoEncontrado);                        // eliminamos el curso desde this (universidad)
            System.out.println("El curso: " + cursoEncontrado + " ha sido eliminado");
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesorEncontrado = buscarProfesorPorId(id);          
        profesorEncontrado.eliminarTodosLosCursos();                // deja la lista de cursos del profe en null
        System.out.println("Todos los cursos del profesor" + profesorEncontrado + "fueron eliminados: " + profesorEncontrado.getCursos());
    }
    
    public void mostrarReporte(){
        ArrayList<Integer> cantidadesCurso = new ArrayList<>();
        for (Profesor profesor : profesores) {
            if (profesor != null && profesor.getCursos() != null) {
                List<Curso> curso = profesor.getCursos();           
                cantidadesCurso.add(curso.size());          // guardamos los cursos de cada profe
            }
        }
        int acum = 0;
        for (Integer cantidad : cantidadesCurso) {          //recorremos la lista de cantidad de cursos por profe
            acum += cantidad;               // acumulamos
        }
        double promedio = (double) acum / cantidadesCurso.size();   
        
        System.out.println("Cantidad de cursos: "+ this.cursos.size() + "\nPromedio de cursos por profesor: " + promedio);
    }
}

