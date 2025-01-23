package day08_Assignment_Relational_Logical_Operators;

public class C03_AssignmentOperators {
    public static void main(String[] args) {

      // declaration
      int num1,num2;

      // '=' assignment operator
        num1= 10;
        num2= 5;

        // '+=' assignment operator
        num1+= num2;  //---> num1 =num1 + num2;
        System.out.println("num1 = " + num1);

        // '-=' assignnment operator
        num1-=num2;  //--->num1= num1 - num2;
        System.out.println("num1 = " + num1);

       // '*=' assignnment operator
        num1*= num2;  //---> num1= num1 * num2;
        System.out.println("num1 = " + num1);

        // '/=' assignnment operator
        num1/= num2;  //----> num1= num1 / num2;
        System.out.println("num1 = " + num1);

        // '%=' assignnment operator
        num1 %= num2;  //---> num1= num1 % num2;   //modulus isareti bolumden kalan
        System.out.println("num1 = " + num1);


        String str = "Hasan";
        String s=  "Akcay";

        str += s;  //---> str= str + s;
        str += s;  //---> str= str + s;

        System.out.println( str);




    }
}
