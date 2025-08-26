package gestorgallinasgranja;
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 10)
            this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public int ponerHuevo() {
        return huevosPuestos = huevosPuestos + 1;
    }
    
    public int envejecer() {
        return edad = edad + 1;
    }
    
    public void mostrarEstado() {
        System.out.println("Id Gallina: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos + "\n------------------");
    }
}
