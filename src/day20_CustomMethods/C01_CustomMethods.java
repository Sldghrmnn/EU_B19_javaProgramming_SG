package day20_CustomMethods;

public class C01_CustomMethods {
    public static void main(String[] args) {
        System.out.println("Program has started");
        greetings();
        greetings();
        greetings();
        System.out.println("Program has continued");

        // java'da tekrar suctur!!! der hocamiz :)  a*b + a*c + a+d = a *(b +c +d)

        warmGreetings();

        String str = greetingsWithReturnType();
        System.out.println(str);


    }

    public static void greetings(){
        System.out.println("Hello World");
    }

    public static void warmGreetings(){
        greetings(); // call the method() from another method
        System.out.println("What's up guys !");
    }

    public static String greetingsWithReturnType(){
        String greetings = "The secret of life is : !";



        return greetings;
    }

}
