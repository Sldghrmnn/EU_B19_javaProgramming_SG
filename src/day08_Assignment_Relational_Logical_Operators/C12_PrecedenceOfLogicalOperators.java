package day08_Assignment_Relational_Logical_Operators;

public class C12_PrecedenceOfLogicalOperators {
    public static void main(String[] args) {

/**
     öncelikler siralamasi
        highest - ilk oncelik
 * !         / DEGIL
 * &&        / VE
 * ||        / VEYA
         lowest    / EN DUSUK-EN ALCAK
 */
        int i1 = 10;
        int i2 = 15;
        int i3 = 20;

        boolean check = i1 != i2 || !(i1 == i3) && i2 == i3;
                      //    T    ||  !(F)       &&  F
                      //    T    ||    T      &&  F
                      //    T    ||    F   =>   T
        System.out.println("check = " + check);













    }
}
