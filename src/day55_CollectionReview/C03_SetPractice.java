package day55_CollectionReview;

import java.util.*;

public class C03_SetPractice {
    public static void main(String[] args) {

        //setler duplicate veri kabul etmez(ayni veriyi iki kere kabul etmez)
        // setlerde veriye index ile erisim yoktur


        Set<Integer> hashSet = new HashSet<>();
        //icine veriyi random yerlestirir
        hashSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));

        System.out.println("hashSet = " + hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        //icine veriyi sirayla yerlestirir
        linkedHashSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>();
        //icine veriyi kucukten buyuge yerlestirir
        treeSet.addAll(Arrays.asList(100,2,0,25,-3,25,3,21,25));
        System.out.println("treeSet = " + treeSet);

        for (Integer aranan : linkedHashSet ) {
        	if (aranan == 25){
                System.out.println("bulundu");
            }
        }

        ArrayList<String> countries = new ArrayList<>(){
            {
                add("Turkiye");
                add("Turkiye");
                add("Almanya");
                add("Isvec");
            }
        };
        System.out.println("countries = " + countries);

        Set<String> countrySet = new HashSet<>(countries);
        System.out.println("countrySet = " + countrySet);

        countrySet.add("Almanya");// iceriisinde varsa.... yuzden false doner element i eklemez
        countrySet.add("Rusya");  // yoksa... truee doner ve elementi ekler


        System.out.println("countrySet = " + countrySet);


    }
}
