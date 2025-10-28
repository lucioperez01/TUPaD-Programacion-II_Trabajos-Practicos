package ecommerse;

import java.util.Scanner;

public enum MetodoDePago {
    PAYPAL(null, null),
    TRANSFERENCIA(null, null);
    
    private String cuit;
    private String email;
    private Cliente cliente;

    private MetodoDePago(String email, String cuit) {
        setCuit(cuit);
        setEmail(email);
    }

    public String getNombre() {
        return cuit;
    }

    public String getEmail() {
        return email;
    }
    
    

    public void setCuit(String CBU) {
        if(CBU != null) {
            this.cuit = CBU;
        }
    }

    public void setEmail(String email) {
        if(email != null) {
            this.email = email;
        }
    }

    public void setCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
        }
    }
    
    public void pagar(Cliente cliente) {
        Scanner scan = new Scanner(System.in);

        switch (this) {
            case PAYPAL:
                if (email != null) {
                    System.out.println("Recibiendo pago de PayPal (" + email + ") del cliente " + cliente.getNombre());
                } else {
                    System.out.print("Para pagar con PayPal, ingrese su email: ");
                    setEmail(scan.nextLine());
                    cliente.setMetodoDePago(this);
                    System.out.println("Email registrado correctamente.");
                    pagar(cliente); // vuelve a intentar ahora con los datos ya cargados
                }
                break;

            case TRANSFERENCIA:
                if (cuit != null) {
                    System.out.println("Recibiendo pago por Transferencia de " + cuit + " (cliente " + cliente.getNombre() + ")");
                } else {
                    System.out.print("Para pagar por Transferencia, ingrese su cuit: ");
                    setCuit(scan.nextLine());
                    cliente.setMetodoDePago(this);
                    System.out.println("Cuit registrado correctamente.");
                    pagar(cliente);
                }
                break;
        }
    }
}
