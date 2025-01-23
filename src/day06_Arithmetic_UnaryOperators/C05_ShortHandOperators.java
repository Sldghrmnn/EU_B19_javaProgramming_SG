package day06_Arithmetic_UnaryOperators;

public class C05_ShortHandOperators {
    public static void main(String[] args) {
     int num=10;  // decleration assignment
         num=20;
        System.out.println("num="+num);


        String text="Java Programming Language";
        System.out.println("text = " + text);

        text="Phyton Programming Language";
        System.out.println("text = " + text);

        System.out.println("-----------------------------------" );


/*
x = x+25;
System.out.println("x = " + x);
*/

        int x= 50;
            x+=5; // x=x+5;
        System.out.println("x = " + x);

        double y =13.5;
        System.out.println("y = " + y);

        y-=3.5; // y=y-3.5
        System.out.println("y = " + y);

double bakiye= 1650.54;
        System.out.println("bakiye = " + bakiye);

        bakiye+=1500;      //bakiye=bakiye+1500;
        System.out.println("bakiye = " + bakiye);

        bakiye-=3000;
        System.out.println("bakiye = " + bakiye);

double sayi=15;
        System.out.println("sayi = " + sayi);
        sayi*=2;
        System.out.println("sayi = " + sayi);
        sayi%=4;               //  %   mod
        System.out.println("sayi = " + sayi);

  double maas= 50000;
         maas/= 2;    //maas=maas/2
        System.out.println("maas = " + maas);

        System.out.println("--------------------------------------------");

        text="Golden Globe";

        String word="Golden";

        word+=" Globe";   // word=word+
        System.out.println("word = " + word);
        word+=" new";
        System.out.println("word = " + word);

    }
}
