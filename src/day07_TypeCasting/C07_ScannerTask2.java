package day07_TypeCasting;

import java.util.Scanner;

public class C07_ScannerTask2 {
    public static void main(String[] args) {

// Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
// Isminiz : Himmet
// Soyisminiz : Abi
// Yasiniz : 38
// Dogum Yeriniz : Kayseri
// Kaydiniz basariyla tamamlanmistir.

Scanner input= new Scanner(System.in);

System.out.println(" Lutfen isminizi giriniz  : ");
String isim= input.nextLine();

System.out.println("Lütfen soyadinizi giriniz : ");
String soyIsim= input.nextLine();

System.out.println("Lutfen yasinizi giriniz : ");
int yas=input.nextInt();
input.nextLine();   // enter icin

System.out.println("Lütfen dogum yerinizi giriniz : ");
String dogumYeri= input.nextLine();


System.out.println("isim = " + isim);
System.out.println("soyIsim = " + soyIsim);
System.out.println("yas = " + yas);
System.out.println("dogumYeri = " + dogumYeri);
        System.out.println("Kaydiniz basari ile olusturulmustur");



    }

    }

