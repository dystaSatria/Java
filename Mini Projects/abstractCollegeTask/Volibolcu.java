public class Volibolcu extends Sporcu {

    public Volibolcu(double maas, String kulup, int basari) {
        super(maas, kulup, basari);
    }
    
    @Override
    public void branşınıYazdır(){
        System.out.println("Brans : Volibolcu");
    }
    
}