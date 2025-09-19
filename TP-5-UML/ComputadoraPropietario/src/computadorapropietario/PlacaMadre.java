package computadorapropietario;
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        setModelo(modelo);
        setChipset(chipset);
    }

    private final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private final void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" + "modelo=" + modelo + ", chipset=" + chipset + '}';
    }
}
