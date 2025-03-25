package day46_AccessModifiers.PackageA;

import day46_AccessModifiers.Constructor.Ogrenci;

public class OgrenciTest {
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("Irem","Yokus",12);
        System.out.println(ogrenci.getName());
        System.out.println(ogrenci.getNumber());
    }
}
