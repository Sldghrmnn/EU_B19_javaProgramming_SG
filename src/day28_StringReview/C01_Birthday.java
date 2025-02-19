package day28_StringReview;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01_Birthday {
    public static void main(String[] args) {
        // dogum gununuzu belirtilen formata girdiginizde
        //haftanin hangi gunu(montag bis sonntag)dogdugunuzu gosteren kodu yaziniz

        System.out.println("Dogum gununuzu yyyy-MM-dd formatinda giriniz : ");
        Scanner sc = new Scanner(System.in);

        String dateStr = sc.nextLine();


        // direkt herhangi bir tarihi girme
        LocalDate now = LocalDate.now(); //şimdi
        LocalDate pastDate = LocalDate.of(1977,12,25);
        LocalDate futureDate = LocalDate.of(2077,12,25);


        //Girilen stringi Tarih bilgisine dönüştürelim.
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Your birthday "+ dateStr + " is on "+dayOfWeek);

        System.out.println("------------------------");

        System.out.println("Doğum gününüzü dd/MM/yyyy formatında giriniz : ");

        dateStr = sc.nextLine();


        //Girilen stringi Tarih bilgisine dönüştürelim.
        date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        dayOfWeek = date.getDayOfWeek();

        System.out.println("Your birthday "+ dateStr + " is on "+dayOfWeek);

        System.out.println("------------------------");

        System.out.println("Doğum gününüzü dd/MMM/yyyy formatında giriniz : ");

        dateStr = sc.nextLine();

        //Girilen stringi Tarih bilgisine dönüştürelim.
        date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
        dayOfWeek = date.getDayOfWeek();

        System.out.println("Your birthday "+ dateStr + " is on "+dayOfWeek);

        System.out.println("------------------------");

    }
}
