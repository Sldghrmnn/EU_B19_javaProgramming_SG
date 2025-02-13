package day23_Review;

public class C04_HesapMakinasi {
    public static void main(String[] args) {

        double islemSonucu;

        islemSonucu=hesapMakinasi(10,2,'+');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinasi(10,2,'-');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinasi(10,2,'*');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinasi(10,2,'/');
        System.out.println("islemSonucu = " + islemSonucu);

        islemSonucu=hesapMakinasi(10,2,'&');
        System.out.println("islemSonucu = " + islemSonucu);

    }

    public static double hesapMakinasi(int sayi1,int sayi2,char islem){
        double sonuc=0;
        switch (islem){
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=sayi1/sayi2;
                break;
            default:
                sonuc= -1000;
        }

        return sonuc;
    }
}
