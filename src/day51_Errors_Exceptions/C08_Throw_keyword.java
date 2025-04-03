package day51_Errors_Exceptions;

import day51_Errors_Exceptions.Exceptions.AgeException;

import java.util.Scanner;

public class C08_Throw_keyword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age=0;
        System.out.print("Lutfen yasinizi giriniz :");
        age = input.nextInt();

        try {
            if (age < 18){
              //  System.out.println("Yas bilgisi 18'den kucuk olamaz!!!");
                /**
                 * throw keyword'ü ile manuel exception attirabiliriz
                 */
              //   throw new RuntimeException("Yaş bilgisi 18 den küçük olamaz!!!");
                throw new AgeException("Yas bilgisi 18'den kucuk olamaz!!!");
            }else {
                System.out.println("Yasiniz arac kullanmaya uygundur.");
            }
        } catch (AgeException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
