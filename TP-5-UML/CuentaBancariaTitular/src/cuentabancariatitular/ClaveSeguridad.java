package cuentabancariatitular;
public class ClaveSeguridad {
    private int codigo;
    private String ultimaModificacion;

    //constructor
    public ClaveSeguridad(int codigo, String ultimaModificacion) {
        setCodigo(codigo);
        setUltimaModificacion(ultimaModificacion);
    }

    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        if(ultimaModificacion != null) {
            this.ultimaModificacion = ultimaModificacion;            
        }
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
}
