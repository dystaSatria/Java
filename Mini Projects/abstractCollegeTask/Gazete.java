public class Gazete extends Medya {
    private String medyaBasligi;
    private int cikisYili;
    private int satışAdedi;

    public Gazete(String medyaBasligi, int cikisYili, int satışAdedi) {
        this.medyaBasligi = medyaBasligi;
        this.cikisYili = cikisYili;
        this.satışAdedi = satışAdedi;
    }

    @Override
    public String isim() {
        return medyaBasligi;
    }

    @Override
    public int yil() {
        return cikisYili;
    }

    @Override
    public int adet() {
        return satışAdedi;
    }
}