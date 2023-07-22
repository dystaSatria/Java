public class Futbolcu extends Sporcu {
    public Futbolcu(double maas, String kulup, int basari) {
        super(maas, kulup, basari);
    }

    @Override
    public void branşınıYazdır() {
        System.out.println("Branş: Futbol");
    }
}