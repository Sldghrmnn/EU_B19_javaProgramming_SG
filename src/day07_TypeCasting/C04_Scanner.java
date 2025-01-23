package day07_TypeCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

// 1.Scanner sinifinda bir obje olustur

     Scanner scan= new Scanner(System.in);    // konsoldan bir veri almak istedigimizde,oncelikle bir obje olusturmamiz
                                              //gerekiyor. Bunu da bu kod la olusturuyoruz!!!
// 2. Kullaniciyi bilgilendir ! Ne istedigini soyle

     System.out.print("Lutfen isminizi giriniz : ");

// 3. Girilen veriyi icine koyabilecegimiz uygun bir degisken olustur
//  scanner uygun methodu ile veriyi degisken icerisine yaz

     String name= scan.nextLine();

// scan.next(); ===> ilk bosluga kadar alir -----Ali Osman ---- Ali yi alir
// scan.nextLine();===> ilkten enter'e kadar alir ---> Ali Osman--Ali Osman

     System.out.println("Isminiz : " + name);

// 4. close scanner

     scan.close();








    }
}
