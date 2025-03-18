package day43_Inheritance.Employee;

public class Secretary extends Employee {

    String officeName;
    String managerId;



    public void giveReport(){
        System.out.println("Sekreter raparu sundu.");
    }
    public void createList(){
        System.out.println("Sekreter listeyi hazirladi.");
    }

}
