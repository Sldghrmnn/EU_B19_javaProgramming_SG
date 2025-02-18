package day27_StringClass2;

public class C08_UniqChars {
    public static void main(String[] args) {

        String str="AABC!! ??1233";
        String result= "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
              result +=str.charAt(i);
            }
        }
        if (result.length()==0){
            System.out.println("Uniq karakter yoktur");
        }
        System.out.println(result);

        System.out.println("------------------------------------------------");

        String str1="AABCCDDDE";

        for (int i = 0; i < str1.length(); i++) {
            if (str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
                result +=str1.charAt(i);
            }
        }
        if (result.length()==0){
            System.out.println("Uniq karakter yoktur");
        }
        System.out.println(result);
        System.out.println("------------------------------------------------");

        String str2="AA 1212BC";

        for (int i = 0; i < str2.length(); i++) {
            if (str2.indexOf(str2.charAt(i))==str2.lastIndexOf(str2.charAt(i))){
                result +=str2.charAt(i);
            }
        }
        if (result.length()==0){
            System.out.println("Uniq karakter yoktur");
        }
        System.out.println(result);
    }
}
/*Write a program that can return the unique characters from a String

        Ex:
        input:AABCCDDDE
        output:BE

        input:AA 1212BC
        output: BC

        input:AABC!! ??1233
        output:BC 12


        Hint: You will need indexOf() and lastIndexOf()
        if the first and last index numbers of the character are same, then it's unique
 */