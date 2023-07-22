// BilimKurgu.java
public class BilimKurgu implements KitapArayuzu {
    private String tur;
    private String yazar;
    private double fiyat;

    public BilimKurgu(String tur, String yazar, double fiyat) {
        this.tur = tur;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public void turu() {
        System.out.println("Tür: " + tur);
    }

    @Override
    public void yazar() {
        System.out.println("Yazar: " + yazar);
    }

    @Override
    public double fiyat() {
        return fiyat;
    }

    @Override
    public void yazdir() {
        System.out.println("Kitap Bilgileri:");
        turu();
        yazar();
        System.out.println("Fiyat: " + fiyat());
        System.out.println();
    }
}