package day55_CollectionReview;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C09_ListIterator {
    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Almanya","Fransa","Ispanya","Türkiye");

        ListIterator<String> listIterator = countries.listIterator();

        while (listIterator.hasNext()){
            System.out.println("listIterator.next() = " + listIterator.next());
        }

        while (listIterator.hasPrevious()){
            System.out.println("listIterator.hasPrevious() = " + listIterator.hasPrevious());
        }
    }
}
