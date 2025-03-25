package day47_FinalKeyword_VarMethodHiding.VeriableHiding;

public class Child extends Parent {

   String name ="Child";

   public void print(){
       System.out.println(name);
   }

   public void printParent(){
       System.out.println(super.name);
   }
}
