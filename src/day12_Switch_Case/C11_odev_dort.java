package day12_Switch_Case;

import java.util.Scanner;

public class C11_odev_dort {
    public static void main(String[] args) {
 /* task 3
 Write a program that shows students English Level
If Beginner display level=1
If Elementary display level=2
If Intermediate display level=3
If Advance display level=4
If Expert display level=5
 */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingilizce seviyesi : ");
        int ingSeviyesi= scanner.nextInt();

        switch (ingSeviyesi){
            case 1:
                System.out.println("If Beginner display level");
                break;
            case 2:
                System.out.println("If Elementary display level");
                break;
            case 3:
                System.out.println("If Intermediate display level");
                break;
            case 4:
                System.out.println("If Advance display level");
                break;
            case 5:
                System.out.println("If Expert display level");
                break;
            default:
                System.out.println("Ingilizce bilmiyorunuz !!!");
        }




    }
}
