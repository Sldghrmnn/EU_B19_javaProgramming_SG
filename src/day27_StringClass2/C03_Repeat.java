package day27_StringClass2;

public class C03_Repeat {
    public static void main(String[] args) {
        String s1="EuroTech";
        s1=s1.repeat(3);
        System.out.println("s1 = " + s1);

        String sonuc="";
        for (int i = 0; i < 3; i++) {
            sonuc+=s1;
        }
        System.out.println(s1);
    }
}
