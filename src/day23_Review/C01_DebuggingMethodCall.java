package day23_Review;

public class C01_DebuggingMethodCall {
    public static void main(String[] args) {

        System.out.println("Method icerisindeyim : satir 6");
        method();
        System.out.println("Method icerisindeyim : satir 8");
        method();
        System.out.println("Method icerisindeyim : satir 10");
        method();
        System.out.println("Method icerisindeyim : satir 12");
        method();

    }



    public static void method(){
        System.out.println("Method icerisindeyim : satir 20");
    }
}
