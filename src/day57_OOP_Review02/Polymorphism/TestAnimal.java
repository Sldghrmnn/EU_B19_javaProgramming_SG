package day57_OOP_Review02.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {
    public static void main(String[] args) {

        RiverFish riverFish=new RiverFish();

        System.out.println("riverFish.color = " + riverFish.color);//rengi belli degil
        System.out.println("riverFish.name = " + riverFish.name);//River fish
        System.out.println("riverFish.gender = " + riverFish.gender);//belirtilmemis

        System.out.println("-------");

        riverFish.kilcik();//cok kilcikli olurlar
        riverFish.beslenme();//tatli suda beslenirler
        riverFish.water();// tatli suda yasar
        riverFish.hareket();// yuzerler
        riverFish.solunum();//solungac solunumu yaparlar
        System.out.println("------------------");

        Fish fish=new RiverFish();

        System.out.println("fish.name = " + fish.name);//animals
        System.out.println("fish.color = " + fish.color);//rengi belli degil
        System.out.println("fish.gender = " + fish.gender);//belirtilmemis
        System.out.println("------------------");

        fish.water();//tatli suda yasar
        fish.hareket();//yuzerler
        fish.solunum();//solungac solunumu yaparlar
        fish.beslenme();//tatli suda beslenirler
        //fish.kilcik()  CTE

        System.out.println("------------------------");

        System.out.println("(fish instanceof RiverFish) = " + (fish instanceof RiverFish));//true
        System.out.println("(fish instanceof Fish) = " + (fish instanceof Fish));     //true
        System.out.println("(fish instanceof Animals) = " + (fish instanceof Animals));// true

        System.out.println("(riverfish instanceof RiverFish) = " + (riverFish instanceof RiverFish));// true
        System.out.println("(riverfish instanceof Fish) = " + (riverFish instanceof Fish)); //true
        System.out.println("(riverfish instanceof Animals) = " + (riverFish instanceof Animals)); // true

        System.out.println("( fish instanceof SeaFish) = " + (fish instanceof SeaFish));// false

        Integer sepetUrunSayisi=10;

        System.out.println("(sepetUrunSayisi instanceof Integer) = " + (sepetUrunSayisi instanceof Integer));//true
        System.out.println("(sepetUrunSayisi instanceof Number) = " + (sepetUrunSayisi instanceof Number));//true


        System.out.println("---------------------------------------------");

        System.out.println("fish.getClass() = " + fish.getClass()); //class day57_OOP_Review02.Polymorphism.RiverFish
        System.out.println("fish.getClass().getSimpleName() = " + fish.getClass().getSimpleName()); //RiverFish
        System.out.println("fish.getClass().getName() = " + fish.getClass().getName());  //day57_OOP_Review02.Polymorphism.RiverFish

        System.out.println("---------------------------------------------");


        System.out.println("fish.getClass().getConstructors().length = " + fish.getClass().getConstructors().length);// 1
        System.out.println("sepetUrunSayisi.getClass().getConstructors().length = " + sepetUrunSayisi.getClass().getConstructors().length);// 2

        String str="String";
        System.out.println("str.getClass().getConstructors().length = " + str.getClass().getConstructors().length); //15


    }
}
