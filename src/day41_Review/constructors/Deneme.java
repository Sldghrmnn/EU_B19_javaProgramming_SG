package day41_Review.constructors;

public class Deneme {
    String isim="John Do";
    int yas = 40;

    public Deneme(){
        isim="Seher";
        System.out.println("isim = " + isim);
    }
    public Deneme(String isim){
        this();
        this.yas=30;
        System.out.println("isim = " + isim);
    }
    public Deneme(String isim,int yas){
        this("Murat");
        this.yas= 45;

    }

    public static void main(String[] args) {
        Deneme obj1 = new Deneme("Esra");
        Deneme obj2 = new Deneme("Fatih",35);
    }
}
