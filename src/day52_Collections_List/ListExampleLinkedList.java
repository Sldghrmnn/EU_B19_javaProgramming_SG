package day52_Collections_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExampleLinkedList {
    public static void main(String[] args) {

        List<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.add("Green");

        System.out.println("colors = " + colors);

        colors.add(6,"Purple");
        System.out.println("colors = " + colors);

        // Indexed for ...loop

        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element index :"+i+"-"+colors.get(i));

            System.out.println();
        }


        // Advanced for ...loop

        for (String eleman :colors ) {
            System.out.println(eleman);
        }

        System.out.println();

        // Internal foreach
        // Lambda---> Anonymous function

        colors.forEach((eleman)-> System.out.println(eleman));

        System.out.println();


        colors.forEach((eleman)-> {
            eleman = eleman.toUpperCase();
            System.out.println(eleman);
        });

        System.out.println("-------------------------------------");


        // Metthod referans
        colors.forEach(System.out::println);

        System.out.println("-------------------------------------");

        Iterator<String> iterator = colors.iterator();
        System.out.println(iterator.next());

/*
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println(iterator.hasNext());

 */

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
    }
}
