package day20_CustomMethods;

public class C02_CustomMethodpractice {
    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("------------------------------");
        countDownTenToZero();
        System.out.println();
        System.out.println("------------------------------");
        countDownTenToZero2();
        System.out.println();
        System.out.println("------------------------------");


    }

    public static void helloWorld5Times() {
        for (int i = 1; i <= 5; i++) {  // intialition--condition(kosul)--incerement or decrement(artirma eksiltme)
            System.out.println("Hello World");

        }
    }


    // bir method yazin 10 dasn 0 a kadar rakamlari yazdirsin

    public static void countDownTenToZero() {
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

    }

    public static void countDownTenToZero2() {
        int i = 10;
        while (0 < i) {
            System.out.print(i + " ");
            i--;
        }
    }

    // 0 ile 100 arasindaki cift sayilari yazan bir method yazin.

    public static void ciftSayilar() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
            }
            System.out.println(i + " ");
        }
    }



}