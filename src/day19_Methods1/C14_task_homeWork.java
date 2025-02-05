package day19_Methods1;

import java.util.Scanner;

public class C14_task_homeWork {
    public static void main(String[] args) {
        sayilarinToplami();
        System.out.println("\n");
        convertFehreneit();
        System.out.println("\n");
        tekSayilarinToplami();
        ciftSayilarinToplami();
        System.out.println("---------------------------------\n");
    }

    /*
    task 1.
Write a method that calculates the sum of 3 numbers
sumOfNumbers();
    3 sayinin toplamini hesaplayan bir metod yaziniz
    sayilarintoplami();
     */

    public static void sayilarinToplami(){
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz : ");
        int sayi1 = input.nextInt();
        System.out.println("Ikinci sayiyi giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("Ucuncu sayiyi giriniz : ");
        int sayi3 = input.nextInt();
        int toplam = sayi1 + sayi2 + sayi3;
        System.out.println("toplam = " + toplam);

    }
    /*
    task 2.
Write a method that converts Celsius to Fahrenheit
convertFehreneit();
celsius u fahrenheit e donusturen bir metod yaziniz
convertFahreneit();
     */
    public static void convertFehreneit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Celsius degerini giriniz : ");
        double celsius = scanner.nextDouble();
        double fahreneit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " °C = " + fahreneit + " °F");
    }

    /*
    task 3.
Write a program that iterates numbers and checks if number is even or
odd, according to evaluation it sums even and odd numbers, displays result in
two different methods.
sumOfOddNumbers();
sumOfEvenNumbers();

sayilari yineleyerek(dongu ile kontrol ederek) her sayinin tek mi,cift mi oldugunu belirleyen
tek ve cift sayilari ayri ayri toplayan
sonuclari 2 farkli metodla ekrana yazdiran bir program olusturun
sumOfOddNumbers();   tekSayilarinToplamini();
sumOfEvenNumbers();  ciftSayilarinToplami();


     */
    public static void tekSayilarinToplami(){
        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                toplam += i;
            }
        }
        System.out.println("Toplam tek sayilar : " + toplam);
    }
    public static void ciftSayilarinToplami(){
        int toplam = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (i % 2 == 0){
                toplam += i;
            }
        }
        System.out.println("Toplam cift sayilar : " + toplam);
    }

}
