package day23_Review;

public class C03_Google {
    public static void main(String[] args) {

        System.out.println("Test basladi");
        google();
        System.out.println("Test bitti");

    }

    public static void google(){
        System.out.println("Google web sitesine gidildi");
        aramaYap();
        System.out.println("Tekrar Google dondu");
    }
    public static void aramaYap(){
        System.out.println("Urun aratildi");
        System.out.println("Arama sonuclarindan urun cliklendi");
        urunSitesineGit();
    }
    public static void urunSitesineGit(){
        System.out.println("Urun sitesine gidildi");
        System.out.println("Urun secildi");
        sepeteEkle();
    }
    public static void sepeteEkle(){
        System.out.println("Urun sepete eklendi");
        odemeYap();
    }
    public static void odemeYap(){
        System.out.println("Hesap bilgileri girildi");
        System.out.println("Onay kodu al");
        System.out.println("Onay kodu girildi ve odeme tamamlandi");
    }
}
/*
// google a git
// Arama yap
// Urunu bul sitesine git
// Urunu sepete ekle
// Odeme yap
// Onay kodu al
// Odemeyi tamamla
// google a geri don
 */