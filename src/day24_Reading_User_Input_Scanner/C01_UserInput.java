package day24_Reading_User_Input_Scanner;

import java.lang.*;   // import etsem'de, etmesem'de java bunu otomatik gorur
                      // * kullanirsak bir package icindeki butun classlari import eder.

import java.util.Scanner;  // sadece scanner classi import edilir.

public class C01_UserInput {

    public static void main(String[] args) {
        System.out.println("User Input in Java");

        Scanner klavye = new Scanner(System.in);

        System.out.print("Klavyeden isminizi giriniz :  ");
        String name = klavye.nextLine();

        System.out.println("Isminiz : "+name);



    }
}
