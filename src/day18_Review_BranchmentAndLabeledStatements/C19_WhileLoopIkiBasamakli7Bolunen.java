package day18_Review_BranchmentAndLabeledStatements;

import java.util.Scanner;

public class C19_WhileLoopIkiBasamakli7Bolunen {
    public static void main(String[] args) {

// Soru 1- While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin.


                int sayi = 10;
                while (sayi <= 99){
                    if (sayi % 7 == 0){
                        System.out.println("sayi = " + sayi);
                    }
                    sayi +=1;
                }
        System.out.println("--------------------------------------------------");
// Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi1 = input.nextInt();
        int toplam = 0;

        while (sayi1 > 0){
            toplam += sayi1 %10;
            sayi1 /= 10;

        }
        System.out.println("rakamlarin toplami :" + toplam);

        System.out.println("-----------------------------------------------------------");
//Soru 3- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin. Kullaniciya bitirmek istediginde 0'a basmasini soyleyin. Kullanici bitirmek istediginde
//toplam kac adet pozitif tam sayi girdiginive bunlarin toplaminin kac oldugunu yazdirin. Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz
//" yazdirin, bu negatif sayiyi sayi adedine ve toplama eklemeyin

        Scanner scanner=new Scanner(System.in);
        int toplam1 =0;
        int sayac =0;
        int sayi2;
        System.out.println("Lutfen pozitif tam sayilari girin (Bitirmek icin 0'a basiniz) : ");

        while (true){
            System.out.print("Sayi giriniz : ");
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                break;
            }else if (sayi2 < 0){

                System.out.println("Negatif sayi kullanamazsiniz !!!");
                continue;
            }
            toplam1 += sayi2;
            sayac++;
        }

        System.out.println("Girilen sayilarin toplami : " + toplam1);
        System.out.println("Girilen pozitif sayi adedi : " +sayac);
        scanner.close();




    }
}
