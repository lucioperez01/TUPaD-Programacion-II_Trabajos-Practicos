package cuentabancariatitular;
public class CuentaBancariaTitular {
public static void main(String[] args) {
        Titular titular = new Titular("Lucio", 43726940);
        CuentaBancaria cuentaBancaria = new CuentaBancaria(01125045752, 15354.2);
        
        //composicion
        System.out.println(cuentaBancaria);
        
        //asociacion bidireccional
        cuentaBancaria.setTitular(titular);
        titular.setCuentaBancaria(cuentaBancaria);
        
        System.out.println(cuentaBancaria.getTitular());
        System.out.println(titular.getCuentaBancaria());
    }
}
