package day21_ReturnMethods_MethodOverloading;

public class C08_NtimesString {
    public static void main(String[] args) {

        stringNTimes("Hi",3);
        System.out.println(stringTimes("Selda", 3));


    }

   public static void stringNTimes(String str,int num){
       for (int i = 0; i < num; i++) {
           System.out.print(str);
       }
   }

    public static String stringTimes(String str,int num){
        String result="";

        for (int i = 0; i < num; i++) {
           result+=str;
        }

        return result;
    }
}
 /*
        Given a string and a positive int n, return a string that is n copies of the original string.


stringTimes("Hi", 2) → "Hi Hi "
stringTimes("Hi", 3) → "Hi Hi Hi "
stringTimes("Hi", 1) → "Hi "
 */