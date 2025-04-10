package day55_CollectionReview;

import java.util.*;

public class C06_MapMethods {
    public static void main(String[] args) {

        //put(key,value): map'e element ekler
        //get(key) : key anahtarinin value degerini doner
        //replace(key,value): verilen key'in degerini degistirir
        //remove(key): bu key'e ait girdiyi siler
        //containsKey(key): map'te boyle bir key varsa true doner
        //containsValue(value): map'te boyle bir value varsa true doner
        // isEmpty(): map bos ise tru doner
        //equals(baska map): iki map ayni ise true doner
        //clear(): map.i elementlerini siler

        //---------
        //keySet() //key.lereden olusan bir set doner
        //values() // valuelerden olusan bir collections doner
        //entrySet()// key: value cift halinde doner


        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        System.out.println("students.entrySet() = " + students.entrySet());

        System.out.println("students = " + students);
        System.out.println("students.keySet() = " + students.keySet());
        System.out.println("students.values() = " + students.values());
        Collection<Integer> values = students.values();
        System.out.println("values = " + values);

        List<Integer> list = new ArrayList<>(values);

      //  for (Integer i :values ) {
        //	list.add

        System.out.println("list = " + list);

        System.out.println("students.get(\"Serpil\") = " + students.get("Serpil"));

        System.out.println("students.size() = " + students.size());

        students.remove("Serpil");

        System.out.println("students = " + students);

        System.out.println("students.containsKey(\"Ali\") = " + students.containsKey("Ali"));//true
        System.out.println("students.containsValue(55) = " + students.containsValue(55));//faalse

        students.replace("Ali",100);
        System.out.println("students = " + students);
        students.put("Ali",99);
        System.out.println("students = " + students);


    }
}
