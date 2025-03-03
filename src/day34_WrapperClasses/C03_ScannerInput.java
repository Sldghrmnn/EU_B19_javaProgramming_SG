package day34_WrapperClasses;

import java.util.Scanner;

public class C03_ScannerInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      /*
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        System.out.println();
        System.out.println("Lütfen adinizi giriniz : ");
        String ad= scanner.nextLine();

        System.out.println(ad+" "+yas+" yasindadir.");

     */
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = Integer.parseInt(scanner.nextLine());

        System.out.println("Lütfen kilonuzu giriniz : ");
       // double kilo = Double.parseDouble(scanner.nextLine());
        double kilo = Double.valueOf(scanner.nextLine());

        System.out.println("Lütfen adinizi giriniz : ");
        String ad= scanner.nextLine();

        System.out.println(ad+" "+yas+" yasindadir.");

    }
}
