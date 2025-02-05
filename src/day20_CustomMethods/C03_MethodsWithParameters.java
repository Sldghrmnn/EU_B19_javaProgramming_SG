package day20_CustomMethods;

import java.util.Scanner;

public class C03_MethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(69);
        oddOrEven(54);
        oddOrEven((int)Math.pow(2,4));

        System.out.println(Math.pow(2,4));
        System.out.println("---------------------");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen dogum tarihini giriniz : ");
        int birthyear= scanner.nextInt();

        ageOfPerson(birthyear);

        printNumbers(23,34);

    }
    /**
     * this method checks whether a number is add or even number
     *
     * @param number
     */

    public static void oddOrEven(int number){
        if (number%2==0){
            System.out.println(number +" is an even number");
        }else {
            System.out.println(number +" is an odd number");
        }

    }
    /**
     * this nmethod display the age of the person from the birthyear
     *
     * @param birthYear
     */
public static void ageOfPerson(int birthYear){
    int age = 2025-birthYear;
    System.out.println("Your age is :  "+age);
}

/**
 * this method prints all the numbers between minNumber and maxNumber
 *
 * @param minNumber
 * @param maxNumber
 */
   public static void printNumbers(int minNumber,int maxNumber){
        for (int i = minNumber; i <maxNumber ; i++) {
        System.out.println(i +" ");
        }
   }









}
//  a function that can check if a number is odd number or even number
// a method can display the age of the person from the birthYear
// a method that can print all the numbers between X and Y