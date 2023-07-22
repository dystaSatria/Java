public class Main {
    public static void main(String[] args) {

        Sporcu basketbolcu = new Basketbolcu(15000, "Fenerbahçe", 8);
        Sporcu futbolcu = new Futbolcu(25000, "Galatasaray", 10);
        Sporcu voleybolcu = new Volibolcu(12000, "Eczacıbaşı", 6);

        basketbolcu.yazdir();
        futbolcu.yazdir();
        voleybolcu.yazdir();

        Medya gazete = new Gazete("Hürriyet", 2023, 150000);
        
        System.out.println("Medya Bilgileri:");
        System.out.println("Medya Adı: " + gazete.isim());
        System.out.println("Çıkış Yılı: " + gazete.yil());
        System.out.println("Satış Adedi: " + gazete.adet());
    }
}
