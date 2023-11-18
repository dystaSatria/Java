import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




class Kitap {
    private String kitapAdi;
    private String yazar;
    private boolean oduncDurumu;

    public Kitap(String kitapAdi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.oduncDurumu = false; // Kitap ödünç alınmamış olarak başlatılır
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public String getYazar() {
        return yazar;
    }

    public boolean isOduncDurumu() {
        return oduncDurumu;
    }

    public void setOduncDurumu(boolean oduncDurumu) {
        this.oduncDurumu = oduncDurumu;
    }
}

// Uye sınıfı
class Uye {
    private String uyeAdi;
    private int uyeID;

    public Uye(String uyeAdi, int uyeID) {
        this.uyeAdi = uyeAdi;
        this.uyeID = uyeID;
    }

    public String getUyeAdi() {
        return uyeAdi;
    }

    public int getUyeID() {
        return uyeID;
    }
}

// Gorevli sınıfı
class Gorevli {
    private String gorevliAdi;

    public Gorevli(String gorevliAdi) {
        this.gorevliAdi = gorevliAdi;
    }

    public String getGorevliAdi() {
        return gorevliAdi;
    }
}

// Kütüphane yönetim sistemi sınıfı
class Main {
    private List<Kitap> kitapListesi;
    private List<Uye> uyeListesi;
    private List<Gorevli> gorevliListesi;
    private Map<Uye, Kitap> oduncKitaplar;

    public Main() {
        kitapListesi = new ArrayList<>();
        uyeListesi = new ArrayList<>();
        gorevliListesi = new ArrayList<>();
        oduncKitaplar = new HashMap<>();
    }

    public void kitapEkle(String kitapAdi, String yazar) {
        Kitap yeniKitap = new Kitap(kitapAdi, yazar);
        kitapListesi.add(yeniKitap);
    }

    public void kitapCikar(String kitapAdi) {
        Kitap silinecekKitap = null;
        for (Kitap kitap : kitapListesi) {
            if (kitap.getKitapAdi().equals(kitapAdi)) {
                silinecekKitap = kitap;
                break;
            }
        }
        if (silinecekKitap != null) {
            kitapListesi.remove(silinecekKitap);
        }
    }

    public void uyeEkle(String uyeAdi, int uyeID) {
        Uye yeniUye = new Uye(uyeAdi, uyeID);
        uyeListesi.add(yeniUye);
    }

    public void uyeCikar(int uyeID) {
        Uye silinecekUye = null;
        for (Uye uye : uyeListesi) {
            if (uye.getUyeID() == uyeID) {
                silinecekUye = uye;
                break;
            }
        }
        if (silinecekUye != null) {
            uyeListesi.remove(silinecekUye);
        }
    }

    public void gorevliEkle(String gorevliAdi) {
        Gorevli yeniGorevli = new Gorevli(gorevliAdi);
        gorevliListesi.add(yeniGorevli);
    }

    public void gorevliCikar(String gorevliAdi) {
        Gorevli silinecekGorevli = null;
        for (Gorevli gorevli : gorevliListesi) {
            if (gorevli.getGorevliAdi().equals(gorevliAdi)) {
                silinecekGorevli = gorevli;
                break;
            }
        }
        if (silinecekGorevli != null) {
            gorevliListesi.remove(silinecekGorevli);
        }
    }

    public void kitapVer(Uye uye, String kitapAdi) {
        Kitap verilecekKitap = null;
        for (Kitap kitap : kitapListesi) {
            if (kitap.getKitapAdi().equals(kitapAdi) && !kitap.isOduncDurumu()) {
                verilecekKitap = kitap;
                kitap.setOduncDurumu(true);
                oduncKitaplar.put(uye, kitap);
                break;
            }
        }
        if (verilecekKitap == null) {
            System.out.println("Kitap odunc alinamadi veya bulunamadi.");
        }
    }

    public void kitapAl(Uye uye) {
        Kitap alinacakKitap = oduncKitaplar.get(uye);
        if (alinacakKitap != null) {
            alinacakKitap.setOduncDurumu(false);
            oduncKitaplar.remove(uye);
        } else {
            System.out.println("Bu uye tarafindan odunc alinmis kitap bulunmamaktadir.");
        }
    }

    public void oduncDurumuGoster() {
        for (Map.Entry<Uye, Kitap> entry : oduncKitaplar.entrySet()) {
            Uye uye = entry.getKey();
            Kitap kitap = entry.getValue();
            System.out.print("Uye ID: ");
            System.out.print(uye.getUyeID());
            System.out.print("\n Uye Adi: ");
            System.out.print(uye.getUyeAdi());
            System.out.print("\n Odunc Alinan Kitap: ");
            System.out.print(kitap.getKitapAdi());
            System.out.print("\n Yazar: ");
            System.out.println(kitap.getYazar());
            System.out.print("\n");

        }
    }


    public static void main(String[] args) {
        Main kys = new Main();

        kys.kitapEkle("Sefiller", "Victor Hugo");
        kys.kitapEkle("Suç ve Ceza", "Fyodor Dostoyevski");

        kys.uyeEkle("Ahmet", 101);
        kys.uyeEkle("Ayse", 102);

        kys.kitapVer(kys.uyeListesi.get(0), "Sefiller");
        kys.kitapVer(kys.uyeListesi.get(1), "Suç ve Ceza");


        System.out.println("======= Basit Kütüphane Yönetim Sistemi =======\n");


        kys.oduncDurumuGoster();

        kys.kitapAl(kys.uyeListesi.get(0));

        kys.oduncDurumuGoster();
    }
}
