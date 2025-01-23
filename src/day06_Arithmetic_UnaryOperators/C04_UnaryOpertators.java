package day06_Arithmetic_UnaryOperators;

public class C04_UnaryOpertators {
    public static void main(String[] args) {

    //  ++ --

    int a=10;
                  a++;          //a=a+1; // postincrement
        System.out.println(a);  // a=11

                  a--;          // a=-1;  // postdecrement
        System.out.println(a);  // a=10

        System.out.println("----------------------------------------------");


                ++a;              // preincrement: sayinin degerine hemen 1 artirir

        System.out.println(a);
        System.out.println(++a);

                --a;              //  predecrement: sayinin degerini oncesinde hemen bir azaltir

        System.out.println(a);   //11
        System.out.println(--a);  //10

        System.out.println("-----------------------");

        System.out.println(a--);     //10--9

        System.out.println(a);       //9

        System.out.println(--a);     //8

        System.out.println(++a);     //9 a=9

        System.out.println(a++);     // 9 a=10

        System.out.println(a++);     // 10 a=11

        System.out.println(a);       //a=11

        System.out.println(--a);     //10 --a= 10

        System.out.println(a++);     // 10 a=11

        System.out.println(a--);     // 11 a=10

        System.out.println(--a);     // 9 a=9

        System.out.println("--------------------------------------");


int b=99;
        System.out.println(++b);   //100   b=100

        System.out.println("------------------------------------");

 int c=99;
        System.out.println(c++);   //99  c=100
        System.out.println(c);     // 100
        System.out.println(c++);   //100 c=101
        System.out.println(c);     //101

































    }
}
