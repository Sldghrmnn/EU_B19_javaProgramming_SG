package day30_Arrays01;

public class C10_LargestNumber {
    public static void main(String[] args) {
    // Verilen listedeki sayilardan en buyuk olani ve kacinci sirada oldugunu tespit eden bir program yaziniz

        int [] sayilar = {263,3466,4671,835,3345,2136,976,6989,3421};

        int enBuyukSayi = sayilar[0];
        int sira =0;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>enBuyukSayi){
                enBuyukSayi = sayilar[i];
                sira=i+1;
            }
        }
        System.out.println("enBuyukSayi = " + enBuyukSayi);

        System.out.println("Listede "+sira+". sirada yer alan "+enBuyukSayi+" en buyuk sayidir.");

    }
}
