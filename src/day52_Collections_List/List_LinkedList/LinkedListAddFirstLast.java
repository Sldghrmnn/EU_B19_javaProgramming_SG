package day52_Collections_List.List_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListAddFirstLast {
    public static void main(String[] args) {
        System.out.println("LinkedList addFirst() and addLast() methods.");
        List<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");

        System.out.println("Original list : " + list);

        //List interface does not have addFirst() and addLast() methods but  LinkedList has.
        //Therefore, in order to call these methods the object has to be down-casted
        if (list instanceof LinkedList<String>) {
            ((LinkedList<String>) list).addFirst("Blue");
            ((LinkedList<String>) list).addLast("Pink");
        }
        System.out.println("Updated list : " + list);
    }
}
