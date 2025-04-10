package day55_CollectionReview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class C10_Java8_ForEachMethod {
    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Almanya","Fransa","Ispanya","Türkiye");

        countries.forEach(e -> System.out.println(e));

        countries.forEach(e ->{
            if (e.startsWith("A")){
                System.out.println(e);
            }
        });

        System.out.println("----------------------------------");

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        students.forEach((k,v)->System.out.println(k+"-->"+v));

        System.out.println("----------------------------------");

        students.forEach((k,v)->{
            if (k.substring(k.length()-1).equals("t")){
                System.out.println(k+" --> "+v);
            }
        });
    }
}
