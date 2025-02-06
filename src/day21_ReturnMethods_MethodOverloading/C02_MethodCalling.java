package day21_ReturnMethods_MethodOverloading;

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





    }
}
