package generadorqrusuario;
public class CodigoQR {
    private double valor;
    private Usuario usuario;

    //constructor
    public CodigoQR(double valor) {
        setValor(valor);
    }
    
    //setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    //asociacion unidireccional
    public void setUsuario(Usuario usuario) {
        if(usuario != null) {
            this.usuario = usuario;
        }
    }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor=" + valor + ", usuario=" + usuario + '}';
    }
}
