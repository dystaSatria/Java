public abstract class Sporcu {
    private double maas;
    private String kulup;
    private int basari;

    public Sporcu(double maas, String kulup, int basari) {
        this.maas = maas;
        this.kulup = kulup;
        this.basari = basari;
    }

    public abstract void branşınıYazdır();

    public void bilgiAl() {
        System.out.println("Maaş: " + maas);
        System.out.println("Kulüp: " + kulup);
        System.out.println("Başarı Sıralaması: " + basari);
    }

    public void yazdir() {
        System.out.println("Sporcu Bilgileri:");
        branşınıYazdır();
        bilgiAl();
        System.out.println();
    }
}