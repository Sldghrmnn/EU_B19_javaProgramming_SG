package day42_staticMemebers;

public class C04_Student {

    String name;
    int age;
    int schoolNumber;
    static int counter = 1000;
    static String schoolName = "euroTech Study";

    public C04_Student(String name) {
        this.name = name;
        counter++;
        schoolNumber = counter;
    }
    public C04_Student(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        schoolNumber = counter;
    }

    public static void getOkulInfo(){
        System.out.println(schoolName);
        System.out.println("Müdürümüz Ayhan Kursun");

    }

    @Override
    public String toString() {
        return "C04_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", schoolNumber=" + schoolNumber +
                '}';
    }
}
