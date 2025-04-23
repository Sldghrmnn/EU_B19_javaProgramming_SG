package day57_OOP_Review02.Polymorphism;

public class Animals {

    String name= "Animals";
    String color;
    String gender="Belirtilmemis";

    void hareket(){System.out.println("Hareket ederler");}

    void solunum(){System.out.println("Nefes alirlar");}

    void beslenme(){System.out.println("Beslenirler");}

    protected int isim(){
        System.out.println("isim");
        return 5;
    }
}
