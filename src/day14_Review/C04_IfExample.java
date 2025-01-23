package day14_Review;

import java.util.Scanner;

public class C04_IfExample {
    public static void main(String[] args) {
        // verilen degerine gore mevsimi tespit eden kod yaziniz
        int ay = 3;
       if(ay>=1 && ay<=12){
           String mevsim = "";
           if (ay>=3 && ay<=5){
               mevsim ="ilkbahar";
           } else if (ay>=6 && ay<=8){
              mevsim ="Yaz";
           }else if (ay>=9 && ay<=11){
               mevsim = "sonbahar";
           }else if (ay>=12 && ay<=2){
               mevsim = "kis";
           }

       }else {
           System.out.println("Yanlis ay girdiniz.");
       }












      /*  if (ayAdi != "") {
            System.out.println("Aylardan  " + ayAdi + "'dir. Ve " + mevsimAdi + "'dir.");
        }
        */
    }
}
