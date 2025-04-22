package day56_OOP_Review01.Fabrika;

public class Engineer extends Person implements Payable{

    private String university;

    public Engineer(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {return university;}

    public void setUniversity(String university) {this.university = university;}

    public void design(){System.out.println("I am an engineer.And I desing products");}

    @Override
    public void work() {

    }

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+" yasindayim. Ve "+this.getUniversity()+" den mezunum";
    }

    @Override
    public void pay(int amount) {System.out.println("I get "+(amount+750)+" as a salary.");}
}
