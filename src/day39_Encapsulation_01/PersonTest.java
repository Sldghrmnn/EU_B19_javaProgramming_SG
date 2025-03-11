package day39_Encapsulation_01;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

        Person person= new Person();
        person.setName("    Ali   ");
        //  System.out.println("person.getName() = " + person.getName());

        Adres isadresi = new Adres("ABC Plaza No:123", "Adana","Türkiye");
        System.out.println("isadresi.toString() = " + isadresi.toString());

        ArrayList<Adres> adresler = new ArrayList<>();
        adresler.add(new Adres("1.ABC Plaza No:123", "Adana","Türkiye"));
        adresler.add(new Adres("2.ABC Plaza No:123", "Adana","Türkiye"));

        person.setAdresler(adresler);

        System.out.println("person.toString() = " + person.toString());

        person.setSifre(1234);
        System.out.println("person.getSifre() = " + person.getSifre());
        System.out.println("person.getName() = " + person.getName());


    }
}
