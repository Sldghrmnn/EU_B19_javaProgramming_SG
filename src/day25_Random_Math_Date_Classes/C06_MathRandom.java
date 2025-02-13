package day25_Random_Math_Date_Classes;

public class C06_MathRandom {
    public static void main(String[] args) {

        System.out.println("Math.random() = " + Math.random());
        System.out.println("Math.random() = " + Math.random());

        System.out.println("random = " + (int) (Math.random() * 10)); //0--9
        System.out.println(1 + (int) (Math.random() * 10)); // 1--10

        // 34-55 arasindaa
        System.out.println(34 +(int) Math.random() * (55 - 34));


    //   for (int i = 0; i < 10000; i++) {
    //   System.out.println((int) (Math.random() * (999)));
    //  }
        //0-999
        System.out.println((int) (Math.random() * (999)));

        //5.5 ila 55.5

        double sayi = 5.5 + Math.random() *(55.5-5.5);
        System.out.println(sayi);

        // a ila b arasinda tam sayi uretme
        // int x = a +(int) (Math.random()+(b-a))




    }
}
