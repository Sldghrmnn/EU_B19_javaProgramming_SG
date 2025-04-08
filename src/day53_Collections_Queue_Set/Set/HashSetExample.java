package day53_Collections_Queue_Set.Set;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> hashSet= new HashSet<>();
        hashSet.add("Mavi");
        hashSet.add("Yesil");
        hashSet.add("Gritonu");
        hashSet.add("Sari");
        hashSet.add("Mavi"); //duplicate veri  KABUL ETMEZ!!!


        System.out.println("hashSet = " + hashSet);

        //duplicate'leri veri kabul etmez!!!
        //Insertion order is not preserved

        for (String each :hashSet ) {
            System.out.println("each = " + each.hashCode());
        }

    }
}
