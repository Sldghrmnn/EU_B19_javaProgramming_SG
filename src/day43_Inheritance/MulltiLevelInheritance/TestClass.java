package day43_Inheritance.MulltiLevelInheritance;

public class TestClass {
    public static void main(String[] args) {

        GrantParent gp = new GrantParent("Ayhan");
        gp.display();


        Parent parent = new Parent("Hasan","Yavuz");
        parent.display();


        Child child = new Child("Ipek","Aslan",12);
        child.display();

        System.out.println("child.getEvSayisi() = " + child.getEvSayisi());
    }
}
