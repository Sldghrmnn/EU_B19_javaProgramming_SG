package day55_CollectionReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        //collections framework'unun icinde yer alir
        //ic yapisinda arrayleri kullanir
        //primitive data tipini desteklemez... wrapper class lari kullanmak gerekir
        //boyu dinamiktir
        // deger girilmezse,default degeri yoktur.
        //giris sirasi muafaza edilir

        ArrayList<String> adlar = new ArrayList<>(10);
        System.out.println(adlar);

        adlar.add("Ali");
        adlar.add("Aliye");
        System.out.println(adlar);

        //boyu--size() bir method'dur
        System.out.println(adlar.size());
        ArrayList<String> isimler = new ArrayList<>(adlar);
        System.out.println("isimler = " + isimler);

        ArrayList<String> isimler2 = new ArrayList<>();
        isimler2.addAll(adlar);
        System.out.println("isimler2 = " + isimler2);

        ArrayList<String> isimler3 = adlar;
        System.out.println("isimler3 = " + isimler3);

        adlar.clear();


        System.out.println("isimler = " + isimler);
        System.out.println("isimler2 = " + isimler2);
        System.out.println("isimler3 = " + isimler3);

        ArrayList<String> countries = new ArrayList<>(){
            {
                add("Turkiye");
                add("Almanya");
                add("Isvec");
            }
        };
        System.out.println("countries = " + countries);

        System.out.println("--------------------------------------");

        //list'ler asagidaki yollarla olusturulursa immutable olur,yani yeni element eklenemez

        List<String> list = Arrays.asList("Arif","Arife");
        List<String> list1 = List.of("Arif","Arife");

        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);

        List<String> list2=new ArrayList<>(Arrays.asList("Arif","Arife"));
        System.out.println("list2 = " + list2);

        list2.add("Hamza");

        System.out.println("list2 = " + list2);




    }
}
