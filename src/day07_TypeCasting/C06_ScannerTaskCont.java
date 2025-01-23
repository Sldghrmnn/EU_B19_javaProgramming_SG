package day07_TypeCasting;

import java.util.Scanner;

public class C06_ScannerTaskCont {
    public static void main(String[] args) {

//Kullanicidan bir sayi alin
//Sayiya iki topla karesini al

Scanner input = new Scanner(System.in);

System.out.println("Lütfen isim giriniz : ");
String isim= input.nextLine();


System.out.println("Lütfen bir sayı giriniz : ");
int number= input.nextInt();   // Java da scanner clasında nextInt(), nextDouble, next() kullandıktan sonra,etc
                               // nextLine() kullanıyorsan fazladan bir tane daha nextLine() kullanman gerekir

input.nextLine();

System.out.println("Lütfen soyisim giriniz : ");
String soyIsim = input.nextLine();



System.out.println("number = " + number);
System.out.println("isim = " + isim);
System.out.println("soyIsim = " + soyIsim);



    }
}
