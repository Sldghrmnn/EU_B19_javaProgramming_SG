package day31_Arrays02;

public class C03_IsimBul {
    public static void main(String[] args) {
 // Verilen isim dizisi icerisinde 'A' harfi ile baslayanlari
// for each kullanarak tespit edip bastiran bir code yaziniz

        String [] isimler = {"Ahmet","Yasemin","Alper","Suleyman","Deniz","Elif","Asya"};

        for (String isim :isimler ) {
        	if (isim.startsWith("A")){
                System.out.println(isim);
            }
        }

    }
}
