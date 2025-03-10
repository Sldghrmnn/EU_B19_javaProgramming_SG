package day38_Constructor_PassingObjects02.okul;

import java.util.ArrayList;

public class OkulTest {
    public static void main(String[] args) {

        Adres adres = new Adres("Etimesgut","Ankara");
        System.out.println("adres.toString() = " + adres.toString());
        System.out.println();

        Adres okulAdresi = new Adres("Okullar Caddesi","Cankaya","Ankara",123);
        Adres ogrenciEvAdresi = new Adres("Cumhuriyet Caddesi","Etimesgut","Ankara",34);


        Ogrenci ogrenci= new Ogrenci("Ahmet","2-B",18,ogrenciEvAdresi,okulAdresi);
        Ogrenci ogrenci2= new Ogrenci("mehmet","2-C",19,ogrenciEvAdresi,okulAdresi);
        Okul okul = new Okul("ABC Anadolu Lisesi",okulAdresi);

        System.out.println("ogrenci = " + ogrenci);
        System.out.println("okul = " + okul);
        System.out.println();

        okul.ogrenciEkle(ogrenci);
        okul.ogrenciEkle(ogrenci2);
        System.out.println("okul = " + okul);
        System.out.println();

        Ogrenci ogrenci3=new Ogrenci("Mehmet");
        Ogrenci ogrenci4=new Ogrenci("Ali");
        Ogrenci ogrenci5=new Ogrenci("Zeynep","1-C",15);


        ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

        ogrenciler.add(ogrenci3);
        ogrenciler.add(ogrenci4);
        ogrenciler.add(ogrenci5);

        Okul yeniOkul = new Okul("Yeni Okul",new Adres(),ogrenciler);
        System.out.println("yeniOkul = " + yeniOkul);


    }

}
