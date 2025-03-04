package day35_ArrayList;

import java.util.ArrayList;

public class C01_ArrayListIntro {
    public static void main(String[] args) {
        // ArrayList Nesnesi olusturma

        ArrayList<String> names = new ArrayList<>();

       // ArrayList<int> numbers = new ArrayList<int>();-----olmaz,primitive kabul etmez

        ArrayList<Integer> numbers = new ArrayList<>();

        //assigning value to an arrayList (deger atama)

        names.add("Ahmet");
        names.add("Ayse");
        names.add("Selda");
        names.add("Yasemin");

        names.set(1,"Gülden");



        numbers.add(99);
        numbers.add(10);
        numbers.add(56);
        numbers.add(43);
        numbers.add(new Integer(55));
        numbers.add(new Integer("123"));

        //reading value from an ArrayList
        //get()

        System.out.println("names.get(0) = " + names.get(0));
        System.out.println("names.get(1) = " + names.get(1));
        System.out.println("names.get(2) = " + names.get(2));
        System.out.println("names.get(3) = " + names.get(3));

        names.add("Mahmut");
        System.out.println("names.get(4) = " + names.get(4));

       // System.out.println("names.get(5) = " + names.get(5)); //IndexOutOfBoundsException

        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(4) = " + numbers.get(4));
        System.out.println("numbers.get(5) = " + numbers.get(5));

        System.out.println("numbers.get(5)+100 = " + (numbers.get(5) + 100));

        System.out.println("names.size() = " + names.size());
        System.out.println("numbers.size() = " + numbers.size());

        System.out.println("names.toString() = " + names.toString());
        System.out.println("numbers = " + numbers);                //artik bu sekilde yazdirabilirsiniz
        System.out.println("numbers.hashCode() = " + numbers.hashCode());

    }
}
