package day17_DDoWhileLoops;

import java.util.Scanner;

public class C06_SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int randomSayi=43;
        int giriilenSayi=0;

        do {
            System.out.print("Lutfen 1-100 araliginda bir sayi giriniz : ");
            giriilenSayi=scanner.nextInt();
        }while (giriilenSayi != randomSayi);

/**
 * eger kosulda kullanilan input,belirli degilse ,ve code calisinca elde edilecekse do-while kullanilir.
 */
        System.out.println("------------------------------------\n");

            System.out.println("Lutfen 1-100 araliginda bir sayi giriniz : ");
            giriilenSayi=scanner.nextInt();
        while (giriilenSayi != randomSayi);{
            System.out.println("Lutfen 1-100 araliginda bir sayi giriniz : ");
            giriilenSayi=scanner.nextInt();

        }









    }
}
