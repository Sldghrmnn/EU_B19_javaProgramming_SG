package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C03_SayilarinOrtalamasi {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to entr three numbers
        //  kullanicidan 3 adet double turunde sayi girmesini isteyin

        System.out.print("Uc adet double turunde sayi giriniz : ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble(); // degerleri birbirinden ayirmak icin,enter yada space kullanilir.
        double num3 = input.nextDouble();

        // Compute average----ortalama hesapla
        double average = (num1+num2+num3)/3;

        //Display results---  sonuclari goruntule
        System.out.println("The average of "+num1+","+num2+","+num3+" is "+average);

    }
}
