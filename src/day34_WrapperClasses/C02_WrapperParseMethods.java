package day34_WrapperClasses;

import java.util.Arrays;

public class C02_WrapperParseMethods {
    public static void main(String[] args) {
        String str = "123455.4444";
        Double doubleSayi = Double.parseDouble(str);  //obje olarakta atayabilirim
        System.out.println("doubleSayi = " + doubleSayi);

        double dblSayi = Double.parseDouble(str);  //primitiv olarakda atayabiliriz
        System.out.println("dblSayi = " + dblSayi);


        String strInt = "1235";
        System.out.println(strInt + 5); //12355

        int sayiInt = Integer.parseInt(strInt);
        System.out.println("sayiInt = " + sayiInt);
        System.out.println(strInt + 5); //1240


        System.out.println("---------------------------------");

        /*
        1.eleman---->isim
        2.eleman---->dogumYili
        3.eleman---->dogumIli
        4.eleman---->dogumUlkesi
         */

        String str2 = "Süleyman 1982 Ankara Turkiye";
        System.out.println("str2 = " + str2);

        String[] strArr = str2.split(" ");
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(strArr));

        System.out.println("Adi =        " + strArr[0]);
        System.out.println("Dogum yili = " + strArr[1]);
        System.out.println("Dogum ili =  " + strArr[2]);
        System.out.println("Dogum Ulke = " + strArr[3]);

        int dogumYili = Integer.parseInt(strArr[1]);
        int yas = 2025-dogumYili;
        System.out.println("yas = " + yas);

        String [] strArray ={"Ahmet 1978 Istanbul Türkiye","Hasan 1976 Berlin Almanya","Selda 1993 Washington ABD"};

        for (String str3 :strArray ) {
        	String[] eleman = str3.split(" ");
            System.out.println("Adi        = " + eleman[0]);
            System.out.println("Dogum yili = " + eleman[1]);
            System.out.println("Dogum ili  = " + eleman[2]);
            System.out.println("Dogum Ulke = " + eleman[3]);
            System.out.println();
        }

        //           5940
        //                            "5940"
        int i = Integer.parseInt("  5940   ".trim());
        System.out.println("i = " + i);




    }
}
