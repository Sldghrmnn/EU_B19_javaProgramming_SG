package day28_StringReview;

public class C04_WithoutEnd {
    public static void main(String[] args) {
        String s = "Ahmet"; // length = 5 ama index 4'de bitiyor
        System.out.println("s.substring(s.length()) = " + s.substring(s.length()-1)); //t
        System.out.println("s.substring(s.length()) = " + s.substring(s.length()-2)); //et
        System.out.println("s.substring(0,s.length()-1) = " + s.substring(0,s.length()-1)); // Ahme

        System.out.println("withoutEnd(s) = " + withoutEnd(s));
        System.out.println( withoutEnd(""));
        System.out.println( withoutEnd("a"));
        System.out.println( withoutEnd("ab"));
        System.out.println( withoutEnd("abc"));
    }

 /*
Given a string, return a version without both the first and
last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
withouEnd2("a") → ""
*/
    public static String withoutEnd(String str){
        if (str.length() <= 2)  return "";
        return str.substring(1,str.length() - 1);
    }
}
