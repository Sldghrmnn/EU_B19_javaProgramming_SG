package day38_Constructor_PassingObjects02.okul;

public class Ogrenci {

    String name;
    String sinif;
    int age;
    Adres evAdresi;
    Adres okulAdresi;

    public Ogrenci() {
        this.name="belirtilmemis";
        this.sinif="belirtilmemis";
        this.age=0;
        this.evAdresi= new Adres();
        this.okulAdresi= new Adres();
    }

    public Ogrenci(String name) {
        this(); //Constructor chaining--> calling a constructor from another constructor
        this.name = name;
    }

    public Ogrenci(String name,String sinif, int age) {
        this(name); //Constructor chaining--> calling a constructor from another constructor
        this.sinif = sinif;
        this.age = age;
    }

    public Ogrenci(String name, String sinif, int age, Adres evAdresi, Adres okulAdresi) {
        this.name = name;
        this.sinif = sinif;
        this.age = age;
        this.evAdresi = evAdresi;
        this.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name = '" + name + '\'' +
                ", sinif = '" + sinif + '\'' +
                ", age = " + age +
                ", evAdresi = " + evAdresi +
                ", okulAdresi = " + okulAdresi +
                '}';
    }
}


