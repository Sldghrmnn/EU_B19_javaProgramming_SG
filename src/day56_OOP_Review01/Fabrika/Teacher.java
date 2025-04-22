package day56_OOP_Review01.Fabrika;

public class Teacher extends Person implements Payable{


    public Teacher(String name, int age) {super(name, age);}

    public void teach(){System.out.println("I am a teacher.And I teach lessons.");}

    @Override
    public void work() {System.out.println("I work for a firm as a teacher");}

    @Override
    public String showInfo() {return this.getName()+"-"+this.getAge()+" yasindayim.";}

    @Override
    public void pay(int amount) {System.out.println("I get "+amount+" as a salary.");}
}
