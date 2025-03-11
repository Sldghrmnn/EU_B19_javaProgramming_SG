package day39_Encapsulation_01;

public class SimpleGetterAndSetterTest {
    public static void main(String[] args) {

        SimpleGetterAndSetter obj= new SimpleGetterAndSetter();
        //obj.number=15;
        SimpleGetterAndSetter obj1= new SimpleGetterAndSetter(-23);

/*
        System.out.println("obj1.number = " + obj1.number);

        obj1.number=-345;
        System.out.println("obj1.number = " + obj1.number);

        obj.number=-2345;
        System.out.println("obj.number = " + obj.number);

        obj.numberDegerAta(-234);
        System.out.println("obj.number = " + obj.number);

        obj.number=-2345;
        System.out.println("obj.number = " + obj.number);

 */

        System.out.println("obj.getNumber() = " + obj.getNumber());

        System.out.println("obj1.getNumber() = " + obj1.getNumber());

        obj.setNumber(-234);
        System.out.println("obj = " + obj);


    }
}
