package day54_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C05_Maps_Loops {
    public static void main(String[] args) {

        Map<String,String> capitalCities = new HashMap<>();
        //capitalCities.put(key,value);
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("TURKIYE","Ankara");

        //key'leri yazdiralim
        //method 1
        System.out.println("capitalCities.keySet() = " + capitalCities.keySet());

        //method 2
        Set<String> countries = capitalCities.keySet();
        for (String country :countries ) {
            System.out.println("country = " + country);
        }

        for (String country :capitalCities.keySet() ) {
            System.out.println("country = " + country);
        }


        //value'lari yazdiralim
        //method 1
        System.out.println("capitalCities.values() = " + capitalCities.values());

        //method 2
        Collection<String> capitals = capitalCities.values();
        for (String capitalCity :capitals ) {
            System.out.println("capitalCity = " + capitalCity);
        }

        for (String capitalCity :capitalCities.values() ) {
            System.out.println("capitalCity = " + capitalCity);
        }

        for (Map.Entry<String,String> entry : capitalCities.entrySet()){
            //entry=obje =(norway,oslo)
            System.out.println("entry.getKey() = " + entry.getKey());//norway,usa,germany,turkiye
            System.out.println("entry.getValue() = " + entry.getValue());//oslo,washington,berlin,ankara
        }



    }
}
