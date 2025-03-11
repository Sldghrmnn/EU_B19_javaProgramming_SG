package day39_Encapsulation_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private int sifre;

    private Adres evAdresi;
    private Adres isAdresi;
    private Adres okulAdresi;

    private ArrayList<Adres> adresler;

    public Person() {
    }

    public Person(String name, int age, Adres evAdresi, Adres isAdresi, Adres okulAdresi, ArrayList<Adres> adresler) {
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
        //this.evAdresi = evAdresi;
        setEvAdresi(evAdresi);
        //this.isAdresi = isAdresi;
        setIsAdresi(isAdresi);
        //this.okulAdresi = okulAdresi;
        setOkulAdresi(okulAdresi);
        setAdresler(adresler);
        //this.adresler = adresler;
    }

    public String getName() {
        Scanner scanner=new Scanner(System.in);
        int count=3;
        for (int i = 0; i < count; i++) {
            System.out.println("Lütfen şifre giriniz");
            int sifre=scanner.nextInt();
            if (sifre== this.sifre){
                return name;
            }
        }
        return "3 defa giriş hakkınız dolmuştur. kart Bloke Bankaya başvur.";
    }

    public void setName(String name) {
        name=name.trim();

        if (name.length()>=3 && name.length()<30){
            this.name = name;
        }else {
            System.out.println("Kurallara uygun bir isim girmediniz");
            this.name= "isimsiz";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age>0 && age <120){
            this.age = age;
        }

    }

    public Adres getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(Adres evAdresi) {
        this.evAdresi = evAdresi;
    }

    public Adres getIsAdresi() {
        return isAdresi;
    }

    public void setIsAdresi(Adres isAdresi) {
        this.isAdresi = isAdresi;
    }

    public Adres getOkulAdresi() {
        return okulAdresi;
    }

    public void setOkulAdresi(Adres okulAdresi) {
        this.okulAdresi = okulAdresi;
    }

    public ArrayList<Adres> getAdresler() {
        return adresler;
    }

    public void setAdresler(ArrayList<Adres> adresler) {
        this.adresler = adresler;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", evAdresi=" + evAdresi +
                ", isAdresi=" + isAdresi +
                ", okulAdresi=" + okulAdresi +
                ", adresler=" + adresler +
                '}';
    }
}
