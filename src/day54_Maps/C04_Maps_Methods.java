package day54_Maps;

import java.util.HashMap;
import java.util.Map;

public class C04_Maps_Methods {
    public static void main(String[] args) {

        Map<String,String> capitalCities = new HashMap<>();
        //capitalCities.put(key,value);
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("TURKIYE","Ankara");

        //ayni key eklenmek istendiginde ,var olan value ile degistirilir
        capitalCities.put("TURKIYE","Istanbul");
        System.out.println("capitalCities = " + capitalCities);

        //key vererek elementi cikarma
        capitalCities.remove("TURKIYE");
        System.out.println("capitalCities = " + capitalCities);

        //key ile value cagirma
        capitalCities.get("USA");
        System.out.println("capitalCities.get(\"USA\") = " + capitalCities.get("USA"));

        // bu key map icerisinde tanimli ise ekleme,
        // tanimli degil ise ekle
        // if key does not exist, returns null
        System.out.println("capitalCities.putIfAbsent(\"TURKIYE\",\"Ankara\") = " + capitalCities.putIfAbsent("TURKIYE", "Ankara"));
        System.out.println("capitalCities = " + capitalCities);
        // key var ise, returns value
        System.out.println("capitalCities.putIfAbsent(\"TURKIYE\",\"Istanbul\") = " + capitalCities.putIfAbsent("TURKIYE", "Istanbul"));
        System.out.println("capitalCities = " + capitalCities);

        //if exsist,return true
        System.out.println("capitalCities.containsKey(\"TURKIYE\") = " + capitalCities.containsKey("TURKIYE"));//true
        //if does not exist,returns false
        System.out.println("capitalCities.containsKey(\"Nigeria\") = " + capitalCities.containsKey("Nigeria"));//false

        //if exsist,return true
        System.out.println("capitalCities.containsValue(\"Ankara\") = " + capitalCities.containsValue("Ankara"));

        //if does not exist,returns false
        System.out.println("capitalCities.containsValue(\"London\") = " + capitalCities.containsValue("London"));

        //to print all key
        System.out.println("capitalCities.keySet() = " + capitalCities.keySet());

        // to print all value
        System.out.println("capitalCities.values() = " + capitalCities.values());


        //butun elementleri cikarma
        capitalCities.clear();
        System.out.println("capitalCities = " + capitalCities);
    }
}
