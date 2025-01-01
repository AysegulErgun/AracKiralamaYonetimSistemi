public class Main {

    public static void main(String[] args) {

        AracKiralamakVeOdemeYapmak aracSistemi = new AracKiralamakVeOdemeYapmak();



        // Araç kiralama ve ödeme işlemleri

        aracSistemi.aracKirala("sedan");

        aracSistemi.odemeYap("kredi kartı", 350.00);



        aracSistemi.aracKirala("suv");

        aracSistemi.odemeYap("banka kartı", 500.00);



        aracSistemi.aracKirala("spor araba");

        aracSistemi.odemeYap("nakit", 700.00);

    }

}

