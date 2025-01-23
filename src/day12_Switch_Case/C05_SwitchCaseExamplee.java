package day12_Switch_Case;

import java.util.Scanner;

public class C05_SwitchCaseExamplee {
    public static void main(String[] args) {

/*
Write a program to display traffic light colors using following logic:
if code (R/r)—>"Red"
if code (A/a)—>"Amber"
if code (G/g)—>"Green"
*/
        Scanner renkGir=new Scanner(System.in);
        System.out.println("Trafik lambasi rengini tek harf olarak giriniz : ");
        String color=renkGir.nextLine();

switch (color){
    case"R":
        System.out.println("Red");
        break;
    case "r":
        System.out.println("Red");
        break;
    case"A":
        System.out.println("Amber");
        break;
    case"a":
        System.out.println("Amber");
        break;
    case"G":
        System.out.println("Green");
        break;
    case "g":
        System.out.println("Green");
        break;
    default:
        System.out.println("Trafik lambasinda boyle bir renk yoktur");
}
















    }
}
