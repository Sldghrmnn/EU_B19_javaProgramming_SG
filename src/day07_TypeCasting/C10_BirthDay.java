package day07_TypeCasting;

import java.util.Scanner;

public class C10_BirthDay {
    public static void main(String[] args) {
 /*
    task 3.
   3. Create a class named BirthDay and create the following variable and get the variables INORDER as
(Degiskenler kullanicidan sirasiyla alinacak)
name, birthDay(int), birthMonth(String), birthYear(int)

use concatenation to display the birthday of the person

if the user enters the followings
name = "John"
birthDay = 23
Month = "April"
birthYear = 1990;
// date convention 10/15/2020

output:
1. John was born on April/23/1990
2. John was born on "April\23\1990"

 */

Scanner input= new Scanner(System.in);

System.out.println(" Lütfen isminizi yaziniz  : ");
String name= input.nextLine();

System.out.println("Lütfen dogdugunuz gunu yaziniz : ");
int birthDay= input.nextInt();

input.nextLine();

System.out.println("Lütfen dogdugunuz ayi yaziniz : ");
String Month=input.nextLine();

System.out.println("Lütfen dogdugunuz yili yaziniz : ");
int birthYear=input.nextInt();

input.nextLine();

System.out.println("name = " + name);
System.out.println("birthDay = " + birthDay);
System.out.println("Month = " + Month);
System.out.println("birthYear = " + birthYear);

       // 1. John was born on April/23/1990
        // 2. John was born on "April\23\1990"
        System.out.println("John was born on " + Month+"/"+birthDay+"/"+birthYear);
        System.out.println("John was born on " + "\"" +Month+ "\\" +birthDay+"\\"+birthYear+ "\"");


    }
}
