package day36_Review;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class C07_BigInteger {
    public static void main(String[] args) {

        System.out.println("-------------BigInteger-------------------------------");
        BigInteger bigInteger = new BigInteger("2222222221525644546565464565465465425352755555555553335543453453543543543552288822");
        // siniri yok icine isteiginiz kadar yazabilirsiniz
        // ancak,mutlaka string olarak kullanilir

        System.out.println(bigInteger);

        BigInteger sonuc = new BigInteger("0");

        sonuc = bigInteger.multiply(bigInteger);
        System.out.println("sonuc = " + sonuc);

       bigInteger = bigInteger.add(new BigInteger("22252222222222222222222222525"));

        System.out.println("bigInteger = " + bigInteger);

        System.out.println("-----BigDecimal-(hassasiyetle ondalikli sayilarli hesaplama--------");

        BigDecimal bigDecimal = new BigDecimal("2252275.222222287522258745558");

        BigDecimal result = bigDecimal.divide(BigDecimal.valueOf(5),25,RoundingMode.UP);//divide=bolme islemi yapar
        System.out.println("result = " + result);

        //ikili sayi sistemindeki bir sayinin desimal degeri

        BigInteger bg  = new BigInteger("1010",2);
        System.out.println("bg = " + bg);

        BigInteger hexBG = new BigInteger("2A",16);
        System.out.println("hexBG = " + hexBG);

    }
}
