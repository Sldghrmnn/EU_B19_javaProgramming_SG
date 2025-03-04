package day35_ArrayList;

import java.util.ArrayList;

public class C04_AddAll {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Mercedes");
        list1.add("BMW");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Jaguar");
        list2.add("Range Rower");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("--------------------------");

        list1.addAll(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println("--------------------------");

        list2.addAll(list1);
        System.out.println(list2);

        System.out.println("-------------------------");

        list2.addAll(1,list1);
        System.out.println(list2);

    }
}
