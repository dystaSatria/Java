public class Basketbolcu extends Sporcu {
    public Basketbolcu(double maas, String kulup, int basari) {
        super(maas, kulup, basari);
    }

    @Override
    public void branşınıYazdır() {
        System.out.println("Branş: Basketbol");
    }
}