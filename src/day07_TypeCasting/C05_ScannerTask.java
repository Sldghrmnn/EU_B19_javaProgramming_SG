package day07_TypeCasting;

import java.util.Scanner;

public class C05_ScannerTask {
    public static void main(String[] args){
//Kullanicidan bir sayi alin
//Sayiya iki topla karesini al

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");

        int number= input.nextInt();

        System.out.println("Lütfen kuvvet giriniz : ");
        int kuvvet= input.nextInt();


        System.out.println("number = " + number);

        System.out.println("Girdiginiz sayinin iki fazlasinin karesi : " +(number+2) * (number+2));


        int ikiFazlasi= number+2;

        System.out.println("Math.pow(number,2) = " + Math.pow(number,kuvvet));












    }
}
