package day51_Errors_Exceptions;

import day37_Constructor_PassingObjects01.Banka;

public class C06_Checked_Unchecked {
    public static void main(String[] args) {

        System.out.println("--------------Unchecked Exceptions----------------");

        int a=15;
        int b=0;
      //  System.out.println(a / b);      // aritmatic exception

        char[] chars={'A','B','C'};
      //  System.out.println(chars[7]);  // ArrayIndexOutOfBoundsException


        Banka banka = null;
       // banka.getClass();               // NullPointerException

        String str = "Java";
        str =null;

       // System.out.println(str.toUpperCase());  // NullPointerException

        System.out.println("---------------Checked Exceptions--------------------");
        System.out.println("Hi");

       // Thread.sleep(3000);

        //  FileInputStream file=new FileInputStream();
    }
}
