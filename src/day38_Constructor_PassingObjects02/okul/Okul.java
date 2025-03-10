package day38_Constructor_PassingObjects02.okul;

import java.util.ArrayList;

public class Okul {

    String name;
    Adres okulAdres;
    ArrayList<Ogrenci> ogrenciler;

    public Okul() {
        this.name = "belirtilmemis";
        this.okulAdres = new Adres();
        ogrenciler = new ArrayList<>();
    }

    public Okul(String name) {
        this();
        this.name = name;
    }

    public Okul(String name, Adres okulAdresi) {
        this(name);
        this.okulAdres = okulAdresi;
    }


    public Okul(String name, Adres okulAdres, ArrayList<Ogrenci> ogrenciler) {
        this.name = name;
        this.okulAdres = okulAdres;
        this.ogrenciler = ogrenciler;
    }

    public void ogrenciEkle(Ogrenci ogrenci){
        ogrenciler.add(ogrenci);
    }

    @Override
    public String toString() {
        return "Okul{" +
                "name='" + name + '\'' +
                ", okulAdres=" + okulAdres +
                ", ogrenciler=" + ogrenciler +
                '}';
    }



}
