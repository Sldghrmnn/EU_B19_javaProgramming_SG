package day42_staticMemebers;

public class C05_StudentTest {
    public static void main(String[] args) {


        C04_Student student1 = new C04_Student("Ayla");
        C04_Student student2 = new C04_Student("Ayse",15);

        C04_Student student3 = new C04_Student("Selim");
        C04_Student student4 = new C04_Student("Serap",15);
        C04_Student student5 = new C04_Student("Sibel");
        C04_Student student6 = new C04_Student("Ege",15);


        System.out.println("student1.schoolName = " + student1.schoolName);

        System.out.println("student6 = " + student6);
        System.out.println("student3 = " + student3);

        System.out.println("C04_Student.counter = " + C04_Student.counter);

        System.out.println("student4.counter = " + student4.counter);
        System.out.println("student5.counter = " + student5.counter);

        student3.getOkulInfo();

        C04_Student.getOkulInfo();

    }
}
