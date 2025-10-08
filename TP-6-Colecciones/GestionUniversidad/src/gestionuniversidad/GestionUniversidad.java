package gestionuniversidad;
public class GestionUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Tecnologica Nacional");
        
        Profesor profe1 = new Profesor("839490", "Don Pepito Suarez", "Desarrollo de Software");
        Profesor profe2 = new Profesor("749865", "Luis Alberto", "Finanzas");
        Profesor profe3 = new Profesor("342509", "Roberto Diaz", "Contabilidad");
        Profesor profe4 = new Profesor("637546", "Maria Rodriguez", "Arquitectura de Software");
        
        Curso curso1 = new Curso("PEK785", "Programacion I");
        Curso curso5 = new Curso("XYK562", "Fundamentos de C");
        Curso curso2 = new Curso("SVK547", "Curso de Excel");
        Curso curso3 = new Curso("NMC302", "Derecho Fiscal");
        Curso curso4 = new Curso("KYE614", "Modelo vista-controlador");
        Curso curso6 = new Curso("QUT351", "Administracion");
        Curso curso7 = new Curso("LJK955", "Economia I");
        Curso curso8 = new Curso("YCK028", "Arquitectura de micro-servicios");
        
        uni.agregarCurso(curso1);
        uni.agregarCurso(curso2);
        uni.agregarCurso(curso3);
        uni.agregarCurso(curso4);
        uni.agregarCurso(curso5);
        uni.agregarCurso(curso6);
        uni.agregarCurso(curso7);
        uni.agregarCurso(curso8);
        
        uni.agregarProfesor(profe1);
        uni.agregarProfesor(profe2);
        uni.agregarProfesor(profe3);
        uni.agregarProfesor(profe4);
        
        uni.asignarProfesorACurso("PEK785", "839490");
        uni.asignarProfesorACurso("XYK562", "839490");
        
        uni.asignarProfesorACurso("SVK547", "749865");
        uni.asignarProfesorACurso("LJK955", "749865");
        
        uni.asignarProfesorACurso("NMC302", "342509");
        uni.asignarProfesorACurso("QUT351", "342509");
        
        uni.asignarProfesorACurso("KYE614", "637546");
        uni.asignarProfesorACurso("YCK028", "637546");
        
        System.out.println("\nListar cursos: ");
        uni.listarCursos();
        System.out.println("\nListar profesores: ");
        uni.listarProfesores();
        
        System.out.println("\nCambiar profe desde curso: ");
        // curso de excel 
        System.out.println(curso2);       //profesor: "Luis Alberto"
        
        curso2.setProfesor(profe3);         // profesor: "Roberto Dias"
        
        System.out.println(curso2);
        System.out.println("\nListar cursos de profe3");
        profe3.listarCursos();        //ahora da 3 cursos, entre ellos el de excel
        
        System.out.println("\nEliminar curso: ");
        uni.eliminarCurso("NMC302");        // curso de derecho fiscal
        
        System.out.println("\nListar los cursos de este profesor (el mismo de antes): ");
        profe3.listarCursos(); 
        
        System.out.println("\nEliminar profesor: ");
        uni.eliminarProfesor("839490");
        
        System.out.println("\nMostrar reporte final: ");
        uni.mostrarReporte();
    }
}
