package day19_Methods1;

public class C08_HierarchicalMethodCall {
    public static void main(String[] args) {

        System.out.println("Start");
        displayMessage();
        calculation();
        System.out.println("Finish");
    }


    public static void displayMessage(){
        System.out.println("Hello World");
        calculation();
        System.out.println("Message displayed");

    }

    public static void calculation(){

        System.out.println(5*8 / 2+9);
    }



}
