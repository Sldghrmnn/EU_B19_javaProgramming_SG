package day19_Methods1;

public class C05_MethodInLoop {
    public static void main(String[] args) {

        System.out.println("Loop oncesi");

        for (int i = 1; i <= 5 ; i++) {
           displayMassage();
            System.out.println("Loop ici");
        }
        System.out.println("Loop sonrasi");
    }

    public static void displayMassage(){
        System.out.println("Message is displayed");
    }
}
