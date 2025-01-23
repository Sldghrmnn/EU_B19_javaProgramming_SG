package day13_Ternary;

import java.util.Scanner;

public class C12_HomeWork4 {
    public static void main(String[] args) {

 //   Soru 4- Kullanicidan notunu alin 50 veya daha buyukse  notunuz 80 ve ”Sinifi Gectin”,'
 //    50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu giriniz : ");
        int not = scan.nextInt();

      String bilgi = not >= 50 ?" Notunuz " +not+" Sinifi gectiniz ." : "Notunuz" +not+ " Malesef kaldiniz .";
        System.out.println("bilgi = " + bilgi);

    }
}
