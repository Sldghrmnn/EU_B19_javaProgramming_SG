package day13_Ternary;

import java.util.Scanner;

public class C06_IfElseTernary {
    public static void main(String[] args) {
        // girilen sayinin pozitif ya da negatif oldugunu yazdiran kodu yaziniz .

        // if-else

        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir sayi giriniz : ");

        double sayi = scan.nextDouble();

        if(sayi >=0)
            System.out.println(sayi+" pozitif bir sayyidir");
        else
            System.out.println(sayi+" negatif bir sayidir ");

        System.out.println("----------------------------------------");

        // ternary

        String sonuc = sayi >= 0 ?sayi+" pozitif bir sayyidir" : sayi+" negatif bir sayidir " ;

        System.out.println("sonuc = " + sonuc);


    }
}
