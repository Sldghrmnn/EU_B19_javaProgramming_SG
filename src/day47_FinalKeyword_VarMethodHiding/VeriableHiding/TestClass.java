package day47_FinalKeyword_VarMethodHiding.VeriableHiding;

public class TestClass {
    public static void main(String[] args) {

        Child child = new Child();
        child.print();
        child.printParent();
        System.out.println("child.name = " + child.name);

        Parent parent = new Parent();
        parent.print();
    }
}
