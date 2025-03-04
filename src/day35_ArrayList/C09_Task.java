package day35_ArrayList;

import java.util.ArrayList;

public class C09_Task {
    public static void main(String[] args) {

     /*
    "10","100","101","1000" sayılarını stringNums isimli arrayList e atalım.
    toIntList(stringNums); methodu Integer bir arrayList e convert edip
    döndürelim.
     */

        ArrayList<String> stringNums = new ArrayList<>();
        stringNums.add("10");
        stringNums.add("100");
        stringNums.add("101");
        stringNums.add("1000");

        System.out.println("toIntList(stringNums) = " + toIntList(stringNums));
        System.out.println("toIntList(stringNums).get(1)+100 = " +( toIntList(stringNums).get(1) + 100));

    }

    public static ArrayList<Integer> toIntList(ArrayList<String> arrStringList){
        ArrayList<Integer> arrIntList = new ArrayList<>();

        for (int i = 0; i < arrStringList.size(); i++) {
          //  arrIntList.add(Integer.parseInt(arrStringList.get(i)));           //iki turlude olabilir
            arrIntList.add(Integer.valueOf(arrStringList.get(i)));           // iki turlude olabilri
        }

        return arrIntList;
    }
}
