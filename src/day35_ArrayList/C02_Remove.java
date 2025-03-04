package day35_ArrayList;

import java.util.ArrayList;

public class C02_Remove {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());
        System.out.println((nums.size() == 0));

        nums.add(1);
        nums.add(23);
        nums.add(45);
        nums.add(12);
        nums.add(34);
        nums.add(27);
        nums.add(245);

        System.out.println(nums.size());
        System.out.println(nums);  // [1, 23, 45, 12, 34, 27, 245]

        System.out.println(nums.get(5));
        System.out.println(nums.get(6));

        //remove()

        nums.remove(5); //index no'ya göre
        System.out.println(nums);        // [1, 23, 45, 12, 34, 245]
        System.out.println(nums.size());

        System.out.println(nums.get(5));  // 245

        Integer obj1 = new Integer(12);

        nums.remove(obj1);

        System.out.println(nums);      // [1, 23, 45, 34, 245]

        System.out.println("---------------------------------------");

        // add(index,element)----size degisir element array'a eklenir

        nums.add(3,35);
        System.out.println(nums);  // [1, 23, 45, 35, 34, 245] ->35 i buraya ekledi

        System.out.println(nums.get(3));
        System.out.println(nums.size());

        System.out.println("---------------------------------------");

        //set (index ,element)-----size degismez element degisir

        nums.set(3,36);
        System.out.println(nums);
        System.out.println(nums.size());


    }
}
