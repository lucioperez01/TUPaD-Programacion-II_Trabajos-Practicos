package citamedicapaciente;
public class CitaMedicaPaciente {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Pepe", "Osde");
        Profesional profesional = new Profesional("Ricardo", "Cardiologo");
        CitaMedica citaMedica = new CitaMedica("25/10/25", "8:30");
        System.out.println(citaMedica);
        
        //asociacion unidireccional
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        System.out.println(citaMedica);
    }
}
