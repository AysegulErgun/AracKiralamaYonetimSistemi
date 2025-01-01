public class BankaKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("Banka kartı ile " + miktar + " odeme yapıldı");
    }
}
