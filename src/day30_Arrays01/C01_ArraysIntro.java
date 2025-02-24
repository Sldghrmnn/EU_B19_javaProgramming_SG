package day30_Arrays01;

public class C01_ArraysIntro {
    public static void main(String[] args) {
        // Declaring an Array
        // 1.yol
        int [] sayilar;
        String [] kelimeler;
        double [] oranlar;

        //2.yol
        int sayilar2 [];
        String kelimeler2 [];
        double oranlar2 [];

        // Array olusturma
        // 1. yol --- farkli statmentlarda
        int [] sayilar3;
        sayilar3 = new int[5];

        //2.yol -- tek satirda tanimlama
        int sayilar4 [] = new int[10];

        // int [5] sayilar5 = new int [];---//yanlis tanimmlama

        int size = 10;
        int [] sayilar5 = new int[size];

        //Assigning value to Arrays
        int [] sayilar6 = new int[5];

        sayilar6[0] = 7; //1. element
        sayilar6[1] = 5;
        sayilar6[2] = 12;
        sayilar6[3] = 23;
        sayilar6[4] = 45;


        System.out.println( sayilar6[0]);
        System.out.println( sayilar6[1]);
        System.out.println( sayilar6[2]);
        System.out.println( sayilar6[3]);
        System.out.println( sayilar6[4]);

        sayilar6[0] =15;

        System.out.println(sayilar6[0]);

        int i = sayilar6[4];
        System.out.println("i = " + i);
    }
}
