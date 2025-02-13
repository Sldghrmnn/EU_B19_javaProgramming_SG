package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C04_ScannerProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yasinizi giriniz : ");
        //25 + enter \n
        int age = input.nextInt();

        input.nextLine(); // nextint() ve diger next metodlarindan sonra klavye on bellegi temizlenmeden
        //String deger girisi yapilirsa, son giris degeri \n oldugu icin deger String'e atanir
        // yeni deger alamaz...

        System.out.print("Adinizi giriniz : ");
        String name = input.nextLine();

        System.out.println("Adiniz : "+name+" Yasiniz : "+age);

        System.out.print("Adinizi tekrar giriniz : ");
         name = input.nextLine();

        System.out.println("Adiniz : "+name+" Yasiniz : "+age);
    }
}
