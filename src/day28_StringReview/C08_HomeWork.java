package day28_StringReview;

import java.util.HashSet;

public class C08_HomeWork {
    public static void main(String[] args) {

        System.out.println("nTwice(\"Hello\",2) = " + nTwice("Hello",2));
        System.out.println("nTwice(\"Chocolate\",3) = " + nTwice("Chocolate", 3));
        System.out.println("nTwice(\"Chocolate\",1) = " + nTwice("Chocolate", 1));
        System.out.println("---------------------------------");
        System.out.println("catDog(\"catdog\") = " + catDog("catdog"));
        System.out.println("catDog(\"catcat\") = " + catDog("catcat"));
        System.out.println("catDog(\"1cat1cadodog\") = " + catDog("1cat1cadodog"));
        System.out.println("catDog(\"catcatdogdog\") = " + catDog("catcatdogdog"));
        System.out.println("---------------------------------");
        System.out.println("zerosCount(\"100000000001\") = " + zerosCount("100000000001"));
        System.out.println("zerosCount(\"10001\") = " + zerosCount("10001"));
        System.out.println("---------------------------------");
        String str1 = "abcabcbb";
        System.out.println(enUzunTekrariOlmayan(str1)); //3
        String str2 = "bbbbb";
        System.out.println(enUzunTekrariOlmayan(str2)); //1
        String str3 = "pwwkew";
        System.out.println(enUzunTekrariOlmayan(str3)); //3
        String str4 = "pwrwkew";
        System.out.println(enUzunTekrariOlmayan(str4)); //4



    }
     /*
    Given a string and an int n, return a string made of the first
    and last n chars from the string. The string length will be at least n.
    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
         */
    public static String nTwice(String str,int n){
     return str.substring(0,n) + str.substring(str.length()-n);
    }
    /*
     Return true if the string "cat" and "dog" appear the same number of times in the given string.
        catDog("catdog") → true
        catDog("catcat") → false
        catDog("1cat1cadodog") → true
        catDog("catcatdogdog") → true
     */
    public static Boolean catDog(String str){
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length()-3; i++) {
            String s = str.substring(i,i+3);
            if (s.equals("cat")){
                catCount++;
            }else if (s.equals("dog")){
                dogCount++;
            }
        }
        return catCount == dogCount;
    }
    // count zeros between 1's.
    //"100000000001" -> 10
    //"10001" -> 3

    public static int zerosCount(String str){
        int firstOne = str.indexOf('1');
        int lastOne = str.lastIndexOf('1');
        int count = 0;

        for (int i = firstOne+1; i < lastOne ; i++) {
            if (str.charAt(i) == '0'){
                count++;
            }
        }
        return count;


    }
    /*
     * Given a string s, find the length of the longest
     * substring
     * without repeating characters.
     * <p>
     * Example 1:
     * <p>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * Example 2:
     * <p>
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * Example 3:
     * <p>
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Input: s = "pwrwkew"
     * Output: 4
     * Explanation: The answer is "rwke", with the length of 3.
     */

    public static int enUzunTekrariOlmayan(String str){
        String bulunan ="";   // tekrarsiz karakterleri  saklayacak gecisi String
        int maxUzunluk = 0;

        for (char karakter : str.toCharArray()) {
            while (bulunan.contains(String.valueOf(karakter))){
                bulunan = bulunan.substring(1);  // bastan karkteri sil
            }
            bulunan += karakter;   // yeni karakteri ekle
            maxUzunluk = Math.max(maxUzunluk,bulunan.length());
        }
        return maxUzunluk;
    }


}
