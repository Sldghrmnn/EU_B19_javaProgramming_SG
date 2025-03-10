package day38_Constructor_PassingObjects02;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.name="Ahmet";
        student.age=25;
        student.id=12345667;

        System.out.println("student.name = " + student.name);
        System.out.println();

        Student student1= new Student("Ahmet");
        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        System.out.println("student1.adress = " + student1.adress);

        System.out.println();

        Student student2= new Student(12345L);
        System.out.println("student2.id = " + student2.id);
        System.out.println("student2.age = " + student2.age);
        System.out.println("student2.name = " + student2.name);
        System.out.println("student2.adress = " + student2.adress);

        System.out.println();


        System.out.println("student1.name = " + student1.name);
        System.out.println("student1.age = " + student1.age);
        System.out.println("student1.id = " + student1.id);
        System.out.println("student1.adress = " + student1.adress);


        Student student3= new Student(15);


    }
}
