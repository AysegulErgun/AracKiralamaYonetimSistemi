public class KrediKartiOdeme implements IOdemeStratejisi{
    @Override
    public void odemeYap(double miktar) {
        System.out.println("kredi kartı ile " + miktar + " odeme yapıldı");
    }
}
