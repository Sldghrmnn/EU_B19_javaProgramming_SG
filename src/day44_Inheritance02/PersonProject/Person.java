package day44_Inheritance02.PersonProject;

public class Person {

    // The method must have the same name as in the super/parent class

    public void introduce(){System.out.println("Hello I am a generic person");}

    public void commonTask(){
        genericMetod();
        System.out.println("Performing a common task for all people");
    }

    private void genericMetod(){System.out.println("Generic metod");}
}
