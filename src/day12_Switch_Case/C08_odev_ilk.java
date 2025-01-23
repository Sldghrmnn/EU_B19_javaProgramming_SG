package day12_Switch_Case;

import java.util.Scanner;

public class C08_odev_ilk {
    public static void main(String[] args) {
/*
 task 1
 Write a program that lets user to enter Mercedes, Volvo, Opel, Sahin Car
                Models
        If it is Mercedes display “Good one”
        If it is Volvo display “Tough one”
        If it is Opel display “Not bad”
        If it is Sahin display “Not recommended”
        Else “Do not buy that one!”
*/

        Scanner marka = new Scanner(System.in);
        System.out.println("Arabanizin Markasini giriniz : ");
        String arabaMarkasi= marka.next();



        switch (arabaMarkasi){
            case "Mercedes":
                System.out.println("Good one");
                break;
            case  "Volvo" :
                System.out.println("Tough one ");
                break;
            case  "Opel" :
                System.out.println("Not bad ");
                break;
            case  "Sahin" :
                System.out.println("Not recommended");
                break;
            default:
                System.out.println("Bunu almanizi tavsiye etmem !!!");



        }











    }
}
