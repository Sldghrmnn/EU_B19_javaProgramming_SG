package day09_Review;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {


    /*
    Task 1
      1. Get name and age from the user, declare a variable (byte) age, write a program that can check if the
      person is eligible to buy Cigarettes. In USA it is illegal to sell tabacco under age 21.
      print console : Ahmet is eligible to buy cigarettes: true/false

        yas isim sigara alip uygunmu uygun degilmi onu yap sigara americada 21 alt sinir
    */

  String isim= "Ahmet";
     byte yas= 29;



    int  yasSiniri=21;
  System.out.println("yasSiniri = " + yasSiniri);

      boolean sigaraAlmaYasSiniri=yas>=yasSiniri;
  System.out.println("sigaraAlmaYasSiniri = " + sigaraAlmaYasSiniri);

  System.out.println(isim+" is eligible to buy cigarettes : " +sigaraAlmaYasSiniri );

     yas=17;


      boolean sigaraAlmaYasSiniri1=yas>=yasSiniri;

  System.out.println(isim+" is eligible to buy cigarettes : " +sigaraAlmaYasSiniri1 );

        System.out.println("------------------------------------------");


/*
   * Kullanicidan aldigimiz boy ve kiloda Beden Kitle Endeksi body mass index hesaplanacak
   * Body Mass Index (bmi) = kilo / (Boy(m)*Boy(m))

   *aritmetik operatorle yap

*/

        Scanner scan= new Scanner(System.in);
        System.out.println(" Lutfen boyunuzu (m) giriniz : ");
        double boy= scan.nextDouble();
        System.out.println(" Lutfen kilonuzu (kg) giriniz : ");
        double kilo= scan.nextDouble();

        double dmi=kilo / (boy*boy);
        System.out.println("dmi = " + dmi);

    }
}
