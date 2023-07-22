public class Main {
    public static void main(String[] args) {
        // Kitapları oluşturuyoruz
        KitapArayuzu bilimKurgu = new BilimKurgu("Bilim Kurgu", "Isaac Asimov", 25.99);
        KitapArayuzu polisiye = new Polisiye("Polisiye", "Agatha Christie", 19.99);
        KitapArayuzu macera = new Macera("Macera", "Jules Verne", 29.99);

      
        bilimKurgu.yazdir();
        polisiye.yazdir();
        macera.yazdir();
    }
}
