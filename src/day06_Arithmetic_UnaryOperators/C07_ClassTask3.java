package day06_Arithmetic_UnaryOperators;

public class C07_ClassTask3 {

    public static void main(String[] args) {

 /*
Toplantı salonunda 15 adet sıra ve her sırada 12 adet koltuk
vardır. Toplantıya 113 kisi katılmıştır.

*/

        int sira=15;
        int siraKoltukSayisi=12;
        int katilan=113;

    //1.Toplantı salonun toplam kapasitesi nedir?
        int kapasite= sira*siraKoltukSayisi;
        System.out.println("kapasite = " + kapasite);      //180 kapasite


    //2.Kaç adet boş koltuk vardır ?
        int bosKoltuk=kapasite-katilan;
        System.out.println("bosKoltuk = " + bosKoltuk);    // bos koltuk 67

    //3.Kaç adet sırada oturulmaktadır ?
        int oturulanSiraAdedi=katilan/siraKoltukSayisi +1;
        System.out.println("oturulanSiraAdedi = " + oturulanSiraAdedi);      // 10


    //4. kac sira tamamen bos kalmistir?
        int bosSira=sira-oturulanSiraAdedi;
        System.out.println("bosSira = " + bosSira);             // 5


    //5. Oturulan siralarda kac adet bos koltuk vardir?
        int oturulanSiradakiBosKoltuk= siraKoltukSayisi - (katilan % siraKoltukSayisi);
        System.out.println("oturulanSiradakiBosKoltuk = " + oturulanSiradakiBosKoltuk);

        int cevap2= bosKoltuk % 12;
        System.out.println("cevap2 = " + cevap2);


    }

}

