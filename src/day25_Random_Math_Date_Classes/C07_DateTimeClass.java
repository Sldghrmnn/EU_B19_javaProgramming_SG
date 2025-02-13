package day25_Random_Math_Date_Classes;

import java.time.*;
import java.util.Date;

public class C07_DateTimeClass {
    public static void main(String[] args) throws InterruptedException {

        Date date = new Date();
        Thread.sleep(1000);
        Date date1 = new Date();
        System.out.println("date.getTime() = " + date.getTime()); // 1 Ocak 1970'den bu yana gecen saniye

        long time = date.getTime();
        System.out.println("time = " + time);

        long time2 = date.getTime();
        System.out.println("time2 = " + time2);

        if (time2>time){
            System.out.println("time2 daha sonra olusturuldu");
        }

        LocalDate tarih = LocalDate.now(); // simdi
        System.out.println("tarih = " + tarih);

        //belirli tarih girmek icin
        LocalDate tarih2 = LocalDate.of(2000,1,1);
        System.out.println("tarih2 = " + tarih2);

        LocalDate tarih3 = LocalDate.of(2000, Month.DECEMBER,1);
        System.out.println("tarih3 = " + tarih3);

        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek()); // haftanin gunu
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth()); // han gi ay
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear()); // yilin kacinci gunu.
        System.out.println("tarih.plusMonths(3) = " + tarih.plusMonths(3));//ay ekleme

        System.out.println("-------------------");

        LocalTime zaman = LocalTime.now();
        System.out.println("zaman = " + zaman);

        // bellirli saati girelim
        LocalTime zaman2 = LocalTime.of(21,58,32);
        LocalTime zaman3 = LocalTime.of(23,58,32);
        System.out.println("zaman2 = "+zaman2);

        System.out.println("zaman.minusHours(2) = " + zaman.minusHours(2));

        System.out.println("LocalTime.now(ZoneId.of(\"Turkey\")) = " + LocalTime.now(ZoneId.of("Turkey")));
        System.out.println("LocalTime.now(ZoneId.of(\"Europe/London\")) = " + LocalTime.now(ZoneId.of("Europe/London")));


        System.out.println("zaman.isBefore(zaman3) = " + zaman.isBefore(zaman3));//true
        System.out.println("zaman.isAfter(zaman3) = " + zaman.isAfter(zaman3));//false

        System.out.println("zaman3.compareTo(zaman) = " + zaman3.compareTo(zaman));
        // once olunca 1,sonra olunca -1,ayni olunca 0

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("ldt = " + ldt);


    }
}
