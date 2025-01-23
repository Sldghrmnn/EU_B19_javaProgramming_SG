package day08_Assignment_Relational_Logical_Operators;

public class C10_LogicalNOT {
    public static void main(String[] args) {
// truth table NOT    (DEGIL-HARIC) ! isareti ile
        boolean b = (5 != 8); //true
        System.out.println("b = " + b);

        boolean b1 = !(5==8);
        System.out.println("b1 = " + b1);

        int i1 = 15;
        int i2 = 10;

//tekli operand
        boolean result1 = !(i1 > i2) | !(i1 <= i2);
        System.out.println("result1 = " + result1); //true

























    }
}
