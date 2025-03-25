package day47_FinalKeyword_VarMethodHiding.FinalKeyword;

import day41_Review.C01_PassByValue;
import day44_Inheritance02.ParentProject.Parent;

public class FinalMethods {

    public final void method1(){
        System.out.println("Super Class Method-1");
    }
}

class Sub extends FinalMethods {
    /*
    @Override
    public void method1() {
        System.out.println("SuB Class Method-1");
    }

     */
}

class  Main{
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.method1();
    }
}