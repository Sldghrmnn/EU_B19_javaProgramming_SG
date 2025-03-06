package day36_Review;

import java.util.ArrayList;
import java.util.Collections;

public class C06_RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("John");
        names.add("Smith");
        names.add("John");
        names.add("Smith");
        names.add("Mary");
        names.add("Jack");
        names.add("Mary");
        names.add("Smith");
        names.add("John");
        System.out.println("names = " + names);

        System.out.println("removeDuplicate(names) = " + removeDuplicate(names));


    }

    //tekrarr eden isimler silinecek ,teke düsecek...
    // her isim sadece bir kere list'de kalacak
    //bu soruyu sort() da kullanrak yapiniz.

    public static ArrayList<String> removeDuplicate(ArrayList<String> list){
        Collections.sort(list);
        ArrayList<String> uniqList = new ArrayList<>();
        String depo = "";

        for (String name : list ) {
        	if (! name.equals(depo)){
                uniqList.add(name);
                depo = name;
            }
        }
        return uniqList;

    }
}
