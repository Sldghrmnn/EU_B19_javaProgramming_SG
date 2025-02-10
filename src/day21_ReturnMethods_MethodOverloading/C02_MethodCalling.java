package day21_ReturnMethods_MethodOverloading;

import day20_CustomMethods.C02_CustomMethodpractice;

import java.util.Scanner;

public class C02_MethodCalling {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen Faktoriyeli hesaplanacak sayisi giriniz : ");
        int num = scanner.nextInt();

        if (num <0){
            System.out.println("Lutfen pozitif bir sayi giriniz ");
        }else{
            System.out.println(C01_Faktoriyel.faktoriyel(num));
        }
        C02_CustomMethodpractice.helloWorld5Times();





    }
}
