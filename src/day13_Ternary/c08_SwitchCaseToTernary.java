package day13_Ternary;

import java.util.Scanner;

public class c08_SwitchCaseToTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int not;
        String harfNotu;
        System.out.print("Lutfen notunuzu giriniz : ");
        not = sc.nextInt();

        switch (not){
            case 90 :
                harfNotu =" Gecme notunuz -A";
                break;
            case 80 :
                harfNotu =" Gecme notunuz -B";
                break;
            case 70 :
                harfNotu =" Gecme notunuz -C";
                break;
            case 60 :
                harfNotu =" Gecme notunuz -D";
                break;
            case 50 :
                harfNotu =" Gecme notunuz -E";
                break;
            default:
                harfNotu = "Gecersiz not / Kaldiniz ";

                System.out.println("harfNotu = " + harfNotu);


        }

        // ternary

        harfNotu = (not >= 90) ?  " Gecme notunuz -A"
                   : (not >= 80) ? " Gecme notunuz -B"
                   : (not >= 70) ? " Gecme notunuz -C"
                   : (not >= 60)  ? " Gecme notunuz -D"
                   : (not >= 50)  ? " Gecme notunuz -E"
                   :    "Gecersiz not / Kaldiniz ";
        System.out.println("harfNotu = " + harfNotu);

    }
}
