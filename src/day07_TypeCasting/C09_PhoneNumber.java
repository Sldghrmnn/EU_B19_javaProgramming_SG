package day07_TypeCasting;

import java.util.Scanner;

public class C09_PhoneNumber {
    public static void main(String[] args) {
/*
  task 2.
1. create a class named Phone Number and declare the following variables:
countryCode, areaCode, localNumber
Ask user to enter each values.
Use scanner class and get them one by one
use string concatenation to display the phone number as
ex:
countryCode = 90
areaCode = 532
localNumber = 1234500

output:
Your phone number is +(90)532-1234500
*/

Scanner input= new Scanner(System.in);
        System.out.println("Lütfen Alan kodu giriniz : ");
        int countryCode=input.nextInt();

        input.nextLine();

        System.out.println("Lutfen Operator kodunu giriniz : ");
        int areaCode=input.nextInt();

        input.nextLine();


        System.out.println("Lütfen 7 haneli telefon numaranizi yaziniz : ");
        int localNumber=input.nextInt();

        int alanKodu= 90;
        System.out.println("alanKodu = " + alanKodu);

        int operatorKodu= 532;
        System.out.println("operatorKodu = " + operatorKodu);

        int telNo= 1234500;
        System.out.println("telNo = " + telNo);

        System.out.println("Your phone nummer is " +"+" +"(" +alanKodu + ")" + operatorKodu + "-" + telNo);


    }
}
