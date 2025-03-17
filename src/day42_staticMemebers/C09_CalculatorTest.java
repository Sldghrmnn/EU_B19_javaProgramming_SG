package day42_staticMemebers;

import static day42_staticMemebers.C08_Calculator.*;
import static java.lang.Math.*;

public class C09_CalculatorTest {
    public static void main(String[] args) {

       // C08_Calculator cal = new C08_Calculator();

      //  System.out.println("cal.cikarma(3,2) = " + cal.cikarma(3, 2));

        System.out.println("C08_Calculator.carpma(3,2) = " + C08_Calculator.carpma(3, 2));

        System.out.println("Math.pow(2,3) = " + pow(2, 3));

        //static import

        System.out.println("Math.max(6,9) = " +Math. max(6, 9));
        System.out.println("Math.abs(-3) = " + Math.abs(-3));

        System.out.println("bolme(9,2) = " + bolme(9, 2));
    }
}
