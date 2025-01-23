package day08_Assignment_Relational_Logical_Operators;

import java.util.Scanner;

public class C07_RelationalOperators {
    public static void main(String[] args) {
    int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz : ");
        num1= sc.nextInt();
        num2= sc.nextInt();

// asagidaki true/false durumlari num1= 125 ve num2= 45 dgerleri icin gecerlidir.

    //'==' is equal operator      ( esittir)
        boolean b = num1 == num2;
    // boolean b = (num1 == num2); bu şekilde gösterim daha okunaklıdır..

        System.out.println("b = " + b);
        System.out.println("num1 == num2 ? "+ (num1 == num2)); //false

    //'!=' is not equal operator  ( esit degildir )
        System.out.println("num1 != num2 ? "+ (num1 != num2)); //true

    //'>' is larger operator      ( buyuktur)
        System.out.println("num1 > num2 ? "+ (num1 > num2)); //true

    //'<' is smaller operator    ( kucuktur)
        System.out.println("num1 < num2 ? "+ (num1 < num2)); //false

    //'>=' is larger or equal operator  ( buyuktur veya esttir)
        System.out.println("num1 >= num2 ? "+ (num1 >= num2)); //true

    //'<=' is smaller or equal operator   ( kucuktur veya esittir)
        System.out.println("num1 <= num2 ? "+ (num1 <= num2)); //false

        String str = "10";

        //System.out.println(str > num1);   hata vadir olmaz

        double db1= 25.4;
        double db2= 25.4;
        System.out.println(db1 >= db2);  // true



    }
}
