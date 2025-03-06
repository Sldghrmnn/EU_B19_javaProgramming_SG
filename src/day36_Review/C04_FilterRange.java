package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_FilterRange {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,36,3,0,-6,32,2,4,6,7));

        System.out.println("filterRange(list) = " + filterRange(list,3,7));

    }
    //liste icindekileri rakamlari verilen araliga gore filtreleyelim
    //list(),3,7 -> 3 ve 7 araligi disindakileri siler (sinirlar dahil)

    public static ArrayList<Integer> filterRange(ArrayList<Integer> nums,int min,int max){
        ArrayList<Integer> sonuc = new ArrayList<>();

        for (Integer num :nums ) {
        	if (num >= min && num <= max){
                sonuc.add(num);
            }
        }
        return sonuc;
    }
}
