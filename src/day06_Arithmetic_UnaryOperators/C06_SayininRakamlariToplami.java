package day06_Arithmetic_UnaryOperators;

import java.util.Scanner;

public class C06_SayininRakamlariToplami {
    public static void main(String[] args) {

   //kullanicidan 3 basamakli bir saayi alin
   //ve saayinin rakamlari toplamini ekrana yazdirin!!
   // 112 = 1 +1 +2 = 4
   // 952 = 9 +5 +2= 16

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");

        int number=scanner.nextInt();
        System.out.println("number = " + number);

        // 567

        int lastDigit=number%10;   //567----7

        number/= 10;
        System.out.println("number = " + number);    // 56

        int secondDigit= number%10;     // 6

        int thirdDigit= number/10;     // 5

        int toplam=lastDigit+secondDigit+thirdDigit;
        System.out.println("toplam = " + toplam);





    }
}
