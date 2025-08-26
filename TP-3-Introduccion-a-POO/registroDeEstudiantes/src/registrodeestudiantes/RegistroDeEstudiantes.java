package registrodeestudiantes;
public class RegistroDeEstudiantes {

    public static void main(String[] args) {
        // crear nuevo estudiante ↓
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Lucio");    //define el nombre
        estudiante.setApellido("Pérez");  // apellido  
        estudiante.setCurso("TUPaD");     // curso
        estudiante.setCalificacion(1);    // calificacion
        
        //mostrar info
        estudiante.mostrarInfo();
        
        //subir calificacion
        estudiante.subirCalificacion(6);
        
        //mostrar info
        estudiante.mostrarInfo();
        
        //bajar calificacion
        estudiante.bajarCalificacion(1.5);
        
        //mostrar info
        estudiante.mostrarInfo();
    }
}
