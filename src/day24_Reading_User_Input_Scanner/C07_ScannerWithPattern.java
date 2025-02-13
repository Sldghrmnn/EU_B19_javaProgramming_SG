package day24_Reading_User_Input_Scanner;

import java.util.Scanner;

public class C07_ScannerWithPattern {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("E-mailinizi giriniz : ");

        String kalip = ".*@.*\\..*";  //regex--regular expression

        String email = scanner.next(kalip);

        System.out.println("Gecerli e-posta adresi : " +email);



        String telKalip = "^\\d{3}-\\d{3}-\\d{4}";
        System.out.println("Tel no giriniz : ");

        String tel =scanner.next(telKalip);

        System.out.println("tel = " + tel);


        //@ var mi
        //@ sol tarafinda en az bir karakter var mi
        //
    }
}
