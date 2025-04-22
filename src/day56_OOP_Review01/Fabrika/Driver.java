package day56_OOP_Review01.Fabrika;

public class Driver extends Person implements CanDrive,Payable{

    private String driverLicence;


    public Driver(String name, int age, String driverLicence) {
        super(name, age);
       setDriverLicence(driverLicence);
    }

    public String getDriverLicence() {return driverLicence;}

    public void setDriverLicence(String driverLicence) {this.driverLicence = driverLicence;}

    @Override
    public void work() {System.out.println("I work early in the mornings and lately evenings");}

    @Override
    public String showInfo() {
        return this.getName()+"-"+this.getAge()+" yasindayim.";}

    @Override
    public String toString() {
        return "Driver{" +
                "driverLicence='" + driverLicence + '\'' +
                '}';
    }

    public void drive(){System.out.println("I work as a driver. And I drive bus");}

    @Override
    public void pay(int amount) {System.out.println("I get "+amount+" as a salary.");}
}
