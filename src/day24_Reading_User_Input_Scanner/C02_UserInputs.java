package day24_Reading_User_Input_Scanner;


import java.util.Scanner;

public class C02_UserInputs {

    public static void main(String[] args) {

        System.out.println("Reading User's input with Scanner Class");

        Scanner sc = new Scanner(System.in);

        System.out.print("Klavyeden byte turunde bir veri giriniz : ");
        byte byte1 = sc.nextByte();
        System.out.println("Girilen deger : "+byte1);

        System.out.print("Klavyeden short turunde bir veri giriniz : ");
        short schort1 = sc.nextShort();
        System.out.println("Girilen deger : "+schort1);

        System.out.print("Klavyeden int turunde bir veri giriniz : ");
        int int1 = sc.nextInt();
        System.out.println("Girilen deger : "+int1);

        System.out.print("Klavyeden float turunde bir veri giriniz : ");
        float float1 = sc.nextFloat();
        System.out.println("Girilen deger : "+float1);

        System.out.print("Klavyeden double turunde bir veri giriniz : ");
        double double1 = sc.nextDouble();
        System.out.println("Girilen deger : "+double1);

        System.out.print("Klavyeden boolean turunde bir veri giriniz : ");
        boolean boolean1 = sc.nextBoolean();
        System.out.println("Girilen deger : "+boolean1);


        System.out.print("Klavyeden String turunde bir veri giriniz : ");
        String str1 = sc.next();
        System.out.println("Girilen deger : "+str1);


        sc.nextLine();
        System.out.print("Klavyeden String turunde bir veri giriniz : ");
        String s1 = sc.nextLine();
        System.out.println("Girilen deger : "+s1);

        //Klavyeden tek harf girisi
        System.out.println("Klavyeden bir harf giriniz : ");

        char harf = sc.next().charAt(0); // ilk harfi doner

        System.out.println("Girilen harf : "+harf);

        sc.close();

        // uygun deger girilmezsee InputMismatchException hatasi aliriz.

    }
}
