package day51_Errors_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_MultipleExceptions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Lütfen bir tamsayi giriniz :");
            int sayi = scanner.nextInt();

            System.out.print("Lutfen ikinci bir tamsayi(bolen) giriniz :");
            int bolen = scanner.nextInt();

            int sonuc = sayi/bolen;
            System.out.println("sonuc = " + sonuc);
        }catch (ArithmeticException e){
            System.out.println("Aritmetik islem hatasi olustu");
            System.out.println("'0' a bolunme hatasi");
            System.out.println("Exception class is = " + e.getClass().getSimpleName());
        }catch (InputMismatchException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println("Hata olustu = " + e);
        }finally {
            scanner.close();
            System.out.println("Finally blok her durumda mutlaka calisan bloktur.");
        }

    }
}
