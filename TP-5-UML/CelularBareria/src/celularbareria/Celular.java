package celularbareria;
public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(int imei, String marca, String modelo, Bateria bateria ) {
        setImei(imei);
        setMarca(marca);
        setModelo(modelo);
        setBateria(bateria);
    }

    public int getImei() {
        return imei;
    }

    private final void setImei(int imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    private final void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    private final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    private final void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    // asociacion
    public void setUsuario(Usuario usuario){
        if(usuario != null){
            this.usuario= usuario;
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + '}';
    }
}
