package day11_If_Elself_NestedIf;

import java.util.Scanner;

public class C02_HomeWork {
    public static void main(String[] args) {
        /*
        task
        2 adet vize notu alin
        bir adet final notu alın
        vizeler ortalamaya %20 etki ediyor
        final ise %60 etki ediyor
        ortalamayı hesaplayın
        geçme notunu yazdırın


        90 ve uzeri A
        80 ve uzeri B
        70 ve uzeri C
        60 ve uzeri D
        60 alti F
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("1.Vize notunu giriniz : ");
        double vize1=scanner.nextDouble();
        System.out.println("2.Vize notunu giriniz : ");
        double vize2=scanner.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double finalNotu=scanner.nextDouble();

        double ortalama=vize1*0.2+vize2*0.2+finalNotu*0.6;

        System.out.println("ortalama = " + ortalama);

        if (ortalama>=90 && ortalama<=100){
            System.out.println("Gecme notu A ");
        }else if(ortalama>=80 && ortalama<90){
            System.out.println("Gecme notu B ");
        }else if (ortalama>=70 && ortalama<80){
            System.out.println("Gecme notu C ");
        }else if (ortalama>=60 && ortalama<70){
            System.out.println("gecme notu D ");
        }else if (ortalama>=0 && ortalama<60){
            System.out.println("Dersten kaldiniz.Notunuz F ");
        }else{
            System.out.println("Notlari yanlis girdiniz tekrar giriniz ");
        }







    }
}
