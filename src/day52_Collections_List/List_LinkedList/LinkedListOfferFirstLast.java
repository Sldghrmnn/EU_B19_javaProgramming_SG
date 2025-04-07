package day52_Collections_List.List_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOfferFirstLast {
    public static void main(String[] args) {
        System.out.println("LinkedList offerFirst() and offerLast() methods.");
        List<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");

        System.out.println("Original list : " + list);

        //System.out.println(((LinkedList<String>) list).offerFirst("Blue"));

        //List interface does not have offerFirst() and offerLast() methods but  LinkedList has.
        //Therefore, in order to call these methods the object has to be down-casted
        // Add an element to front of LinkedList- if the element added successfully returns true
        if (((LinkedList<String>) list).offerFirst("Blue")) {
            System.out.println("\"Blue\" listeye eklendi.");
        } else System.out.println("\"Blue\" listeye eklenemedi.");

        if (((LinkedList<String>) list).offerLast("Yellow")) {
            System.out.println("\"Yellow\" listeye eklendi.");
        } else System.out.println("\"Yellow\" listeye eklenemedi.");
        System.out.println("Updated list : " + list);
    }
}
