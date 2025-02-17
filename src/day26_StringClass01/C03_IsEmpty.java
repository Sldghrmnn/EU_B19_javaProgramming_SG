package day26_StringClass01;

public class C03_IsEmpty {
    public static void main(String[] args) {
        String str = "Merhaba";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str = "";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());

        str = " ";
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
    }
}
