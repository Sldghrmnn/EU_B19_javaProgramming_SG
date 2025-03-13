package day41_Review.encapsulation;

public class C05_WriteOnlyPerson {

    private String name = "isimsiz";
    private int age;

    public C05_WriteOnlyPerson(){}


    public C05_WriteOnlyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
/*
    @Override
    public String toString() {
        return "C05_WriteOnlyPerson{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
 */
}
