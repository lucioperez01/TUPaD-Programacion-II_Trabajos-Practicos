package documentousuario;
public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;

    //constructor 
    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        setCodigoHash(codigoHash);
        setFecha(fecha);
        setUsuario(usuario);
    }

    //setters
    private final void setCodigoHash(String codigoHash) {
        if(codigoHash != null) {
            this.codigoHash = codigoHash;
        }
    }

    private final void setFecha(String fecha) {
        if(fecha != null){
            this.fecha = fecha;
        }
    }

    private final void setUsuario(Usuario usuario) {
        if(usuario != null){
            this.usuario = usuario;
        }
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
}
