package day35_ArrayList;

import java.util.ArrayList;

public class C06_EqualsMethod {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println("list1 = " + list1);

        ArrayList<String> month = new ArrayList<>();
        month.add("Feb");
        month.add("Jan");
        month.add("Mar");
        month.add("Apr");
        month.add("May");

        System.out.println("month = " + month);

        if (month.equals(list1)){
            System.out.println("Her iki liste esittir");
        }else {
            System.out.println("Listeler farklidir");
        }


        System.out.println("month.containsAll(list1) = " + month.containsAll(list1));

        /*

        if (month.equals(list1)){
            System.out.println("Her iki list eşittir");
        }else {
            System.out.println("Listeler farklıdır");
        }

        month.add("Jun");

        if (month.equals(list1)){
            System.out.println("Her iki list eşittir");
        }else {
            System.out.println("Listeler farklıdır");
        }
         */
    }
}
