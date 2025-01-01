
//toLowerCase() büyük küçük harf duyarlılığını kaldırmak için
public class AracKiralamakVeOdemeYapmak {
private IAracFactory aracFactory;
private IOdemeStratejisi odemeStratejisi;
    public void aracKirala(String aracTipi){
        switch(aracTipi.toLowerCase()){
            case "sedan":
                aracFactory = new SedanFactory();
                break;
            case "suv":
                aracFactory = new SUVFactory();
                break;
            case "spor araba":
                aracFactory = new SporArabaFactory();
                break;
            default:
                System.out.println("geçersiz araç türü");
                return;
        }
        aracFactory.icMekanUret().icMekanUret();
        aracFactory.lastigiUret().lastigiUret();
        aracFactory.motoruUret().motoruUret();
        System.out.println(aracTipi+ " kiralandı");
    }
    public void odemeYap(String odemeTuru, double miktar){
            switch (odemeTuru.toLowerCase()){
                case "kredi kartı":
                    odemeStratejisi = new KrediKartiOdeme();
                    break;
                case "banka kartı":
                    odemeStratejisi = new BankaKartiOdeme();
                    break;
                case "nakit":
                    odemeStratejisi = new NakitOdeme();
                    break;
                default:
                    System.out.println("geçersiz ödeme türü");
            }
            odemeStratejisi.odemeYap(miktar);
    }
}
