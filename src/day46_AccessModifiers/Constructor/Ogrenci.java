package day46_AccessModifiers.Constructor;

public class Ogrenci {

    private String name;  // private---class special--- any other members of same class can access
    private String lastName;  // private---class special--- any other members of same class can access
    private int number;    // private---class special--- any other members of same class can access

    public Ogrenci() {System.out.println("Private Constructor called");}

    //Bu constructor Protected tanımlandığından ancak miras ilişkisi kurulduktan sonra
    // bu constructor ile instance oluşturulabilir

    protected Ogrenci(String name, String lastName) {
        this();
        this.name = name;
        this.lastName = lastName;
    }

    public Ogrenci(String name, String lastName, int number) {
       // this(name,lastName);
        this.name = name;
        this.lastName = lastName;
        this.number = number;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}
}
