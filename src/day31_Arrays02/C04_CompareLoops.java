package day31_Arrays02;

import java.util.Arrays;
import java.util.Scanner;

public class C04_CompareLoops {
    public static void main(String[] args) {
        int [] sayilar = {1,2,3,4,5};

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("-----------------------------------");

        for (int sayi :sayilar) {
            System.out.println(sayi);
        }

        System.out.println("------------------------------------");

        // fori loop ile terrsten elemanlari alip manupule edebiliriz ancak ForEach loop ile bunu yapamayiz!

        for (int i = sayilar.length-1; i >=0 ; i--) {
            System.out.println(sayilar[i]);
        }

        System.out.println("Alisveris sepeti");
        String [] sepet = new String[5];
        Scanner sc = new Scanner(System.in);

     /*   bu method ile array'in icini dolduramayiz
        for (String urun :sepet ) {
        	urun = sc.nextLine();
        }
     */

        for (int i = 0; i < sepet.length; i++) {
            sepet[i]= sc.nextLine();
           // System.out.println(sepet[i]);
        }

       // System.out.println(Arrays.toString(sepet));
        for (String urun :sepet ) {
            System.out.println(urun);
        }


    }
}
