package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class C08_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(99,23,15,45,34,235,1,32));
        System.out.println("sayilar.size() = " + sayilar.size());
        System.out.println("sayilar = " + sayilar);


        //How to sort the list by ascending

        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);

        //descending olarak yeni bir array e atayin



        ArrayList<Object> person = new ArrayList<>();
        person.add("Suleyman");
        person.add(1982);
        person.add(67.5);
        person.add(false);

        System.out.println("person = " + person);

    }
}
