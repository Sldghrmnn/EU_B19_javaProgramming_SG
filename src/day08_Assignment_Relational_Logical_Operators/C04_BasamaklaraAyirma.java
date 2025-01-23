package day08_Assignment_Relational_Logical_Operators;

public class C04_BasamaklaraAyirma {
    public static void main(String[] args) {
     // verilen 4 basamakli bir sayiyi basamaklarina ayirarak yazdiran kod nedir?

     int sayi= 2395;
     int birler, onlar, yuzler, binler;

     birler= sayi % 10;  // 5
     sayi /= 10;     // 239

     onlar= sayi % 10;  // 9
     sayi /= 10;    // 23

     yuzler= sayi % 10;  // 3
     sayi /= 10;     // 2

     binler= sayi % 10;

     System.out.println("sayi = " + sayi);


     System.out.println("birler = " + birler);
     System.out.println("onlar = " + onlar);
     System.out.println("yuzler = " + yuzler);
     System.out.println("binler = " + binler);


    }
}
