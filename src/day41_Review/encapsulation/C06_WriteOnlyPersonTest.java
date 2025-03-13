package day41_Review.encapsulation;

public class C06_WriteOnlyPersonTest {
    public static void main(String[] args) {

        C05_WriteOnlyPerson person= new C05_WriteOnlyPerson();

        person.setAge(25);
        person.setName("Ali");

        System.out.println("person.toString() = " + person.toString());


        C05_WriteOnlyPerson person1 = new C05_WriteOnlyPerson("Hasan",66);

        person1.setAge(78);

        System.out.println("person1 = " + person1);




    }
}
