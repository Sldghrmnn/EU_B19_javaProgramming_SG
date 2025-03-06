package day36_Review;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class C00_ObjectArrayAndArrayList {
    public static void main(String[] args) {


        Object[] arr = {"Ahmet", LocalTime.of(8,28),new Scanner(System.in), LocalDate.of(1975,12,27),"Can",25,35.8};

      for (Object o :arr ) {
      	if (o instanceof String){
            System.out.println("String = " + o);
        } else if (o instanceof Integer) {
            System.out.println("Integer = " + o);
        } else if (o instanceof  Double) {
            System.out.println("Double = " + o);
        } else if (o instanceof Scanner) {
            System.out.print("Metin giriniz : " );
            String s = ((Scanner) o).nextLine();
            System.out.println("Girilen text :  " + s);
        } else if (o instanceof LocalTime) {
            int hour = ((LocalTime) o).getHour();
            System.out.println("Girilen saat =: " + hour);
        } else if (o instanceof LocalDate) {
            DayOfWeek dayOfWeek = ((LocalDate) o).getDayOfWeek();
            System.out.println("Haftanin gunu : " + dayOfWeek);
        }else {
            System.out.println("Tanimlayamayan obje");
        }
      }
        System.out.println("--------------------------------------------------");

        ArrayList<Object> list = new ArrayList<>();
        list.add("Ali");
        list.add(5);
        list.add(LocalDate.of(1453,5,29));
        list.add(true);

        for (Object o :list ) {
            if (o instanceof String){
                System.out.println("String = " + o);
            } else if (o instanceof Integer) {
                System.out.println("Integer = " + o);
            } else if (o instanceof  Double) {
                System.out.println("Double = " + o);
            } else if (o instanceof Scanner) {
                System.out.print("Metin giriniz : " );
                String s = ((Scanner) o).nextLine();
                System.out.println("Girilen text :  " + s);
            } else if (o instanceof LocalTime) {
                int hour = ((LocalTime) o).getHour();
                System.out.println("Girilen saat =: " + hour);
            } else if (o instanceof LocalDate) {
                DayOfWeek dayOfWeek = ((LocalDate) o).getDayOfWeek();
                System.out.println("Haftanin gunu : " + dayOfWeek);
            }else {
                System.out.println("Tanimlayamayan obje");
            }
        }



    }
}
