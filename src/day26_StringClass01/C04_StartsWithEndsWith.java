package day26_StringClass01;

public class C04_StartsWithEndsWith {
    public static void main(String[] args) {

        // her iki method'da boolean cevirir
        String str = "Hersey cok guzel";
        System.out.println("str.startsWith(\"H\") = " + str.startsWith("H"));
        System.out.println("str.startsWith(\"h\") = " + str.startsWith("h"));
        System.out.println("str.startsWith(\"Her\") = " + str.startsWith("Her"));
        System.out.println("str.startsWith(\"Hersey cok gu\") = " + str.startsWith("Hersey cok gu"));
        System.out.println("str.startsWith(\"Herseycok gu\") = " + str.startsWith("Herseycok gu"));//false
        System.out.println("str.startsWith(\"\") = " + str.startsWith(""));

        System.out.println("str.endsWith(\"\") = " + str.endsWith(""));
        System.out.println("str.endsWith(\"l\") = " + str.endsWith("l"));
        System.out.println("str.endsWith(\"uzel\") = " + str.endsWith("uzel"));
    }
}
