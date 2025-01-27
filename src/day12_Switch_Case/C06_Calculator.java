package day12_Switch_Case;

import java.util.Scanner;

public class C06_Calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Hesap makinasi");
        System.out.println("-------------------");

        int sonuc= 0;

        System.out.println("1.sayiyi giriniz : ");
        int sayi1=input.nextInt();

        input.nextLine(); //scanner clasinda sayi inputundan sonra String alinabilmesi icin araya bos bir nextline() konulmalidir!

        System.out.println("Bir islem operastoru giriniz -> '+','-','*','/' : ");
        String islemOperatoru= input.nextLine();

        System.out.println("2. saayiyi giriniz : ");
        int sayi2= input.nextInt();


        switch (islemOperatoru){
            case "+" -> sonuc = sayi1 +sayi2;
            case "-" -> sonuc = sayi1 -sayi2;
            case "*" -> sonuc = sayi1 *sayi2;
            case "/" -> {
                if (sayi2== 0){
                    System.out.println("ikinci sayi 0 olamaz ! tekrar giriniz..");
                    sayi2= input.nextInt();
                }
                sonuc = sayi1 /sayi2;
            }
            default -> System.out.println("Yanlis operator girdiniz ");
            }
        System.out.println("sonuc = "+sonuc);

        }

    }
