package day41_Review.encapsulation;

import java.util.regex.Pattern;

public class C01_Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String phoneNumber;

    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z]+$");

    public String getFirstName() {return firstName;}

    public C01_Employee(){
    }

    public C01_Employee(String firstName, String lastName, int age, String phoneNumber) {
//        this.firstName = firstName;
        setFirstName(firstName);
//        this.lastName = lastName;
        setLastName(lastName);
//        this.age = age;
        setAge(age);
//        this.phoneNumber = phoneNumber;
        setPhoneNumber(phoneNumber);
    }

    public void setFirstName(String firstName) {
        firstName = firstName.trim();
        if (firstName.length() >= 3 && firstName.length() <= 20 && NAME_PATTERN.matcher(firstName).matches()){
            this.firstName = firstName;
        }else{
            System.out.println("Gecersiz isim...Ya uzun/kisa isim girdiniz yada rakam/özel karakter girdiniz");
        }
    }

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {
            lastName = lastName.trim();
        if (lastName.length() >= 2 && lastName.length() <= 20 && NAME_PATTERN.matcher(lastName).matches()){
           this.lastName = lastName;
        }else{
            System.out.println("Gecersiz soyisim...Ya uzun/kisa isim girdiniz yada rakam/özel karakter girdiniz");
        }
    }

    public int getAge() {return age;}

    public void setAge(int age) {
        if (age>0 && age<100){
            this.age = age;
        }else{
            System.out.println("Hatali yas bilgisi");
        }
    }

    public String getPhoneNumber() {return phoneNumber;}

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^[1-9][0-9]{9}$")){
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println("Gecersiz tel no");
        }
    }

    @Override
    public String toString() {
        return "C01_Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
