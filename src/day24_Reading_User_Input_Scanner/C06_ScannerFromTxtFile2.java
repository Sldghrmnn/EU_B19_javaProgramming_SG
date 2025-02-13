package day24_Reading_User_Input_Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C06_ScannerFromTxtFile2 {

        public static void main(String[] args)throws FileNotFoundException {

            File file = new File("src/day24_Reading_User_Input_Scanner/Scanner.txt");

            Scanner sc = new Scanner(file);

            // toplami saklamak icin bir variable tanimlayalim
            int toplam = 0;

            while (sc.hasNext()){
                if(sc.hasNextInt()){
                    int sayi = sc.nextInt();
                    toplam += sayi;
                    System.out.println("Sayi bulundu : "+sayi);
                }else {
                    String satir = sc.nextLine();
                    System.out.println(sc.next());
                }
                System.out.println("toplam ="+toplam);
            }
        }

}
