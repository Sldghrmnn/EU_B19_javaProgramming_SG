package day56_OOP_Review01.Fabrika;

public class Worker extends Person implements Payable{

    private String department;


    public Worker(String name, int age, String department) {
        super(name, age);
        setDepartment(department);
    }

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    @Override
    public void work() {System.out.println("I am a worker. And I do daily tasks");}

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+" yasindayim. Ve "+this.getDepartment()+" ta calisiyorum";
    }

    @Override
    public String toString() {
        return "Worker{" +
                "department='" + department + '\'' +
                '}'+super.toString();
    }


    @Override
    public void pay(int amount) {System.out.println("I get "+amount+" as a salary");}
}
