package day05_Variables_cont;

public class C04_ConcatenationTask {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = " ";
        String s3 = "harika";
        String s4 = "";

        int a = 3;
        int b = 5;

        System.out.println(a * b + s2 + s1 + s2 + s3);        // 15 Java harika
        System.out.println(a + b + s2 + s1 + s2 + s3);        // 8 Java harika
        System.out.println(s4 + a + b + s1 + s2 + s3);       //  35Java harika
        System.out.println(s1 + (a * b) + s3);               //  Java15harika
        System.out.println(s1 + a + b + s3);                //   Java35harika
        System.out.println(s1 + (a + b) + s3);              //   Java8harika






    }
}
