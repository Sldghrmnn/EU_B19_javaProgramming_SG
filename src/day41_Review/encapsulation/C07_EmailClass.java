package day41_Review.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C07_EmailClass {

    private String email;
    public static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");

    private static final String DEFAULT_EMAIL = "GECERSIZ@email.com"; // varsayilan deger


    public C07_EmailClass() {
    }

    public C07_EmailClass(String email) {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (matcher.matches()){
            this.email = email;
        }else {
            System.out.println("Hatalı email girişi !!!");
            this.email = DEFAULT_EMAIL;
        }

    }
    @Override
    public String toString() {
        return "C07_EmailClass{" +
                "email='" + email + '\'' +
                '}';
    }


    public static void main(String[] args) {
        C07_EmailClass email = new C07_EmailClass();

        email.setEmail("asa-ka@gmail.c");

        System.out.println("email = " + email);

        C07_EmailClass email2 = new C07_EmailClass("asa_ka@yahoo.com");

        System.out.println("email2 = " + email2);
    }




}