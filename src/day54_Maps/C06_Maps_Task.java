package day54_Maps;

import java.util.HashMap;
import java.util.Map;

public class C06_Maps_Task {
    /**
     * String[] words = {"apple","banana","avacado","orange","banana","apple","banana","cucumber"};
     *
     * yukaridaki array'deki elemanlarin listesini tekrar eden saayilari ile yazdiriniz
     *
     * apple:2
     * banana:3
     * avacado:1
     * cucumber:1
     * orange:1
     */

    public static void main(String[] args) {

        String[] words = {"apple","banana","avacado","orange","banana","apple","banana","cucumber"};

        Map<String,Integer> meyveler = new HashMap<>();

        for (String meyve :words ) {
            //map'in icinde bu meyve varsa ,value'sini 1 arttir(hint: containsKey())
            if (meyveler.containsKey(meyve)){
                meyveler.put(meyve,(meyveler.get(meyve)+1));

            }else {
                meyveler.put(meyve,1);
            }
            //yoksa, map'e ekle, key:meyve ,  value :1

        }
        for (Map.Entry<String,Integer> entry : meyveler.entrySet()){
            System.out.println("entry.getKey() = " + entry.getKey());
        }
        System.out.println("meyveler = " + meyveler);

    }
}
