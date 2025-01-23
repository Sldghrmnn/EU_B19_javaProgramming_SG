package day08_Assignment_Relational_Logical_Operators;

public class C13_LogicalORveANDOperator {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        int c= 40;

        System.out.println((a > b) && (a++ < c));  // && cifti gorunce 20 yapti--- & tek oldugunda  21 yapti

        System.out.println("a = " + a);   // 20


        int a1= 20;
        int b1= 30;
        int c1= 40;

        System.out.println((a1 > b1) & (a1++ < c1));

        System.out.println("a1 = " + a1);  // 21

          // OR icin

        int a2= 20;
        int b2= 30;
        int c2= 40;

        System.out.println((a2 < b2) || (a2++ < c2));

        System.out.println("a2 = " + a2);  // 20

        int a3= 20;
        int b3= 30;
        int c3= 40;

        System.out.println((a3 < b3) | (a3++ < c3));

        System.out.println("a3 = " + a3);    // 21


    }
}
