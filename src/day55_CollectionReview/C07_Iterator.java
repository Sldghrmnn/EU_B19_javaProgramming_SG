package day55_CollectionReview;

import java.util.*;

public class C07_Iterator {
    public static void main(String[] args) {
        List<String> adlar = new ArrayList<>(Arrays.asList("Samet","Suna","Adem","Feride"));

        Iterator<String> adlarIterator = adlar.iterator();
       /*
        adlarIterator.hasNext();
        adlarIterator.next();
        adlarIterator.hasNext();
        adlarIterator.next();
        adlarIterator.hasNext();
        adlarIterator.next();
        System.out.println("adlarIterator.hasNext() = " + adlarIterator.hasNext());
        adlarIterator.next();
        System.out.println("adlarIterator.hasNext() = " + adlarIterator.hasNext());
        adlarIterator.next();

        */

        while (adlarIterator.hasNext()){
            System.out.println("adlarIterator.next() = " + adlarIterator.next());
        }

        System.out.println("adlarIterator.hasNext() = " + adlarIterator.hasNext());//false

        System.out.println("--------MAP---------");

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        System.out.println("students.get(\"Ali\") = " + students.get("Ali"));

        Iterator<String> keyIterator = students.keySet().iterator();
        Iterator<Integer> valueIterator = students.values().iterator();

        while (keyIterator.hasNext()){
            String next = keyIterator.next();
            System.out.println(next + " : " + students.get(next));
        }

        while (valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
