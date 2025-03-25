package day46_AccessModifiers.PackageA;

import day46_AccessModifiers.Constructor.Ogrenci;

public class OgrenciTestInheritance extends Ogrenci {

    public OgrenciTestInheritance(String name, String lastName) {super(name, lastName);}



    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci();
        OgrenciTestInheritance ogrenci1 = new OgrenciTestInheritance("Yasemin","Baran");
        System.out.println(ogrenci1.getName());


    }
}
