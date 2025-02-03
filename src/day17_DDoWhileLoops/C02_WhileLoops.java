package day17_DDoWhileLoops;

public class C02_WhileLoops {
    public static void main(String[] args) {

        for (int i=1;i<=5;i++){
            System.out.print(i + " ");
        }
        System.out.println("\n---------------------------------");

        int i=1;
        for (;i<=5;){
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\n---------------------------------");

        System.out.println(" WhileLoop");
        int j=1;
        while (j<=5){
            System.out.print(j + " ");
            j++;
        }
        System.out.println(j);
    }
}
