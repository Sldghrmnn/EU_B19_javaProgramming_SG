package day36_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_RemoveInALoop {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("kayak","ata","atak","amma","yaka","aka","kirik"));

       // System.out.println("removePalindrome(list) = " + removePalindrome(list));
        System.out.println("removePalindrome_1(list) = " + removePalindrome_1(list));
       // System.out.println("removePalindrome_ForEach(list) = " + removePalindrome_ForEach(list));  //hata verir


    }

    //bir list'de bulunan palindrome kelimeleri silen methodu yaziniz.

    public static ArrayList<String> removePalindrome(ArrayList<String>words){
        for (int i = 0; i < words.size();) {
          if(isPalindrome( words.get(i))){
              words.remove(words.get(i));
          }else{
              i++;
          }
        }
        return words;
    }

    public static ArrayList<String > removePalindrome_ForEach(ArrayList<String> words){

        for (String word : words){
            if (isPalindrome(word)){
                words.remove(word);
            }
        }

        return words;
    }


    public static ArrayList<String> removePalindrome_1(ArrayList<String> words){
        ArrayList<String> sonuc = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (! isPalindrome(words.get(i))){
                sonuc.add(words.get(i));
            }
        }
        return sonuc;
    }

    public static boolean isPalindrome(String word){
        String reverseWord ="";
        for (int i = word.length()-1; i >=0; i--) {
            reverseWord += word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
