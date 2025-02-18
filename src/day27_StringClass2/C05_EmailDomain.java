package day27_StringClass2;

public class C05_EmailDomain {
    public static void main(String[] args) {
        String email ="Mustafa.Sandal@gmail.com";
        String email2 ="aliveli@hotmail.com";

        System.out.println(email.indexOf("@"));

        email=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        email2=email2.substring(email2.indexOf("@")+1,email2.lastIndexOf("."));

        System.out.println(email);
        System.out.println(email2);
    }
}
