package day41_Review.constructors;

public class Deneme1 {
    String isim = "JD";
    int yas = 40;

    public Deneme1() {
        String isim = "Olcay";
        System.out.println("isim = " + isim);
    }

    public Deneme1(String isim) {
        this.yas = 40;
        System.out.println("isim = " + isim);
    }

    public Deneme1(String isim, int yas) {
        this("Murat");
        this.yas = 45;
    }

    public void Deneme1() {
        System.out.println(isim);
    }

    public static void main(String[] args) {
        Deneme1 obj1 = new Deneme1("Esra");
    }
}
