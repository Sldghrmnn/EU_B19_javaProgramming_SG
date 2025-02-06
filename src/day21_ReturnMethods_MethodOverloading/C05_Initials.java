package day21_ReturnMethods_MethodOverloading;

public class C05_Initials {
    public static void main(String[] args) {
        System.out.println(initials("Selda", "Gehrmann"));

    }
   public static String initials(String firstName,String lastName) {
      String result = "";
      result=firstName.charAt(0)+"."+lastName.charAt(0)+".";

     return result;
   }









}
//1. Create a method that can display the initials of the person. initials(String firstName, String lastName)
// Ayse Betul ---A. B.