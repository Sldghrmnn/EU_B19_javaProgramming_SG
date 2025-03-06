package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C08_SortLetterAndDigits {
    public static void main(String[] args) {

        String input = "DC501GCCCA098911";
        String[] output = transformLetterAndDigit(input);
        System.out.println(Arrays.toString(output));

    }
    /*
    input:"DC501GCCCA098911"
    output:"CD015ACCCG011899"

    CD,015,ACCCG,011899
   [ CD 015 ACCCG 011899]gibi cikti olacak

     */

    public static String[] transformLetterAndDigit(String str){
        ArrayList<String> gruplar = new ArrayList<>();
        String temp= "";

        for (int i = 0; i < str.length(); i++) {
            if (temp.isEmpty() ||
                    (Character.isLetter(temp.charAt(0)) && Character.isLetter(str.charAt(i)))||
                    (Character.isDigit(temp.charAt(0)) && Character.isDigit(str.charAt(i)))){
                temp += str.charAt(i);
            }else{
                gruplar.add(temp);
                temp = ""+str.charAt(i);
            }
        }
        gruplar.add(temp);

        String[] resultArray = new String[gruplar.size()];
        for (int i = 0; i < gruplar.size(); i++) {
          char[] chars = gruplar.get(i).toCharArray();
          Arrays.sort(chars);
          resultArray[i] = new String(chars);
        }

        return resultArray;
    }
}
