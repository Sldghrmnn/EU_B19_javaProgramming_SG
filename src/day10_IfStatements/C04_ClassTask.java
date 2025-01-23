package day10_IfStatements;

import java.util.Scanner;

public class C04_ClassTask {
    public static void main(String[] args) {

        /*
          fizik, kimya, matematik ve geçme notlarını konsoldan alın
          ortalamayı hessaplayın
          geçti ise "Tebrikler geçtiniz"
          kaldi ise "Ders tekrarı gerekmektedir."
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Ders notlari giriniz : ");

        System.out.println("Fizik : ");
        double fizik = input.nextDouble();

        System.out.println("Kimya : ");
        double kimya = input.nextDouble();

        System.out.println("Matematik : ");
        double matematik = input.nextDouble();

        System.out.println("Gecme notu : ");
        double gecmeNotu = input.nextDouble();


        double ort = (fizik + kimya + matematik) / 3;
        System.out.println("ort = " + ort);

        if (ort > gecmeNotu) {
            System.out.println("Tebrikler gectiniz");

        } else {
            System.out.println("Sinif tekrari gerekmektedir");

        }
                System.out.println("Program bitti.");

        }
    }

