package day51_Errors_Exceptions;

public class C04_ExceptionHandling {
    public static void main(String[] args) {

        /**
         * Basic try-catch syntax
         */

        try {
           // codes which are monitored
            //codes that throws exceptions
        } catch (Exception e) {  // hatanin türü ve objeyi verilir
            // Handling the exception
        }

        // run time -- kodu calistirmadan hatayi göremeyiz.
        int sayiA = 35;
        int sayiB = 0;

        System.out.println("Division test is started.");

        int sonuc = 0;
        sonuc = sayiA / sayiB;


        try {
            sonuc = sayiA / sayiB;
        }catch (ArithmeticException e){
            System.out.println("----Hata ismi = " + e.getMessage());
            System.out.println("----Bolme isleminde bir hata olustu");
        } catch (Exception e) {
            e.printStackTrace();
            sayiB = 1;
            sonuc = sayiA/sayiB;
        }

        System.out.println("sonuc = " + sonuc);

        System.out.println("Division test is finished");

        System.out.println("Addition test is started");

        sonuc = sayiA+sayiB;

        System.out.println("sonuc = " + sonuc);

        System.out.println("Addition test is finished");


    }
}
