package day08_Assignment_Relational_Logical_Operators;

public class C08_LogicalAND {
    public static void main(String[] args) {
  // truth table AND     'VE' && tek veya cift olarak kullanilir

        System.out.println(true && true);    // true
        System.out.println(true && false);     //false
        System.out.println(false && true);     // false
        System.out.println(false && false);     //false

        int i1= 15;
        int i2=10;

        // tekli operand
        boolean result1=(i1 > i2)& (i1 <= i2);
        System.out.println("result1 = " + result1); // false

        //  ciftli operand
        boolean result2= (i1 != i2)&&(i1 >= i2);
        System.out.println("reult2 = " + result2);// true

        // tek operator ile cift operaator arasindaki fark sonucla ilgili degildir,
        // pereformansla ilgilidir.


    }
}
