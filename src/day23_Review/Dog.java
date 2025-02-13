package day23_Review;

public class Dog {

    // templater--blueprint--taslak
    // fields---ozellikler

    String ad;
    String cins;
    String renk;
    int yas;
    char cinsiyet;
    boolean evcilMi;

    //actions--methods

    public void havla(){
        System.out.println(ad+" havliyor...");
    }
    public void isir(){
        System.out.println(ad+" isiriyor...");
    }
    public void mamaYe(){
        System.out.println(ad+" mama yiyor...");
    }
    public void suruGut(){
        System.out.println(ad+" suru guduyor...");
    }

}
