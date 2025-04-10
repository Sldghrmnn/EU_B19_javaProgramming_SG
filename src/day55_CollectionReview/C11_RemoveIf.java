package day55_CollectionReview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class C11_RemoveIf {
    public static void main(String[] args) {

        List<String> countries = Arrays.asList("Almanya","Fransa","Ispanya","Türkiye");

        System.out.println(countries);

        countries.removeIf(x -> x.charAt(0)=='A');
        System.out.println(countries);

        System.out.println("-------------------------");

        Map<String,Integer> students = new LinkedHashMap<>();
        students.put("Ali",70);
        students.put("Aliye",90);
        students.put("Fatih",65);
        students.put("Serpil",100);
        students.put("Umut",70);

        Map<String,Integer> goodStudents = new LinkedHashMap<>();

        students.forEach((k,v)->{
            if (v > 80){
                goodStudents.put(k,v);
            }
        });
        System.out.println("goodStudents = " + goodStudents);

      // students.values().removeIf(v-> v < 80);

        students.keySet().removeIf(k -> k.startsWith("A"));

        System.out.println("students = " + students);


    }
}
