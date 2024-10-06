import java.util.ArrayList;
import java.util.List;

class Personel {
    private String ad;
    private String soyad;
    private String pozisyon;

    public Personel(String ad, String soyad, String pozisyon) {
        this.ad = ad;
        this.soyad = soyad;
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return ad + " " + soyad + " - " + pozisyon;
    }
}

class Departman {
    private String ad;
    private List<Personel> personeller;

    public Departman(String ad) {
        this.ad = ad;
        this.personeller = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personeller.add(personel);
    }

    public void personelListele() {
        System.out.println("Departman: " + ad);
        System.out.println("Personeller:");
        for (Personel personel : personeller) {
            System.out.println(personel);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Departman oluşturma
        Departman yazilimDepartmani = new Departman("Yazılım Geliştirme");

        // Personel ekleme
        Personel personel1 = new Personel("Fatma", "Öztürk", "Test Mühendisi");
        Personel personel2 = new Personel("Ali", "Öztürk", "Bilgisayar Mühendisi");
        Personel personel3 = new Personel("Rıza", "Özer", "Yazılım Mühendisi");
        Personel personel4 = new Personel("Şükran", "Küçük", "Proje Yöneticisi");

        yazilimDepartmani.personelEkle(personel1);
        yazilimDepartmani.personelEkle(personel2);
        yazilimDepartmani.personelEkle(personel3);
        yazilimDepartmani.personelEkle(personel4);

        // Personelleri listeleme
        yazilimDepartmani.personelListele();
    }
}
