package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C09_AgeVerification {
    public static void main(String[] args) {
        // while
        // 0'dan kucuk 100'den buyuk yas giriginde ,tekrar yas giriniz mesaji veren loop yapalim
        // yas 0-100 arasinda oluunca loop sonlansin

        Scanner input = new Scanner(System.in);
       int age;
       while (true){
           System.out.print("Yasinizi giriniz : ");
           age = input.nextInt();
           if (age > 0 && age <= 100)
               break;
       }
        System.out.println("Yasiniz : "+age);


    }
}
