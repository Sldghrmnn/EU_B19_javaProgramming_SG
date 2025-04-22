package day56_OOP_Review01.Fabrika;

public class Volunteer extends Person {

    public Volunteer(String name, int age) {super(name, age);}

    @Override
    public void work() {System.out.println("I am a volunteer. And I am not payed");}

    @Override
    public String showInfo() {return this.getName()+"-"+this.getAge()+" yasindayim.";}

    @Override
    public String toString() {return "Volunteer{}"+super.toString();}
}
