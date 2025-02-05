package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C21_TamKare {
    public static void main(String[] args) {

  //  Soru 5- Kullanicidan bir pozitif sayi isteyin, verilen sayı tam kare değilse kullanıcı sayı girmeye devam etsin
  // tam kare ise : “Girilen sayı 2 sayısının tam karesidir.” yazdırsın..
  //  Ornek : input : 16,  output : Girilen sayı 4 sayısının tam karesidir.

        //1.secenek
        Scanner input=new Scanner(System.in);

//        while (true){
//            int sayi =input.nextInt();
//            if (sayi == (int) Math.sqrt(sayi) *  Math.sqrt(sayi)){
//                System.out.println("Sayi "+ (int) Math.sqrt(sayi) +" sayisinin tam karesidir.");
//               break;
//            }else {
//                System.out.println("Girilen sayi tam kare degildir.");
//           }
//       }


        // 2.secenek
        while (true){
            System.out.println("Lutfen bir sayi giriniz :");
            int sayi = input.nextInt();

            for (int i = 1; i <sayi ; i++) {
                if (i*i == sayi){
                    System.out.println("Sayi" +i+" sayisinin tam sayisidir.");
                }
            }
            System.out.println("Girilen sayi tam kare degildir.");
        }

    }
}
