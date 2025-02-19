package day27_StringClass02;

public class C02_Replace {
    public static void main(String[] args) {
        String s1="Java Java Java";
        s1=s1.replace("a","e");

        System.out.println("s1 = " + s1);

        String s2="Java Java Java";
        s2=s2.replace("Java","Phyton");
        System.out.println("s2 = " + s2);

        String s3="Java Java Java";
        s3=s3.replaceFirst("Java","Phyton");
        System.out.println("s3 = " + s3);
        System.out.println("s3.replaceFirst(\"Java\") = " + s3.replaceFirst("Java","Phyton"));

        String s4="Ja9va1 Ja5va22 4Java3";
        s4=s4.replaceAll("[0-9]","Phyton");
        System.out.println("s4 = " + s4);


    }
}
