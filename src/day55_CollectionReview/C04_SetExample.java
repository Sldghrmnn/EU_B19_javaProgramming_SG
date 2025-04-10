package day55_CollectionReview;

import java.util.*;

public class C04_SetExample {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(36,25,36,32,21));

        System.out.println("allUnique(nums) = " + allUnique(nums));
        System.out.println("allUnique2(nums) = " + allUnique2(nums));
    }

    //bir list'in elemanlarinin benzersiz olup olmadigini kontrol eden method nedir?
    //method, eger butun elementler benzersiz ise true, degilse false donmelidir

    private static boolean allUnique(List<Integer> numbers){
        Set<Integer> set = new HashSet<>(numbers);

        return set.size() == numbers.size();
    }
    private static boolean allUnique2(List<Integer> numbers){
        Set<Integer> set = new HashSet<>();

        for (Integer i :numbers ) {
        	if (!set.add(i)){
              return false;
            }
        }
        return true;
    }
}
