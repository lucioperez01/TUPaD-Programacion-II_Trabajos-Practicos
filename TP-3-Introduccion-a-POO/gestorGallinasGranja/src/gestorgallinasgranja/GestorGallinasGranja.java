package gestorgallinasgranja;
public class GestorGallinasGranja {
    public static void main(String[] args) {
        Gallina gallina01 = new Gallina();
        gallina01.setIdGallina(001);
        gallina01.mostrarEstado();
        
        // simulacion:
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        gallina01.envejecer();
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        gallina01.envejecer();
        
        //mostrar estado: 
        gallina01.mostrarEstado();
        
        // simulacion:
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        gallina01.envejecer();
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        gallina01.envejecer();
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        gallina01.envejecer();
        gallina01.envejecer();
        gallina01.ponerHuevo();
        gallina01.ponerHuevo();
        
        //mostrar estado: 
        gallina01.mostrarEstado();
    }
}
