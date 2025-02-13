package day25_Random_Math_Date_Classes;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class C08_DogumGunu {
    public static void main(String[] args) {
        // dogum tarihini girip hangi gun dogdugunuzu bulunuz

        LocalDate dogumTarihi = LocalDate.of(1975,12,27);
        DayOfWeek dogumGunu = dogumTarihi.getDayOfWeek();
        System.out.println("Dogdugunuz gun = "+dogumGunu);
    }
}
