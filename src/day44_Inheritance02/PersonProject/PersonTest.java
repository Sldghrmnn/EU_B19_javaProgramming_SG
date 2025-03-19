package day44_Inheritance02.PersonProject;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.introduce();
        person.commonTask();


        Student student = new Student();
        student.introduce();//method overriding / specific implementation for child class
        student.commonTask();// metod inherited from parent class
        student.study(); //metod in child class
    }
}
