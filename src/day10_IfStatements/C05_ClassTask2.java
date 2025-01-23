package day10_IfStatements;

import java.util.Scanner;

public class C05_ClassTask2 {
    public static void main(String[] args) {
      /*
hava sıcaklığı isminde bir değişken declere edin ve değer atayın
sıcaklık 20 derece üzerinde ise hava sıcak yazsın
sıcaklık 20 derece ve altında ise hava soğuk yazsın
*/

double havaSicakligi=20.05;

if (havaSicakligi>20) {
    System.out.println("hava sicak");

}else{
        System.out.println("hava soguk");
    }

        System.out.println("program bitti");


 /*
Class Task 2
kullanıcıdan bir tam sayı alın
ekrana tek mi çift mi olduğunu yazdırın
*/
        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz : ");
        int number=input.nextInt();

        boolean result=(number%2==1);


        if (result){
            System.out.println("sayi tektir");

        }else{

            System.out.println("sayi cifttir");
        }


        System.out.println("program bitti");






    }








    }

