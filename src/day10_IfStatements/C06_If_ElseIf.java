package day10_IfStatements;

public class C06_If_ElseIf {
    public static void main(String[] args) {

       int a=20;
       int b=30;

        if (a>b){
            System.out.println("a büyüktür b");
        } else if(a==b){
            System.out.println("a eşittir b");
        }else {
            System.out.println("a küçüktür b");
        }

        System.out.println("program bitti");

        System.out.println("--------------------------------------");
        /*
bir program yazın eğer x in değeri 10 ise y ye 20 atansın
x in değeri 20 ise y ye 30 atansın
x in değeri 30 ise y ye 40 atansın
değil ise y ye 0 atansın
*/

int x=30,y;
if (x==10){
  y=20;

}else if (x==20){

    y=30;
}else if (x==30){
    y=40;
}else{
    y=0;
}

        System.out.println("y = " + y);


    }
}
