package day41_Review.encapsulation;

public class C04_ImmutablePersonTest {
    public static void main(String[] args) {

        C03_ImmutablePerson person = new C03_ImmutablePerson("Asli",19);

        System.out.println("person.getName() = " + person.getName());
        System.out.println("person.getAge() = " + person.getAge());

        person.changeAge(2);
        System.out.println("person.getAge() = " + person.getAge());

        person.changeName("Sıla");
        System.out.println("person.getName() = " + person.getName());

    }
}
