package day08_Assignment_Relational_Logical_Operators;

public class C09_LogicalOR {
    public static void main(String[] args) {
        // truth table OR     'VEYA'  || isareti ile

        System.out.println(true || true ); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        int i1 = 15;
        int i2 = 10;

//tekli operand
        boolean result1 = (i1 > i2) | (i1 <= i2);
        System.out.println("result1 = " + result1); //true

//çiftli operand
        boolean result2 = (i1 != i2) || (i1 >= i2);
        System.out.println("result2 = " + result2); //true

// tek operator ile çift opartor arasındaki fark sonuçla ilgili değildir
// performans ile ilgilidir.
// yan yana secenekler kismi 2 den fazlada olabilir










    }
}
