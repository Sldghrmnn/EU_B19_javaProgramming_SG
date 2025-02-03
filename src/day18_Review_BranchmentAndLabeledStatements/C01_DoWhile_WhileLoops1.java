package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C01_DoWhile_WhileLoops1 {
    public static void main(String[] args) {
     // kod calistir   /do while örnek...
     //sarta bak -1 kere bakti

     //sarta bak   / while de ornek 1-2. ye gelip teyit etmesi gerekecek
     //kod calistir

     // do-while loop ile verilen sayidan baslayip bbirer azaltarak
     // 3 e kadar olan sayilari yazdiralim.

        Scanner sayiGir=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz : ");
        int sayi=sayiGir.nextInt();

        do {
            System.out.println(sayi);
            sayi--;
        }while (sayi>3);

        System.out.println("Bir tam sayi giriniz : ");
         sayi=sayiGir.nextInt();

         while (sayi>3){
             System.out.println("sayi");
             sayi--;
         }








    }
}
