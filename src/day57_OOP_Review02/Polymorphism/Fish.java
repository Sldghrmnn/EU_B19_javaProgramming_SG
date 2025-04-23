package day57_OOP_Review02.Polymorphism;

public class Fish extends Animals {

    String color="Rengi belli degil";

    void hareket(){System.out.println("Yuzerler");}

    void solunum(){System.out.println("Solungac solunumu yaparlar");}

    void water(){System.out.println("Suda yasarlar");}

    public int isim(){
        System.out.println("isim");
        return 0;
    }
}
