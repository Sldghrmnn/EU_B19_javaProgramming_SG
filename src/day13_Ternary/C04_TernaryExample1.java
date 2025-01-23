package day13_Ternary;

import java.util.Scanner;

public class C04_TernaryExample1 {
    public static void main(String[] args) {
      // klavyeden bir say (x) girisi yapalim, girilwn sayi 15 den buyukse
      //  diger sayiya (y) 90 deegerini atayalim.
        // degilse 50 degerinni atayalim..

        Scanner sayiGir = new Scanner(System.in);
        int x,y;
        System.out.println("Bir tam sayi giriniz : ");
        x = sayiGir.nextInt();

        y = x >15 ? 90  : 50;
        System.out.println("y = " + y);


    }
}
