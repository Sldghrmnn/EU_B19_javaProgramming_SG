package day55_CollectionReview;

import java.util.*;

public class C08_Map_EntrySet {
    public static void main(String[] args) {

        Map<Integer,String> hashMap = new HashMap<>();
        ;
        hashMap.put(10,"Ali");
        hashMap.put(20,"Ali");
        hashMap.put(30,"Ayla");
        hashMap.put(40,"Esra");

        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        System.out.println("entrySet = " + entrySet);

        List list = new ArrayList<>(entrySet);
        System.out.println("list.get(0) = " + list.get(0));


    }
}
