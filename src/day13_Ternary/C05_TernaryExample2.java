package day13_Ternary;

import java.util.Scanner;

public class C05_TernaryExample2 {
    public static void main(String[] args) {
    //klavyeden bir kisinin adini ve yasini alalim
    // eger yasi 18 ve esit ve buyukse name+"oy kullanabilirsiniz" mesaji verelim
    // eger yasi 18 den kucukse name+ "oy kullanma hakkiniz yoktur ! mesaji verelim

        Scanner veriGir=new Scanner(System.in);

        String name;
        int age;
        System.out.println("Lutfen adinizi giriniz : ");
        name =veriGir.nextLine();

        System.out.println("Lutfen yasinizi giriniz : ");
        age= veriGir.nextInt();

        String mesaj = (age >= 18)?name +" oy kkullanabilirsiniz ." : name + " oy kullanma hakkiniz yoktur.";

        System.out.println("mesaj = " + mesaj);


    }
}
