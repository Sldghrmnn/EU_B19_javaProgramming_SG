package day14_Review;

import java.util.Scanner;

public class C07_SwitchBeden {
    public static void main(String[] args) {
        /*
        bir program yazin switch yapisini kullanin
        beden numarasi alsin
        small 38,40,42
        medium 44,46,48
        larrrge 50,52,54
        Example output : 50 numara bir large bendendir.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir benden giriniz : ");
        int beden= scanner.nextInt();


      switch (beden){
          case 38,40,42:
              System.out.println(beden+" numara bir small bendendir.");
              break;
          case 44,46,48:
              System.out.println(beden+" numara bir medium bendendir.");
              break;
          case 50,52,54:
              System.out.println(beden+" numara bir large bendendir.");
              break;
          default:
              System.out.println("Elimizde istediginiz beden bulunmamaktadir.");
      }





    }
}
