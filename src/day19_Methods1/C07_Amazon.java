package day19_Methods1;

public class C07_Amazon {
    public static void main(String[] args) {
        //Amazon sayfasina git
        //login ol
        //urun arat
        //sepete ekle
        //odeme yap

        System.out.println("Test basladi");
        amazonLogin();
        urunArama();
        satinAlma();
        amazonLogout();
        System.out.println("Test bitti");
    }

    public static void amazonLogin() {
        System.out.println("Amazon web sitesine git");
        System.out.println("Siteye login ol");
    }

    public static void urunArama() {
        System.out.println("Arama kutusuna git");
        System.out.println("Bilgisayar urununu arat");
        System.out.println("Cikan sonuclari filtrele");
    }

    public static void satinAlma() {
        System.out.println("Urun sec");
        System.out.println("Urunu sepete ekle");
        System.out.println("Odemeyi yap");
    }
    public static void amazonLogout(){
        System.out.println("Site'den cikis yap.");
    }
}