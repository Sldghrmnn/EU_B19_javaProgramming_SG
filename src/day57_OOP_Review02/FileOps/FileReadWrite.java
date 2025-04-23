package day57_OOP_Review02.FileOps;

import day57_OOP_Review02.ClassRelationShip.Driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args)  {

        String dosya = "Dosya.txt";

        PrintWriter printWriter= null;
        Scanner scanner= null;

          try {
              printWriter = new PrintWriter(new FileOutputStream(dosya,true));

           //   printWriter.println("1.satir bilgileri");
           //   printWriter.println("2.satir bilgileri");
          //    printWriter.println("3.satir bilgileri");
          //    printWriter.println("4.satir bilgileri");

              scanner = new Scanner(System.in);
           // System.out.println("Dosyaya yazdirmak istediklerini yazabilirsin");
           //   String text = scanner.nextLine();

           //   printWriter.println(text);

              Driver driver = new Driver("Elif Seven","B");

              String name = driver.getName();
              String licenceClass = driver.getLicenceClass();
              printWriter.println(name);
              printWriter.println(licenceClass);


          } catch (FileNotFoundException e) {
              System.out.println("Dosya bulunamadi");
              e.getMessage();
          }
          finally {
              if (printWriter != null){
                  printWriter.close();
              }
              scanner.close();
          }


    // txt dosyasindan  veri okuma

        Scanner dosyaOku=null;

        try {
          dosyaOku= new Scanner(new File(dosya));
            System.out.println("Dosya okunuyor...");
            while (dosyaOku.hasNext()){

                System.out.println(dosyaOku.nextLine());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if (dosyaOku != null){
                dosyaOku.close();
            }
        }


    }
}
