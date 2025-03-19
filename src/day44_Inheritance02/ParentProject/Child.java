package day44_Inheritance02.ParentProject;

public class Child extends Parent{

    public void greet(){System.out.println("Hello from child class");}

    public void displayInfo(String message){System.out.println("Child info :"+message);}
}
/*
    // There must be is-a relationship(inheritance)


    // The method must have the same name as in the super/parent class
    public void greeting(){
        System.out.println("Hello from child class");
    }

    //Access modifier: Needs to be same or more visible
    • PARENT → CHILD
    • Public → public
    • Protected → protected, public
    • default → default, protected, public


     // The method must have the same parameter as in the parent class
public void displayInfo(String message, int age){
        System.out.println("Child info : "+ message);
    }

    Return type must be same or covariant type
 */