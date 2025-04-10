package day55_CollectionReview;

import java.util.*;

public class C05_Maps {
    public static void main(String[] args) {
        /**
         * collections framework'e dahildirler
         * primitive data tipi kabul etmez
         * boyu dinamiktir
         * key'ler unique yani bezersiz olmalidir
         * value'ler duplicate olabilir
         *
         *
         * HashMap : class::key ve value null olabilir; elementler random yerlesir(karisik)
         * LinkedHashMap : key ve value null olabilir; elementler  giris sirasina gore yerkesir
         * TreeMap : key null olamaz,value null olaabilir. elementler siralidir(kucukten buyuge)
         * HashTable : key ve value null olamaz.elemenler random yerlesir
         */

        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(10,"Ali");
        hashMap.put(20,"Ali");
        hashMap.put(30,"Ayla");
        hashMap.put(40,"Esra");
        hashMap.put(null,"Esra");
        hashMap.put(50,"null");
        hashMap.put(null,null);
        hashMap.put(40,"Seyma");

        System.out.println("hashMap = " + hashMap);


        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(50,"null");
        linkedHashMap.put(10,"Ali");
        linkedHashMap.put(20,"Ali");
        linkedHashMap.put(40,"Esra");
        linkedHashMap.put(null,"Esra");
        linkedHashMap.put(null,null);
        linkedHashMap.put(40,"Seyma");
        linkedHashMap.put(30,"Ayla");

        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(50,"null");
        treeMap.put(10,"Ali");
        treeMap.put(20,"Ali");
        treeMap.put(40,"Esra");
       // treeMap.put(null,"Esra");
       // treeMap.put(null,null);
        treeMap.put(40,"Seyma");
        treeMap.put(30,"Ayla");

        System.out.println("treeMap = " + treeMap);

        Map<Integer,String> hashTable = new Hashtable<>();
       // hashTable.put(50,"null");
        hashTable.put(10,"Ali");
        hashTable.put(20,"Ali");
        hashTable.put(40,"Esra");
       // hashTable.put(null,"Esra");
       // hashTable.put(null,null);
        hashTable.put(40,"Seyma");
        hashTable.put(30,"Ayla");
        hashTable.put(100,"Selma");
        hashTable.put(800,"Asli");
        hashTable.put(3,"Ceren");

        System.out.println("hashTable = " + hashTable);
    }
}
