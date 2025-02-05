package day19_Methods1;

public class C11_GoogleShopping {
    public static void main(String[] args) {
        /**
         * google git
         * arama yap
         * urunu bul ve sitesine git#
         * urunu sepetine ekle
         * odeme yap
         * onay kodu al
         * odemeyi tamamla
         * google e geri don
         */
        google();
        aramaYap();

    }

    public static void google(){
        System.out.println("Google sitesine gidildi");
        aramaYap();
    }
    public static void aramaYap(){
        System.out.println("urun girildi ve arama yapildi");
        System.out.println("arama sonuclarindan uygun olana tiklandi");
        urunSitesineGit();
    }
    public static void urunSitesineGit(){
        System.out.println("ilgili siteye gidildi");
        System.out.println("urun secildi ve sepete eklendi");
        odemeYap();
    }
    public static void odemeYap(){
        System.out.println("hesap bilgileri girildi");
        onayKoduAl();
        System.out.println("alinan kod girildi");
        System.out.println("odeme tamamlandi");
        // google(); sonsuz donguya sebep olur!!!
        System.out.println("gogle sitesine geri donuldu");
    }
public static void onayKoduAl(){
    System.out.println("onay kodu verildi");
}
}
