package pasaportefototitular;
public class PasaporteFotoTitular {
    public static void main(String[] args) {
        Titular lucio = new Titular("Lucio", 40294592);
        Pasaporte pLucio = new Pasaporte(123, "15/08/25", "24", "png");
        
        lucio.setPasaporte(pLucio);
        pLucio.setTitular(lucio);
        
        System.out.println(pLucio.getTitular());
        System.out.println(lucio.getPasaporte());
    }
}
