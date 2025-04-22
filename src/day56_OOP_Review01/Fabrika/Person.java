package day56_OOP_Review01.Fabrika;

public abstract class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
       /* this.name = name;
        this.age = age;
        */
        setAge(age);
        setName(name);
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public abstract void work();

    public abstract String showInfo();

    public void service(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
