package day05_Variables_cont;

public class C06_Cube {
    public static void main(String[] args) {

/**
 * Create and declare 3 variables for given dimensions   / 3 tane variable olusturun ve deklare edin. kup
 * • Print each of them in the console                    /  asagidaki oranlari belirleyip yazdirin.
 * • Print the formula of rectangular                     /  asagida kup yerine prizma hesapladik!
 * volume parallelepiped via using
 * variables (Do not calculate !! )
 * (Volume =Length × Width × Height)                       / uzunluk,genislik,yukseklik
 */


        double lenght, width, height;

        lenght = 6;                                   //uzunluk
        width = 3;                                    //genislik
        height = 8;                                   //yukseklik


        System.out.println(lenght + ":" + width + " :" + height);

        double volume = lenght * width * height;                  //hacim hesaplama
        System.out.println("prizmanin hacmi:" + volume);

        // veriablenin ismini olustururken buyuk ve kucuk harfler disinda _ alt cizgi ve $ dolar isareti kullanilir.
        // yasakli kelimeleri veriable ye adlandiramazsin. yazdiginda kirmizi  ile uyari veriyor! adi degistir!!!

    }

}


